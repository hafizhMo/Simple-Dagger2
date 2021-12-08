package com.hafizhmo.simpledagger2

import android.content.Context

class PrisonPresenter(private val context: Context){

    private val repository = PrisonRepository(context)

    fun getData(){
        repository.load()
    }
}