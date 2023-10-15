package com.example.counter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // private lateinit var viewModel: CounterViewModel

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //  viewModel = ViewModelProvider(this)[CounterViewModel::class.java]


//        viewModel.counter.observe(this) {
//            count = it
//            binding.edtCount.text = "CLICK COUNTER : $count"
//
//        }

        binding.edtCount.text = "CLICK COUNTER : $count"
        binding.btn.setOnClickListener {
            //  viewModel.incrementCounter()

            count++
            binding.edtCount.text = "CLICK COUNTER : $count"

        }


    }

    override fun onStop() {
        super.onStop()
        //     viewModel.resetCounter()
        count = 0
        binding.edtCount.text = "CLICK COUNTER : $count"

    }

}