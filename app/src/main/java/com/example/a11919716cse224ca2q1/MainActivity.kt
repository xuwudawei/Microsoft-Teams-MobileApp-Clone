package com.example.a11919716cse224ca2q1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userInput=findViewById<EditText>(R.id.emailPhoneSkypeInput)
        val  signInButton=findViewById<Button>(R.id.signInButton)
        val joinMeetButton=findViewById<Button>(R.id.joinMeetingButton)
        val signUpButton=findViewById<Button>(R.id.signUpButton)
        signInButton.setOnClickListener{
            val userDetail:String=userInput.text.toString()
            Toast.makeText(applicationContext,"You entered: "+userDetail,Toast.LENGTH_SHORT).show()
        }
    }
}