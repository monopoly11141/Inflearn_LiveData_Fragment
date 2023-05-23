package com.example.inflearn_livedata_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.inflearn_livedata_fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btn1.setOnClickListener {
            changeFragmentContainerViewMain(FirstFragment())
        }

        binding.btn2.setOnClickListener {
            changeFragmentContainerViewMain(SecondFragment())
        }
    }

    private fun changeFragmentContainerViewMain(fragment : Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fcvMain, fragment).commit()
    }
}