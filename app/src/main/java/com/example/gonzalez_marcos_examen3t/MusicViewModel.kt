package com.example.gonzalez_marcos_examen3t

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusicViewModel (application: Application) : AndroidViewModel(application) {

    var listadoDiscos=MutableLiveData(getAll())

    var listadoRock =MutableLiveData(getRock())
    var listadoBlues =MutableLiveData(getBlues())
    var listadoJazz =MutableLiveData(getJazz())


    fun reiniciar(){
        listadoRock.postValue(getRock())
        listadoBlues.postValue(getBlues())
        listadoJazz.postValue(getJazz())
    }



}