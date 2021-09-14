package com.mtnacademy.kotlincrudapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.mtnacademy.kotlincrudapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val _createData = findViewById<Button>(R.id.creatData)
        val _readData = findViewById<Button>(R.id.readData)
        val _updateData = findViewById<Button>(R.id.updateData)

        _createData.setOnClickListener {

            startActivity(Intent(this, CreateData::class.java))
        }

        _readData.setOnClickListener {

            startActivity(Intent(this, ReadData::class.java))
        }


        _updateData.setOnClickListener {

            startActivity(Intent(this, UpdateData::class.java))
        }




    }
}