package com.example.gonzalez_marcos_examen3t

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusicViewModel : ViewModel() {
    var listadoDiscos=MutableLiveData(getAll())


    var listadoRock =MutableLiveData(getRock())
    var listadoBlues =MutableLiveData(getBlues())
    var listadoJazz =MutableLiveData(getJazz())







}