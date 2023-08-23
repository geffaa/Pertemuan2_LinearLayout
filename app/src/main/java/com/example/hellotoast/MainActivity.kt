package com.example.hellotoast

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import com.example.hellotoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            txtNumber.text = number.toString()
            btnCount.setOnClickListener {
                number++
                txtNumber.text = number.toString()
            }
            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, "Count $number",
                Toast.LENGTH_SHORT).show()
            }
        }
    }
}