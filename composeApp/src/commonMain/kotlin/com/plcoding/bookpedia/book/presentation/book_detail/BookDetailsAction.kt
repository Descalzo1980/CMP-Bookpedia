package com.plcoding.bookpedia.book.presentation.book_detail

import com.plcoding.bookpedia.book.domain.Book

sealed interface BookDetailsAction {

    data object OnBackClick: BookDetailsAction
    data object OnFavoriteClick: BookDetailsAction
    data class OnSelectedBookChange(val book: Book): BookDetailsAction
}