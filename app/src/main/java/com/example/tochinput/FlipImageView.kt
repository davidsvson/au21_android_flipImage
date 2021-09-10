package com.example.tochinput

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.appcompat.widget.AppCompatImageView

class FlipImageView @JvmOverloads constructor(context : Context,
                    attrs: AttributeSet? =null,
                    defStyleAttr: Int = 0,
                    var onDownImage : Int? =null,
                    var defaultImage : Drawable? = null
                    ) : AppCompatImageView(context, attrs, defStyleAttr) {

    init {
        defaultImage = drawable
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action) {
           MotionEvent.ACTION_DOWN -> {
               if (onDownImage != null) {
                   setImageResource(onDownImage!!)
               }
           }
            MotionEvent.ACTION_UP -> {
                if (defaultImage != null) {
                    setImageDrawable(defaultImage!!)
                }
            }
        }
        return true
    }
}