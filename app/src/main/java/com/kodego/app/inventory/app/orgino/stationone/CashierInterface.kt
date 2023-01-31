package com.kodego.app.inventory.app.orgino.stationone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodego.app.inventory.app.orgino.stationone.databinding.ActivityCashierInterfaceBinding

class CashierInterface : AppCompatActivity() {

    lateinit var binding: ActivityCashierInterfaceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCashierInterfaceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCreateOrder.setOnClickListener {
            val intentCreateOrder = Intent (this,CashierOrder::class.java)
            startActivity(intentCreateOrder)
        }
        binding.btnCheckOut.setOnClickListener {
            val intentCheckOut = Intent (this, CashierCheckOut::class.java)
            startActivity(intentCheckOut)
        }
    }
}