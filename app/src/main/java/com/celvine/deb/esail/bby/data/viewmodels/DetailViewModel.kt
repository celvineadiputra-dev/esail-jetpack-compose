package com.celvine.deb.esail.bby.data.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.repositories.CoursesRepository
import com.celvine.deb.esail.bby.data.repositories.DetailRepository
import com.celvine.deb.esail.bby.data.sources.CourseData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(private val repository: DetailRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<CourseModel>> =
        MutableStateFlow(UiState.Loading)

    val uiState: StateFlow<UiState<CourseModel>> get() = _uiState

    fun getById(id: Int) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(repository.getById(id = id))
        }
    }

    fun getDataById(id: Int): CourseModel {
        return repository.getById(id = id)
    }
}