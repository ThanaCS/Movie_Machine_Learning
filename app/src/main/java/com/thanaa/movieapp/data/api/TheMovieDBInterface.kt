package com.thanaa.movieapp.data.api

import com.thanaa.movieapp.data.vo.MovieDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface TheMovieDBInterface {


        @GET("movie/{movie_id}")
        fun getMovieDetails(@Path("movie_id") id:Int): Single<MovieDetails>

}