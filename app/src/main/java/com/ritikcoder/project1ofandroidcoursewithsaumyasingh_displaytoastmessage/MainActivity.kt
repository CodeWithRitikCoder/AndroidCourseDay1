package com.ritikcoder.project1ofandroidcoursewithsaumyasingh_displaytoastmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDownloading= findViewById<Button>(R.id.buttonForDownloading)
        val buttonUploading= findViewById<Button>(R.id.buttonForUploading)

        buttonDownloading.setOnClickListener(){
            Toast.makeText(applicationContext, "Downloading..", Toast.LENGTH_SHORT).show()
        }
        buttonUploading.setOnClickListener(){
            Toast.makeText(applicationContext, "Uploading..", Toast.LENGTH_SHORT).show()
        }

    }
}