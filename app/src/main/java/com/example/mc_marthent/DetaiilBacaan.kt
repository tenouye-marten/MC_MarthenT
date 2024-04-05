package com.example.mc_marthent

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetaiilBacaan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_detaiil_bacaan)

        val gambar : ImageView = findViewById(R.id.imgdetail)
        val judul : TextView = findViewById(R.id.juduldetail)
        val ayat : TextView = findViewById(R.id.ayatdetail)
        val detaill : TextView = findViewById(R.id.detail)


        val bundle: Bundle?= intent.extras
        val bJudul = bundle!!.getString("jdl")
        val bGambar = bundle.getInt("img")
        val  bAyat = bundle.getString("ayt")
        val bDetail = bundle.getString("dtl")


        gambar.setImageResource(bGambar)
        judul.text = bJudul
        ayat.text = bAyat
        detaill.text = bDetail


        }
    }
