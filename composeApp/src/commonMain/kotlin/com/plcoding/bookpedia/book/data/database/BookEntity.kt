package com.plcoding.bookpedia.book.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.bookpedia.core.presentation.UiText

@Entity
data class BookEntity (
    @PrimaryKey(autoGenerate = false) val id: String,
    val title: String,
    val description: String?,
    val imageUrl: String?,
    val language: List<String>,
    val authors: List<String>,
    val firstPublishYear: String?,
    val ratingAverage: Double?,
    val ratingCount: Int?,
    val numPagesMedian: Int?,
    val numEditions: Int
)
