package com.plcoding.bookpedia.book.domain

data class Book(
    val id : String,
    val title: String,
    val image: String,
    val author: List<String>,
    val description: String?,
    val language: List<String>,
    val firstPublishYear: String?,
    val averageRating: Double?,
    val ratingCount: Int?,
    val numPage: Int?,
    val numEdition: Int
)
