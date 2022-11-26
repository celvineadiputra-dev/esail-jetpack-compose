package com.celvine.deb.esail.bby.data.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.repositories.CoursesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class PopularCourseViewModel(private val repository: CoursesRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<CourseModel>>> =
        MutableStateFlow(UiState.Loading)

    val uiState: StateFlow<UiState<List<CourseModel>>> get() = _uiState

    fun getPopular() {
        viewModelScope.launch {
            repository.getPopular().catch {
                _uiState.value = UiState.Error(it.message.toString())
            }.collect { popularCourses ->
                Log.i("TX", popularCourses.size.toString())
                _uiState.value = UiState.Success(popularCourses)
            }
        }
    }
}