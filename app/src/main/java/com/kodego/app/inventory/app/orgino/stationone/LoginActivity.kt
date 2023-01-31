package com.kodego.app.inventory.app.orgino.stationone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodego.app.inventory.app.orgino.stationone.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCashierLogin.setOnClickListener {
            val intentCashierLogin = Intent (this,CashierLogin::class.java)
            startActivity(intentCashierLogin)
        }

        binding.btnKitchenLogin.setOnClickListener {
            val intentKitchenLogin = Intent(this, KitchenLogin::class.java)
            startActivity(intentKitchenLogin)
        }

        binding.btnAdminLogin.setOnClickListener {
            val intentAdminLogin = Intent(this,KitchenLogin::class.java)
            startActivity(intentAdminLogin)
        }
    }
}