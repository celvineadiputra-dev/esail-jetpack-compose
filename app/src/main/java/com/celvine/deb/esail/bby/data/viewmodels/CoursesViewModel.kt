package com.celvine.deb.esail.bby.data.viewmodels

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.repositories.CoursesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class CoursesViewModel(private val repository: CoursesRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<CourseModel>>> =
        MutableStateFlow(UiState.Loading)

    val uiState: StateFlow<UiState<List<CourseModel>>> get() = _uiState

    private val _query = mutableStateOf("")

    val query: State<String> get() = _query

    fun getAll() {
        viewModelScope.launch {
            repository.getCourses().catch {
                _uiState.value = UiState.Error(it.message.toString())
            }.collect { courses ->
                _uiState.value = UiState.Success(courses)
            }
        }
    }

    fun search(query: String) {
        _query.value = query
        viewModelScope.launch {
            repository.searchCourse(query = _query.value).catch {
                _uiState.value = UiState.Error(it.message.toString())
            }.collect { result ->
                _uiState.value = UiState.Success(result)
            }
        }
    }

    fun removeQuery() {
        _query.value = ""
        this.getAll()
    }
}

