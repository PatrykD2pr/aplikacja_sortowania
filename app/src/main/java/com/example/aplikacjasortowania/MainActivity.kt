package com.example.aplikacjasortowania

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //zmienne
        var btn = findViewById<Button>(R.id.run)
        var c1 = findViewById<TextView>(R.id.czas1)
        var c2 = findViewById<TextView>(R.id.czas2)
        var c3 = findViewById<TextView>(R.id.czas3)
        var c4 = findViewById<TextView>(R.id.czas4)
        var c5 = findViewById<TextView>(R.id.czas5)

        var wynik_wstaw = "0 1 2 3 4 5"
        var wynik_bubble = "0 1 2 3 4 5"
        var wynik_quick = "0 1 2 3 4 5"
        var wynik_heap = "0 1 2 3 4 5"
        var wynik_scal = "0 1 2 3 4 5"
        var nieposortowany = findViewById<TextView>(R.id.nieposortowany)

        var ile_r = findViewById<EditText>(R.id.ile_razy).text
        var ile_e = findViewById<EditText>(R.id.ile_elementow).text

        var wynik = findViewById<TextView>(R.id.wynik)

        var czas = 0

        btn.setOnClickListener {
            var ile_r = findViewById<EditText>(R.id.ile_razy).text.toString()
            var ile_e = findViewById<EditText>(R.id.ile_elementow).text.toString()

            var tab: ArrayList<Int> = ArrayList()

            for (i in 0..(Integer.parseInt(ile_e) - 1 ))
            {
                var los = Random.nextInt(0,100)
                tab.add(los)
            }
            nieposortowany.text = tab.toString()

            //sortowanie przez wstawianie
            var posortowana_wstaw: ArrayList<Int> = ArrayList()
            for (i in 0..Integer.parseInt(ile_r))
            {
                var j = i - 1
                while(j >= 0)
                {

                }
            }

            //sortowanie bąbelkowe
            var posortowana_bubble: ArrayList<Int> = ArrayList()

            //sortowanie szybkie
            var posortowana_quick: ArrayList<Int> = ArrayList()

            //sortowanie heapsort
            var posortowana_heap: ArrayList<Int> = ArrayList()

            //sortowanie przez scalanie
            var posortowana_scal: ArrayList<Int> = ArrayList()

        }
    }
}