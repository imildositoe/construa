package com.example.construa.ui.projectos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProjectosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is projectos Fragment"
    }
    val text: LiveData<String> = _text
}