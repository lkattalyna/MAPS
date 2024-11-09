package com.example.maps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.gms.maps.CameraUpdate
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
        // Find the button by its ID
        val mapsButton = findViewById<Button>(R.id.mapsButton)
        val cameraButton = findViewById<Button>(R.id.cameraButton)

        // Set click listener
        mapsButton.setOnClickListener {
            // Intent to navigate to SecondActivity
            val intent = Intent(this, GoogleMaps::class.java)
            startActivity(intent)
        }

        cameraButton.setOnClickListener {
            // Intent to navigate to SecondActivity
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }
    }

}