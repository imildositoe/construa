package com.example.construa.ui.material

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MaterialViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Material Fragment"
    }
    val text: LiveData<String> = _text
}