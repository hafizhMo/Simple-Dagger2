package com.hafizhmo.simpledagger2

class PrisonPresenter(private val repository: PrisonRepository){

    fun getData(){
        repository.load()
    }
}