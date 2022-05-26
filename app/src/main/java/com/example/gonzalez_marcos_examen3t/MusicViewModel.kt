package com.example.gonzalez_marcos_examen3t

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusicViewModel : ViewModel() {
    var genre = MutableLiveData("")
    var listadoDiscos=MutableLiveData(getAll())






}