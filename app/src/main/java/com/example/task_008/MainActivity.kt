package com.example.task_008

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textTV: TextView
    private lateinit var loadButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textTV = findViewById(R.id.textTV)
        loadButton = findViewById(R.id.loadButton)
    }

    fun onLoadButtonClick(v: View) {
        val person = Person()

        val listString: List<String> = loadBook(person.text)

        textTV.text = ""
        for ( string in listString) {
            textTV.append(string + "\n")
        }
    }

    fun loadBook(text: String): List<String> {
        return  text.split(" ")
    }
}