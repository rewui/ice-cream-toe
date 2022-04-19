package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var gameState = true
        val table = Array(3) {IntArray(3)}
        var turn = 0
        val sq1 = findViewById<Button>(R.id.sq1)
        sq1.setOnClickListener {
            if(gameState) {
                if (turn % 2 == 0) {
                    sq1.setBackgroundResource(R.drawable.cross)
                    table[0][0] = 1
                } else {
                    sq1.setBackgroundResource(R.drawable.circle)
                    table[0][0] = 2
                }
                sq1.isEnabled = false
                gameState = result(table, turn)
                turn++
            } else {
                sq1.isEnabled = false
            }
        }
        val sq2 = findViewById<Button>(R.id.sq2)
        sq2.setOnClickListener {
            if(gameState) {
                if (turn % 2 == 0) {
                    sq2.setBackgroundResource(R.drawable.cross)
                    table[0][1] = 1
                } else {
                    sq2.setBackgroundResource(R.drawable.circle)
                    table[0][1] = 2
                }
                sq2.isEnabled = false
                gameState = result(table, turn)
                turn++
            } else {
                sq2.isEnabled = false
            }
        }
        val sq3 = findViewById<Button>(R.id.sq3)
        sq3.setOnClickListener {
            if(gameState) {
                if (turn % 2 == 0) {
                    sq3.setBackgroundResource(R.drawable.cross)
                    table[0][2] = 1
                } else {
                    sq3.setBackgroundResource(R.drawable.circle)
                    table[0][2] = 2
                }
                sq3.isEnabled = false
                gameState = result(table, turn)
                turn++
            } else {
                sq3.isEnabled = false
            }
        }
        val sq4 = findViewById<Button>(R.id.sq4)
        sq4.setOnClickListener {
            if(gameState) {
                if (turn % 2 == 0) {
                    sq4.setBackgroundResource(R.drawable.cross)
                    table[1][0] = 1
                } else {
                    sq4.setBackgroundResource(R.drawable.circle)
                    table[1][0] = 2
                }
                sq4.isEnabled = false
                gameState = result(table, turn)
                turn++
            } else {
                sq4.isEnabled = false
            }
        }
        val sq5 = findViewById<Button>(R.id.sq5)
        sq5.setOnClickListener {
            if(gameState) {
                if (turn % 2 == 0) {
                    sq5.setBackgroundResource(R.drawable.cross)
                    table[1][1] = 1
                } else {
                    sq5.setBackgroundResource(R.drawable.circle)
                    table[1][1] = 2
                }
                sq5.isEnabled = false
                gameState = result(table, turn)
                turn++
            } else {
                sq5.isEnabled = false
            }
        }
        val sq6 = findViewById<Button>(R.id.sq6)
        sq6.setOnClickListener {
            if(gameState) {
                if (turn % 2 == 0) {
                    sq6.setBackgroundResource(R.drawable.cross)
                    table[1][2] = 1
                } else {
                    sq6.setBackgroundResource(R.drawable.circle)
                    table[1][2] = 2
                }
                sq6.isEnabled = false
                gameState = result(table, turn)
                turn++
            } else {
                sq6.isEnabled = false
            }
        }
        val sq7 = findViewById<Button>(R.id.sq7)
        sq7.setOnClickListener {
            if(gameState) {
                if (turn % 2 == 0) {
                    sq7.setBackgroundResource(R.drawable.cross)
                    table[2][0] = 1
                } else {
                    sq7.setBackgroundResource(R.drawable.circle)
                    table[2][0] = 2
                }
                sq7.isEnabled = false
                gameState = result(table, turn)
                turn++
            } else {
                sq7.isEnabled = false
            }
        }
        val sq8 = findViewById<Button>(R.id.sq8)
        sq8.setOnClickListener {
            if(gameState) {
                if (turn % 2 == 0) {
                    sq8.setBackgroundResource(R.drawable.cross)
                    table[2][1] = 1
                } else {
                    sq8.setBackgroundResource(R.drawable.circle)
                    table[2][1] = 2
                }
                sq8.isEnabled = false
                gameState = result(table, turn)
                turn++
            } else {
                sq8.isEnabled = false
            }
        }
        val sq9 = findViewById<Button>(R.id.sq9)
        sq9.setOnClickListener {
            if(gameState) {
                if (turn % 2 == 0) {
                    sq9.setBackgroundResource(R.drawable.cross)
                    table[2][2] = 1
                } else {
                    sq9.setBackgroundResource(R.drawable.circle)
                    table[2][2] = 2
                }
                sq9.isEnabled = false
                gameState = result(table, turn)
                turn++
            } else {
                sq9.isEnabled = false
            }
        }
        val restart = findViewById<Button>(R.id.restart)
        restart.setOnClickListener {
            finish()
            overridePendingTransition(0, 0)
            startActivity(intent)
            overridePendingTransition(0, 0)
            //https://stackoverflow.com/a/38720750 how to remove flashing restart
        }
        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this, Start::class.java)
            startActivity(intent)
        }
    }

    private fun result(table: Array<IntArray>, turn: Int): Boolean {
        if ((table[2][0] == 1 && table[2][1] == 1 && table[2][2] == 1)||
            (table[1][0] == 1 && table[1][1] == 1 && table[1][2] == 1)||
            (table[0][0] == 1 && table[0][1] == 1 && table[0][2] == 1)||
            (table[0][0] == 1 && table[1][0] == 1 && table[2][0] == 1)||
            (table[0][1] == 1 && table[1][1] == 1 && table[2][1] == 1)||
            (table[0][2] == 1 && table[1][2] == 1 && table[2][2] == 1)||
            (table[0][0] == 1 && table[1][1] == 1 && table[2][2] == 1)||
            (table[0][2] == 1 && table[1][1] == 1 && table[2][0] == 1)) {
            val name1 = intent.getStringExtra("name1")
            Toast.makeText(this,"$name1 wins!",Toast.LENGTH_LONG).show()
            return false
        } else if ((table[2][0] == 2 && table[2][1] == 2 && table[2][2] == 2)||
            (table[1][0] == 2 && table[1][1] == 2 && table[1][2] == 2)||
            (table[0][0] == 2 && table[0][1] == 2 && table[0][2] == 2)||
            (table[0][0] == 2 && table[1][0] == 2 && table[2][0] == 2)||
            (table[0][1] == 2 && table[1][1] == 2 && table[2][1] == 2)||
            (table[0][2] == 2 && table[1][2] == 2 && table[2][2] == 2)||
            (table[0][0] == 2 && table[1][1] == 2 && table[2][2] == 2)||
            (table[0][2] == 2 && table[1][1] == 2 && table[2][0] == 2)){
            val name2 = intent.getStringExtra("name2")
            Toast.makeText(this,"$name2 wins!",Toast.LENGTH_LONG).show()
            return false
        } else if (turn == 8){
            Toast.makeText(this,"Draw",Toast.LENGTH_LONG).show()
            return false
        } else {
            return true
        }
    }
}