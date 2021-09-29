package com.example.youshallnotpass.ui.Game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.youshallnotpass.databinding.GameBinding

class GAme : AppCompatActivity() {

    enum class Directions {
        NORTH, SOUTH, EAST, WEST, START, END
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val gameBinding = GameBinding.inflate(layoutInflater)
        val path = mutableListOf<Directions>(Directions.START)

        setContentView(gameBinding.root)

        val start = {
            path.add(Directions.START)
            gameBinding.Scroll.text = "Play\n"

        }
        val north = {
            path.add(Directions.NORTH)
            gameBinding.Scroll.text = gameBinding.Scroll.text.toString() + "\nnorth"
        }
        val south = {
            path.add(Directions.SOUTH)
            gameBinding.Scroll.text = gameBinding.Scroll.text.toString() + "\nsouth"
        }

        val west = {
            path.add(Directions.WEST)
            gameBinding.Scroll.text = gameBinding.Scroll.text.toString() + "\nwest"
        }

        val east = {
            path.add(Directions.EAST)
            gameBinding.Scroll.text = gameBinding.Scroll.text.toString() + "\neast"
        }
        val end = {
            path.add(Directions.END)
            gameBinding.Scroll.text =
                gameBinding.Scroll.text.toString() + "Game Over \n Path\n" + path
            path.clear()

        }
        gameBinding.north.setOnClickListener {
            north
        }
        gameBinding.east.setOnClickListener {
            east
        }
        gameBinding.west.setOnClickListener {
            west
        }
        gameBinding.south.setOnClickListener {
            south
        }
        gameBinding.end.setOnClickListener {
            end
        }
        gameBinding.start.setOnClickListener {
            start
        }

    }
}
