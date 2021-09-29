package com.example.youshallnotpass.ui.Game

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youshallnotpass.databinding.ActivityMainBinding

open class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.peepeepoopoo.setOnClickListener {
            val gameIntent = Intent(this, GAme::class.java)
            startActivity(gameIntent)
        }


    }


}
