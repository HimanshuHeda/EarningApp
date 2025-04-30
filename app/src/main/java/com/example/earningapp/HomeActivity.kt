package com.example.earningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class Homeactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeactivity)
        val Navcontroller = this.findNavController(R.id.fragmentContainerView)
        val bottomNav= findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setupWithNavController(Navcontroller)
    }

}