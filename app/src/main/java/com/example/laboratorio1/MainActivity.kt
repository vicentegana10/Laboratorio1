package com.example.laboratorio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.text.toFloatOrNull as toFloatOrNull1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var number1 = Float.Companion

    fun printTitle(view: View) {
        val button : Button = findViewById<Button>(view.id)
        textView.text = textView.text.toString() + button.text.toString()
    }

    fun getAnswer(view: View){
        val button : Button = findViewById<Button>(view.id)
        textView.text = "no pude pasarlo a float o int el string"
    }

}


