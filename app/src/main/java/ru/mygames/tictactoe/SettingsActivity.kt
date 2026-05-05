package ru.mygames.tictactoe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mygames.tictactoe.databinding.SettingsActivityBinding

class SettingsActivity: AppCompatActivity() {

    private lateinit var binding: SettingsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SettingsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}