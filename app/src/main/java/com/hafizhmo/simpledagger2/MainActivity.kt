package com.hafizhmo.simpledagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: PrisonPresenter

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button_hello)
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build().inject(this)

        button.setOnClickListener {
            presenter.getData()
        }
    }
}