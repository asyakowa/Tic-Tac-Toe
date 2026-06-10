package ru.mygames.tictactoe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mygames.tictactoe.databinding.GameActivityBinding

class GameActivity  : AppCompatActivity() {

    private lateinit var binding: GameActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GameActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.returnButton.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }
        binding.menuButton.setOnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.popup_menu, null)
            val dialog = androidx.appcompat.app.AlertDialog.Builder(this)
                .setView(dialogView)
                .create()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
            dialog.show()
        }

    }

}