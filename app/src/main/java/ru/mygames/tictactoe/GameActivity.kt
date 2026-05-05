package ru.mygames.tictactoe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mygames.tictactoe.databinding.GameActivityBinding

class GameActivity  : AppCompatActivity() {

    private lateinit var binding: GameActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GameActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}