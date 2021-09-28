package com.example.youshallnotpass.Game

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.youshallnotpass.R

class GAme : AppCompatActivity() {

    enum class Directions {
        NORTH, SOUTH, EAST, WEST, START, END
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val path = mutableListOf<Directions>(Directions.START)
        val scroll = TextView(findViewById(R.id.Scroll))
        val South = Button(findViewById(R.id.south))
        val North = Button(findViewById(R.id.north))
        val West = Button(findViewById(R.id.west))
        val East = Button(findViewById(R.id.east))
        val End = Button(findViewById(R.id.end))
        val Start = Button(findViewById(R.id.start))

        setContentView(R.layout.game)
        val start = {
            path.add(Directions.START)
            scroll.text = "Play\n"

        }
        val north = {
            path.add(Directions.NORTH)
            scroll.text = scroll.text.toString() + "\nnorth"
        }
        val south = {
            path.add(Directions.SOUTH)
            scroll.text = scroll.text.toString() + "\nsouth"
        }

        val west = {
            path.add(Directions.WEST)
            scroll.text = scroll.text.toString() + "\nwest"
        }

        val east = {
            path.add(Directions.EAST)
            scroll.text = scroll.text.toString() + "\neast"
        }
        val end = {
            path.add(Directions.END)
            scroll.text = scroll.text.toString() + "Game Over \n Path\n" + path
            path.clear()

        }
        North.setOnClickListener {
            north
        }
        East.setOnClickListener {
            east
        }
        West.setOnClickListener {
            west
        }
        South.setOnClickListener {
            south
        }
        End.setOnClickListener {
            end
        }
        Start.setOnClickListener {
            start
        }

    }
}
