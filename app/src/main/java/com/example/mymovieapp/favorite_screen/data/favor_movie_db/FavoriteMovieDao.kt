package com.example.mymovieapp.favorite_screen.data.favor_movie_db

import androidx.room.*
import com.example.mymovieapp.favorite_screen.domain.models.FavoriteMovie


@Dao
interface FavoriteMovieDao {
    @Insert
    suspend fun addNewMovie(movie: FavoriteMovie)

    @Update
    suspend fun updateMovie(movie: FavoriteMovie)

    @Delete
    suspend fun deleteMovie(movie: FavoriteMovie)

    @Query("select * from favor_movie_database")
    suspend fun getAllMovie(): MutableList<FavoriteMovie>

    @Query("select * from favor_movie_database where id == :movieId")
    suspend fun getMovie(movieId: Int): FavoriteMovie
}
