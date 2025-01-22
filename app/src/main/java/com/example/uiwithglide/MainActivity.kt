package com.example.uiwithglide

import android.os.Bundle
import android.transition.Slide
import android.widget.CheckBox
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.collection.emptyLongSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.slider.RangeSlider
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        let's make our programm more interactive
        val checkBox = findViewById<CheckBox>(R.id.checkbox)
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Checkbox is checked", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Checkbox is unchecked", Toast.LENGTH_LONG).show()

            }

        }
        val switchBox = findViewById<Switch>(R.id.switch1)
        switchBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Switch box is checked", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Switch box is unchecked", Toast.LENGTH_LONG).show()

            }

        }
        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Toggle button is checked", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Toggle button is unchecked", Toast.LENGTH_LONG).show()

            }

        }
        val slider = findViewById<Slider>(R.id.slider)
        slider.addOnChangeListener { _, value, _ ->
            Toast.makeText(this, "Slider value is $value", Toast.LENGTH_SHORT).show()

        }
        val rangeSlider = findViewById<RangeSlider>(R.id.rangeSlider)
        rangeSlider.addOnChangeListener { _, value, _ ->
            Toast.makeText(this, "Slider value is $value", Toast.LENGTH_SHORT).show()

        }
    }
}