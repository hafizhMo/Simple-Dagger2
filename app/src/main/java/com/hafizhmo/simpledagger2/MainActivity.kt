package com.hafizhmo.simpledagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var presenter: PrisonPresenter
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button_hello)

        presenter = PrisonPresenter(PrisonRepository(this))

        button.setOnClickListener {
            presenter.getData()
        }
    }
}