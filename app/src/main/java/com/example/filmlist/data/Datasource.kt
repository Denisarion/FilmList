package com.example.filmlist.data

import com.example.filmlist.R
import com.example.filmlist.model.Film

class Datasource {
    fun loadFilm(): List<Film> {
        return listOf<Film>(
            Film(R.string.film1),
            Film(R.string.film2),
            Film(R.string.film3),
            Film(R.string.film4),
            Film(R.string.film5),
            Film(R.string.film6),
            Film(R.string.film7),
            Film(R.string.film8),
            Film(R.string.film9),
            Film(R.string.film10)
        )
    }
}