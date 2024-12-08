package com.plcoding.bookpedia.book.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchBookDto(
    @SerialName("key") val id: String,
    @SerialName("title")val title: String,
    @SerialName("language")val language: List<String>? = null,
    @SerialName("cover_i") val coverAlternativeKey: Int? = null,
    @SerialName("author_key") val authorKeys: List<String>? = null,
    @SerialName("author_name") val authorNames: List<String>? = null,
    @SerialName("cover_edition_key") val coverKey: String? = null,
    @SerialName("first_publish_year") val firstPublishYear : Double? = null,
    @SerialName("rating_average") val ratingAverage : Double? = null,
    @SerialName("rating_count") val ratingCount : Int? = null,
    @SerialName("number_of_pages_median") val numPagesMedian : Int? = null,
    @SerialName("edition_count") val numEditions : Int? = null
)
