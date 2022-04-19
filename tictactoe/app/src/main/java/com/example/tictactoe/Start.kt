package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
class Start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)
        Toast.makeText(this,"Welcome to TicTacToe!",Toast.LENGTH_SHORT).show()
        val name1 = findViewById<EditText>(R.id.name1)
        val name2 = findViewById<EditText>(R.id.name2)
        val startGame = findViewById<Button>(R.id.startGame)
        startGame.setOnClickListener {
            var str1 = name1.text.toString()
            if (str1 == "") {
                str1 = "Player 1"
            }
            var str2 = name2.text.toString()
            if (str2 == "") {
                str2 = "Player 2"
            }
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("name1",str1)
                putExtra("name2",str2)
            }
            startActivity(intent)
        }
        val startAi = findViewById<Button>(R.id.startAi)
        startAi.setOnClickListener {
            Toast.makeText(this,"Not implemented",Toast.LENGTH_SHORT).show()
        }
    }
}