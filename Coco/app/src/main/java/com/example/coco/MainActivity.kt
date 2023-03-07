package com.example.coco

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener {
            val temp = findViewById<EditText>(R.id.editTextTextMultiLine)

            Toast.makeText(this@MainActivity, temp.text, Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }


    }
}