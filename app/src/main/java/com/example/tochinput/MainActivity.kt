package com.example.tochinput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animalView = findViewById<ImageView>(R.id.animalImageView)
        val flipImage = findViewById<FlipImageView>(R.id.flipImage)

        flipImage.onDownImage = R.drawable.dog

        animalView.setOnTouchListener { v , event ->

            when(event?.action) {
                MotionEvent.ACTION_UP -> {
                    animalView.setImageResource((R.drawable.cat))
                }
                MotionEvent.ACTION_DOWN -> {
                    animalView.setImageResource(R.drawable.dog)
                }
            }
            true
        }




        //animalView.setImageResource(R.drawable.dog)

    }


    /*
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        //Log.d("!!!", "Touch!")
        when( event?.action ) {
            MotionEvent.ACTION_DOWN -> {
                Log.d("!!!", "DOWN!")
            }
            MotionEvent.ACTION_UP -> {
                Log.d("!!!", "UP!")
            }
            MotionEvent.ACTION_MOVE -> {
                Log.d("!!!", "MOVE!")
            }
        }
        return super.onTouchEvent(event)
    }
*/


}