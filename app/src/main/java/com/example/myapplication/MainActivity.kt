package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTimeButton()
    }

    private fun setTimeButton() {
        time_button.setOnClickListener{
            time_button.visibility= View.INVISIBLE
           //showMessage(getCurrentTime())
        }
        timer(period = 1000, initialDelay = 1000)
        {
            runOnUiThread {
                time_button.visibility = View.VISIBLE
            }
        }
    }


    private fun getCurrentTime():String{
        return Calendar.getInstance().getTime().toString()
    }
    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


}