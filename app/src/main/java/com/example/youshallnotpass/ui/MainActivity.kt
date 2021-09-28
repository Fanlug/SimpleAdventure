package com.example.youshallnotpass.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.youshallnotpass.R
import com.example.youshallnotpass.ui.Game.GAme

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        peepeepoopoo.setOnClickListener {
            val gameIntent = Intent(this, GAme::class.java)
            startActivity(gameIntent)
        }


    }

    val peepeepoopoo = Button(findViewById(R.id.peepeepoopoo))
}
