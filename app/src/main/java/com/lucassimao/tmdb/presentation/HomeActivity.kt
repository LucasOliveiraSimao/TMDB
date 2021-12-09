package com.lucassimao.tmdb.presentation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.lucassimao.tmdb.R
import com.lucassimao.tmdb.presentation.di.Injector
import com.lucassimao.tmdb.presentation.movie.MovieAdapter
import com.lucassimao.tmdb.presentation.movie.MovieViewModel
import com.lucassimao.tmdb.presentation.movie.MovieViewModelFactory
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: MovieViewModelFactory
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var adapter: MovieAdapter

    private lateinit var binding: ActivityMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

        (application as Injector).createMovieSubComponent()
            .inject(this)

        movieViewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]

        initRecyclerViewMovie()
    }

    private fun initRecyclerViewMovie() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = MovieAdapter()
        binding.recyclerViewPopularMovies.adapter = adapter

        displayPopularMovies()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun displayPopularMovies() {
        binding.progressBar.visibility = View.VISIBLE
        val responseLiveData = movieViewModel.getMovies()
        responseLiveData.observe(this, {
            if (it != null) {
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.progressMovie.visibility = View.GONE
            } else {
                binding.progressMovie.visibility = View.GONE
                Toast.makeText(applicationContext, "Dados Não Disponíveis", Toast.LENGTH_SHORT)
                    .show()
            }
        })
    }
}