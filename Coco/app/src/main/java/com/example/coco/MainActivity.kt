package com.example.coco

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bundle = intent.getBundleExtra("extras");
println(bundle?.getByteArray("img"))
        findViewById<Button>(R.id.denuncia).setOnClickListener {
            val temp = findViewById<EditText>(R.id.editTextTextMultiLine)

            Toast.makeText(this@MainActivity, temp.text, Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.foto).setOnClickListener {
            startActivity(Intent(this@MainActivity, PictureActivity::class.java))
        }


    }
}