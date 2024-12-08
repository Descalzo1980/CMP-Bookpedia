package com.plcoding.bookpedia.book.presentation.book_detail

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookDetailViewModel: ViewModel() {

    private val _state = MutableStateFlow(BookDetailsState())
    val state = _state.asStateFlow()

    fun onAction(action: BookDetailsAction){
        when(action){
            BookDetailsAction.OnFavoriteClick -> {

            }
            is BookDetailsAction.OnSelectedBookChange -> {
                _state.update { it.copy(
                    book = action.book
                ) }
            }
            else -> Unit
        }
    }
}