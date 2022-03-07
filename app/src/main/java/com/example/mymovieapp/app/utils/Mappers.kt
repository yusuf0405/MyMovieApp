package com.example.mymovieapp.app

import com.example.mymovieapp.favorite_screen.domain.models.FavoriteMovie
import com.example.mymovieapp.favorite_screen.domain.models.FavoritePerson
import com.example.mymovieapp.movie_details_screen.domain.models.MovieDetails
import com.example.mymovieapp.person_details_screen.domain.models.PersonDetails

internal fun MovieDetails.toFavoriteMovies(): FavoriteMovie {
    return FavoriteMovie(
        id = id,
        posterPath = posterPath,
        releaseDate = releaseDate,
        title = title,
        rating = rating,
    )
}

internal fun PersonDetails.toFavoritePerson(): FavoritePerson {
    return FavoritePerson(
        adult = adult,
        biography = biography,
        birthday = biography,
        gender = gender,
        id = id,
        knownForDepartment = knownForDepartment,
        name = name,
        placeOfBirth = placeOfBirth,
        popularity = popularity,
        profilePath = profilePath,
    )
}

