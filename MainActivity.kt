package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        binding.btnHello.setOnClickListener {
//            var inputA = binding.inputA.text.toString().toInt()
//            var inputB = binding.inputB.text.toString().toInt()
//            var hasil = jumlah(inputA, inputB)
//            binding.tvHello.setText(hasil)
//        }
    }

//    fun jumlah(a: Int, b: Int): Int{
//        return a + b
//    }
}