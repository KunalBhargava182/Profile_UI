package com.example.profileapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.profileapp.databinding.ActivityProfileBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener { }
        binding.supportButton.setOnClickListener { }
        binding.btnEdit.setOnClickListener { }
        binding.cardVehicle.setOnClickListener { }
        binding.creditScoreSection.setOnClickListener { }
        binding.cashbackSection.setOnClickListener { }
        binding.bankBalanceSection.setOnClickListener { }
        binding.cashbackBalanceSection.setOnClickListener { }
        binding.coinsSection.setOnClickListener { }
        binding.referSection.setOnClickListener { }
        binding.allTransactionsSection.setOnClickListener { }
    }
}
