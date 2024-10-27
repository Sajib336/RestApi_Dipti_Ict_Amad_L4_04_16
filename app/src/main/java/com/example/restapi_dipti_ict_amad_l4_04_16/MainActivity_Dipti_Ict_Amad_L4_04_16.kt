package com.example.restapi_dipti_ict_amad_l4_04_16

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity_Dipti_Ict_Amad_L4_04_16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dipti_ict_amad_l4_04_16)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@MainActivity_Dipti_Ict_Amad_L4_04_16,ProductActivity_Dipti_Ict_Amad_L4_04_16::class.java))
            finish()
        }, 2500)
    }
}