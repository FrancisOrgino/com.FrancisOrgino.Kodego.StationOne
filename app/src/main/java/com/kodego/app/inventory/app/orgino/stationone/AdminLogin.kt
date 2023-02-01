package com.kodego.app.inventory.app.orgino.stationone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodego.app.inventory.app.orgino.stationone.databinding.ActivityAdminLoginBinding

class AdminLogin : AppCompatActivity() {

    lateinit var binding: ActivityAdminLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.adminLoginButton.setOnClickListener {
            var adminUserName: String = binding.textAdminUserName.text.toString()
            var adminPassword: String = binding.textAdminPassword.text.toString()

            adminCredentials(adminUserName,adminPassword)
    }
}
    fun adminCredentials(adminUserName: String, adminPassword: String){

        val correctAdminUsername: String = "manager123"
        val correctAdminPassword: String = "admin123"
        if((correctAdminUsername == adminUserName) && (correctAdminPassword == adminPassword)){

            val intentAdminLogin = Intent (this,AdminInterface::class.java)
            startActivity(intentAdminLogin)
            finish()
            Toast.makeText(applicationContext,"ADMIN LOGGED IN",Toast.LENGTH_SHORT).show()

        }else{
            Toast.makeText(applicationContext,"INVALID USER",Toast.LENGTH_SHORT).show()

        }

    }

}