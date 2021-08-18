package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_0.setOnClickListener { setTextToMath("0") }
        btn_1.setOnClickListener { setTextToMath("1") }
        btn_2.setOnClickListener { setTextToMath("2") }
        btn_3.setOnClickListener { setTextToMath("3") }
        btn_4.setOnClickListener { setTextToMath("4") }
        btn_5.setOnClickListener { setTextToMath("5") }
        btn_6.setOnClickListener { setTextToMath("6") }
        btn_7.setOnClickListener { setTextToMath("7") }
        btn_8.setOnClickListener { setTextToMath("8") }
        btn_9.setOnClickListener { setTextToMath("9") }
        btn_dot.setOnClickListener { setTextToMath(".") }
        delenie.setOnClickListener { setTextToMath("/") }
        proizvedenie.setOnClickListener { setTextToMath("*") }
        vichitanie.setOnClickListener { setTextToMath("-") }
        summa.setOnClickListener { setTextToMath("+") }
    }

    fun setTextToMath(str: String) {
        math_word.append(str)
    }
}