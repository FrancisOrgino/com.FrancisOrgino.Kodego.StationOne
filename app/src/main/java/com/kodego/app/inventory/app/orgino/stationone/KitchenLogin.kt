package com.kodego.app.inventory.app.orgino.stationone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodego.app.inventory.app.orgino.stationone.databinding.ActivityKitchenLoginBinding

class KitchenLogin : AppCompatActivity() {

    lateinit var binding: ActivityKitchenLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKitchenLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kitchenLoginButton.setOnClickListener {
            var kitchenUserName: String = binding.textKitchenUserName.text.toString()
            var kitchenPassword: String = binding.textKitchenPassword.text.toString()

            kitchenCredentials(kitchenUserName,kitchenPassword)

    }
}
    fun kitchenCredentials(kitchenUserName:String, kitchenPassword: String){
        val correctKitchenUsername: String = "junjun123"
        val correctKitchenPassword: String = "kitchen123"
        if((correctKitchenUsername == kitchenUserName) && (correctKitchenPassword == kitchenPassword)){

            val intentKitchenLogin = Intent (this,KitchenInterface::class.java)
            startActivity(intentKitchenLogin)
            finish()
            Toast.makeText(applicationContext,"KITCHEN LOGGED IN", Toast.LENGTH_SHORT).show()

        }else{
            Toast.makeText(applicationContext,"INVALID USER", Toast.LENGTH_SHORT).show()

        }

    }
}