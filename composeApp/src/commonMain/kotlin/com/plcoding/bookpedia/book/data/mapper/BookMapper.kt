package com.plcoding.bookpedia.book.data.mapper

import com.plcoding.bookpedia.book.data.database.BookEntity
import com.plcoding.bookpedia.book.data.dto.SearchBookDto
import com.plcoding.bookpedia.book.domain.Book

fun SearchBookDto.toBook(): Book {
    return Book(
        id = id.substringAfterLast("/"),
        title = title,
        imageUrl = if(coverKey != null) {
            "https://covers.openlibrary.org/b/olid/${coverKey}-L.jpg"
        } else {
            "https://covers.openlibrary.org/b/id/${coverAlternativeKey}-L.jpg"
        },
        authors = authorNames ?: emptyList(),
        description = null,
        languages = languages ?: emptyList(),
        firstPublishYear = firstPublishYear.toString(),
        averageRating = ratingsAverage,
        ratingCount = ratingsCount,
        numPages = numPagesMedian,
        numEditions = numEditions ?: 0
    )
}

fun Book.toBookEntity(): BookEntity =
    BookEntity(
        id = id,
        title = title,
        description = description,
        language = languages,
        imageUrl = imageUrl,
        authors = authors,
        firstPublishYear = firstPublishYear,
        ratingAverage = averageRating,
        ratingCount = ratingCount,
        numPagesMedian = numPages,
        numEditions = numEditions
    )