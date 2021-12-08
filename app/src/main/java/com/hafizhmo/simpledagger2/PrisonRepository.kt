package com.hafizhmo.simpledagger2

import android.content.Context
import android.widget.Toast

class PrisonRepository(val context: Context) {

    fun load() {
        Toast.makeText(context, "Reading data..", Toast.LENGTH_SHORT).show()
    }

}
