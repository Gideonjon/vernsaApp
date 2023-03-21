package com.example.vernsa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        supportActionBar?.hide()
        var navController = findNavController(R.id.fragment)
        var bottomNavigationItemView = findViewById<BottomNavigationView>(R.id.nav_bars)

        bottomNavigationItemView.setupWithNavController(navController)


    }
}