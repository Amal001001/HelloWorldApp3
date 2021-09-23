package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
//import kotlin.random.Random
import java.util.Random
class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var textview: TextView
    lateinit var checkBox: CheckBox
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        checkBox = findViewById(R.id.checkBox)
        editText = findViewById(R.id.editText)

        button.setOnClickListener { checkboxchechecker() }
       // checkBox.setOnClickListener { ((checkBox), isChecked()) ->
            //checkBox.isSelected = isChecked }




        }
    fun changecolor(){
        val rnd = Random()
        val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
        textview.setTextColor(color)
        editText.setTextColor(color)
        button.setBackgroundColor(color)
    }
    fun checkboxchechecker(){
        if (checkBox.isChecked()) {changecolor()}
    }

}