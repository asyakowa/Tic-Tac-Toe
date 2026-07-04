package ru.mygames.tictactoe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mygames.tictactoe.databinding.GameActivityBinding
import ru.mygames.tictactoe.databinding.PopupMenuBinding

class GameActivity  : AppCompatActivity() {

    private lateinit var binding: GameActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GameActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.returnButton.setOnClickListener {
            finish()
        }
        binding.menuButton.setOnClickListener {
            val popupBinding = PopupMenuBinding.inflate(layoutInflater)

            val dialog = androidx.appcompat.app.AlertDialog.Builder(this)
                .setView(popupBinding.root)
                .create()
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
            dialog.show()
            popupBinding.continueBtn.setOnClickListener {
                dialog.dismiss()
            }

            popupBinding.settingsBtn.setOnClickListener {
                dialog.dismiss()
                val intent = Intent(this, SettingsActivity::class.java)
                startActivity(intent)
            }

            popupBinding.saveExitBtn.setOnClickListener {
                dialog.dismiss()
                finish()
            }

        }

    }

}