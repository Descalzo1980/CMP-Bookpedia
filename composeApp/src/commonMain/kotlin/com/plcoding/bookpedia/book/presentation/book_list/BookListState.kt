package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "",
        author = listOf("Captain Beard"),
        description = "Description $it",
        language = listOf("Language $it"),
        firstPublishYear = "Year $it",
        averageRating = 4.778999,
        ratingCount = 5,
        numPage = 100,
        numEdition = 3
    )
}
