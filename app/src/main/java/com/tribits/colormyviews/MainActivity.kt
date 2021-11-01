package com.tribits.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setlisteners()
    }
    private fun setlisteners() {
        val boxOne = findViewById<TextureView>(R.id.box_one_text) as TextView
        val boxTwo = findViewById<TextureView>(R.id.box_two_text) as TextView
        val boxThree = findViewById<TextureView>(R.id.box_three_text) as TextView
        val boxFour = findViewById<TextureView>(R.id.box_four_text) as TextView
        val boxFive = findViewById<TextureView>(R.id.box_five_text) as TextView
        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraint_layout)
        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val clickableViews: List<View> =
            listOf(boxOne, boxTwo, boxThree, boxFour, boxFive, constraintLayout, redButton, greenButton, yellowButton)

        for (item in clickableViews) {
            item.setOnClickListener {makeColored(it)}
        }
    }

    private
    fun makeColored(view: View) {
        val boxThree = findViewById<TextureView>(R.id.box_three_text) as TextView
        val boxFour = findViewById<TextureView>(R.id.box_four_text) as TextView
        val boxFive = findViewById<TextureView>(R.id.box_five_text) as TextView
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.green_light))
            R.id.box_four_text -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.green_dark))
            R.id.box_five_text -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.green_light))

            R.id.red_button -> boxThree.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxFour.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}