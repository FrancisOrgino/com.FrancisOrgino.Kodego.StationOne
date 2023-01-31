package com.kodego.app.inventory.app.orgino.stationone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodego.app.inventory.app.orgino.stationone.databinding.ActivityAdminInterfaceBinding
import com.kodego.app.inventory.app.orgino.stationone.databinding.ActivityMainBinding

class AdminInterface : AppCompatActivity() {

    lateinit var binding: ActivityAdminInterfaceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminInterfaceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddItem.setOnClickListener {
            val intentAdminAddItemPage = Intent (this, AdminAddItem::class.java)
            startActivity(intentAdminAddItemPage)
        }
        binding.btnAddTable.setOnClickListener {
            val intentAdminAddTable = Intent (this, AdminAddTable::class.java)
            startActivity(intentAdminAddTable)
        }
        binding.btnEditItem.setOnClickListener {
            val intentAdminEditItem = Intent(this,AdminEditItem::class.java)
            startActivity(intentAdminEditItem)
        }
    }
}