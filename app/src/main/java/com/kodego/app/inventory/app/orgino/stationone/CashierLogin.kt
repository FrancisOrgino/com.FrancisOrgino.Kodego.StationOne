package com.kodego.app.inventory.app.orgino.stationone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodego.app.inventory.app.orgino.stationone.databinding.ActivityCashierLoginBinding

class CashierLogin : AppCompatActivity() {

    lateinit var binding:ActivityCashierLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCashierLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cashierLoginButton.setOnClickListener {
            var cashierUserName: String = binding.textCashierUserName.text.toString()
            var cashierPassword: String = binding.textCashierPassword.text.toString()

            cashierCredentials(cashierUserName,cashierPassword)

        }
    }


    fun cashierCredentials(cashierUserName: String, cashierPassword: String) {

        val correctCashierUsername: String = "junay123"
        val correctCashierPassword: String = "cashier123"
            if((correctCashierUsername == cashierUserName) && (correctCashierPassword == cashierPassword)){

                val intentCashierLogin = Intent (this,CashierInterface::class.java)
                startActivity(intentCashierLogin)
                finish()
                Toast.makeText(applicationContext,"CASHIER LOGGED IN",Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(applicationContext,"INVALID USER",Toast.LENGTH_SHORT).show()

            }

    }

}