package com.revature.mvvmcomposev1.data.model

data class MovieResponse(
    var page:String,
    var results:List<MovieItem>
)