package com.example.basicphrases

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    fun playPhrase(view: View) {
        val buttonPressed = view as Button

        val audioFileName = buttonPressed.tag.toString()
        val mediaPlayer = MediaPlayer.create(
                this,
                resources.getIdentifier(audioFileName, "raw", packageName)
        )

        mediaPlayer.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}