package com.hafizhmo.simpledagger2

import javax.inject.Inject

class PrisonPresenter @Inject constructor(private val repository: PrisonRepository){
    fun getData(){
        repository.load()
    }
}