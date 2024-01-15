package com.jaewon.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jaewon.paintapp.PaintView.Companion.colorList
import com.jaewon.paintapp.PaintView.Companion.currentBrush
import com.jaewon.paintapp.PaintView.Companion.pathList
import com.jaewon.paintapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.redColor.setOnClickListener {
            Toast.makeText(this,"click",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        binding.blueColor.setOnClickListener {
            Toast.makeText(this,"click",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        binding.blackColor.setOnClickListener {
            Toast.makeText(this,"click",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        binding.eraser.setOnClickListener {
            Toast.makeText(this,"click",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
        setContentView(binding.root)
    }

    private fun currentColor(color:Int){
        currentBrush = color
        path = Path()
    }
}