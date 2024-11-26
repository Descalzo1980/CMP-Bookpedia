package com.plcoding.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar

@Preview(backgroundColor = 0xFFF0EAE2, showBackground = true)
@Composable
fun BookSearchBarPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ){
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = { },
            onImeSearch = { },
            modifier = Modifier.fillMaxWidth()
        )
    }
}
private val books = (1..100).map {
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

@Preview
@Composable
fun BookListPreview(){
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = { }
    )
}