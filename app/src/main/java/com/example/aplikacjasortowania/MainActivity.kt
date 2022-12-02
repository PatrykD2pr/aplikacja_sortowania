package com.example.aplikacjasortowania

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //zmienne
        var btn = findViewById<Button>(R.id.run)
        var c1 = findViewById<TextView>(R.id.czas1).text
        var c2 = findViewById<TextView>(R.id.czas2).text
        var c3 = findViewById<TextView>(R.id.czas3).text
        var c4 = findViewById<TextView>(R.id.czas4).text
        var c5 = findViewById<TextView>(R.id.czas5).text

        var ile_r = findViewById<EditText>(R.id.ile_razy).text
        var ile_e = findViewById<EditText>(R.id.ile_elementow).text

        var wynik = findViewById<TextView>(R.id.wynik).text

        var czas = 0

        //sortowanie przez wstawianie
        btn.setOnClickListener {


        }
        //sortowanie bąbelkowe
        btn.setOnClickListener {

        }
        //sortowanie szybkie
        btn.setOnClickListener {

        }
        //sortowanie heapsort
        btn.setOnClickListener {

        }
        //sortowanie przez scalanie
        btn.setOnClickListener {

        }
    }
}