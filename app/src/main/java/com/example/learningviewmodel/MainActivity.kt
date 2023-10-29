package com.example.learningviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.learningviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       myViewModel= ViewModelProvider(this).get(MyViewModel::class.java)

        myViewModel.counterLiveData.observe(this, Observer{ count->
            binding.textviewCounter.text="$count"
        })

        binding.buttonIncrement.setOnClickListener{
            myViewModel.incrementCounter()
        }
    }
}