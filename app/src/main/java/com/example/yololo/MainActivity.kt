package com.example.yololo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val SentenceCard = findViewById<CardView>(R.id.sentence_cardview)
        val VideoCard = findViewById<CardView>(R.id.video_cardview)

        SentenceCard.setOnClickListener {
            startActivity(Intent(this, Sentence_Reading::class.java))
        }

        VideoCard.setOnClickListener {
            startActivity(Intent(this, VideoView::class.java))
        }
    }
}