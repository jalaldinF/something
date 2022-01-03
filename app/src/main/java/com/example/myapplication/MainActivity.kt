package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_click_me.setOnClickListener(){
            val str: String = et_just.text.toString()
            startSec(str)
        }
    }
    fun startSec(str:String){
        val intent=Intent(applicationContext,SecondAct::class.java)
        intent.putExtra("massage",str)
        startActivity(intent)
    }
}