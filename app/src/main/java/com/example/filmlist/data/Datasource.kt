package com.example.filmlist.data

import com.example.filmlist.R
import com.example.filmlist.model.Film

class Datasource {
    fun loadFilm(): List<Film> {
        return listOf<Film>(
            Film(R.string.film1, R.drawable.the_godfather),
            Film(R.string.film2, R.drawable.the_dark_knight),
            Film(R.string.film3, R.drawable.pulp_fiction),
            Film(R.string.film4, R.drawable.fight_club),
            Film(R.string.film5, R.drawable.forrest_gump),
            Film(R.string.film6, R.drawable.inception),
            Film(R.string.film7, R.drawable.the_matrix),
            Film(R.string.film8, R.drawable.interstellar),
            Film(R.string.film9, R.drawable.the_green_mile),
            Film(R.string.film10, R.drawable.gladiator)
        )
    }
}