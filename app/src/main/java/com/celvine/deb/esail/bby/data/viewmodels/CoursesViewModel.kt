package com.celvine.deb.esail.bby.data.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.repositories.CoursesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CoursesViewModel(private val repository: CoursesRepository) : ViewModel() {
    private val _courses = MutableStateFlow(
        repository.getCourses()
    )

    val courses: StateFlow<List<CourseModel>> get() = _courses

    private val _query = mutableStateOf("")

    val query: State<String> get() = _query

    fun search(query: String) {
        _query.value = query
        _courses.value = repository.searchCourse(query = query)
    }

    fun removeQuery() {
        _query.value = ""
        _courses.value = repository.getCourses()
    }
}

class ViewModelFactory(private val repository: CoursesRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CoursesViewModel::class.java)) {
            return CoursesViewModel(repository) as T
        }
        throw  java.lang.IllegalArgumentException("Unknown View Model")
    }
}