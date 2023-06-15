package com.example.materi_2_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.materi_2_1.databinding.ActivityDisplayMessageBinding

class DisplayMessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayMessageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        binding.textView.text = message
    }
}

