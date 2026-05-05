package ru.mygames.tictactoe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mygames.tictactoe.databinding.StartActivityBinding
import kotlin.jvm.java

class StartActivity : AppCompatActivity() {

    private lateinit var binding: StartActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = StartActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toNewGame.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
        binding.toContinueGame.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }

        binding.toSettingsGame.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}