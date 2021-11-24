package com.example.bookhunter.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.bookhunter.database.SearchParamsDao
import com.example.bookhunter.database.entities.SearchParams

class SearchResultViewModelFactory(
    private val dataSource: SearchParamsDao,
    private val searchParams: SearchParams
) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SearchResultViewModel::class.java)) {
            return SearchResultViewModel(dataSource, searchParams) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}