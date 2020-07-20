package com.mupper.myfirstkotlinandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaItems = listOf(
            MediaItem("Title 1", "https://placekitten.com/2000/2000?image=1"),
            MediaItem("Title 2", "https://placekitten.com/2000/2000?image=2"),
            MediaItem("Title 3", "https://placekitten.com/2000/2000?image=3"),
            MediaItem("Title 4", "https://placekitten.com/2000/2000?image=4"),
            MediaItem("Title 5", "https://placekitten.com/2000/2000?image=5"),
            MediaItem("Title 6", "https://placekitten.com/2000/2000?image=6"),
            MediaItem("Title 7", "https://placekitten.com/2000/2000?image=7"),
            MediaItem("Title 8", "https://placekitten.com/2000/2000?image=8"),
            MediaItem("Title 9", "https://placekitten.com/2000/2000?image=9"),
            MediaItem("Title 10", "https://placekitten.com/2000/2000?image=10")
        )
        rcvPictures.adapter = MediaAdapter(mediaItems)
    }
}
