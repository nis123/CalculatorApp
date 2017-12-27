package com.example.nishanth.calculatorapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calc = Calc()
        var val1 : String = ""
        val state = true
        button1.setOnClickListener(){v -> input.setText(input.text.toString() + button1.text.toString());
            if(state)
                val1 += button1.text.toString();
        }
        button2.setOnClickListener(){v -> input.setText(input.text.toString() + button2.text.toString())}
        button3.setOnClickListener(){v -> input.setText(input.text.toString() + button3.text.toString())}
        button4.setOnClickListener(){v -> input.setText(input.text.toString() + button4.text.toString())}
        button5.setOnClickListener(){v -> input.setText(input.text.toString() + button5.text.toString())}
        button6.setOnClickListener(){v -> input.setText(input.text.toString() + button6.text.toString())}
        button7.setOnClickListener(){v -> input.setText(input.text.toString() + button7.text.toString())}
        button8.setOnClickListener(){v -> input.setText(input.text.toString() + button8.text.toString())}
        button9.setOnClickListener(){v -> input.setText(input.text.toString() + button9.text.toString())}
        button0.setOnClickListener(){v -> input.setText(input.text.toString() + button0.text.toString())}
    }
}
