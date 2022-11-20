package com.example.regestrationandlogin.logreg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.regestrationandlogin.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.Back_To_Register_text_view
import kotlinx.android.synthetic.main.activity_login.email_edittext_login
import kotlinx.android.synthetic.main.activity_login.password_edittext_login

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        val email = email_edittext_login.text.toString()
        val password = password_edittext_login.text.toString()

        Log.d("Login", "Attempt login with email/pw: $email/***")


        if(email.isEmpty() || password.isEmpty()){
            Toast.makeText(this,"Please write text in email/pw to login", Toast.LENGTH_SHORT).show()
            return
        }

        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
//          .addOnCompleteListener()
//          .add

        Back_To_Register_text_view.setOnClickListener {

            finish()
        }
    }
}