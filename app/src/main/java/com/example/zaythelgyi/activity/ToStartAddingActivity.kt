package com.example.zaythelgyi.activity

import android.os.Bundle
import com.example.zaythelgyi.R
import com.example.zaythelgyi.mvp.view.ToStartAddingView

class ToStartAddingActivity : BaseActivity() , ToStartAddingView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_start_adding)
    }

    override fun init() {
        TODO("Not yet implemented")
    }

    override fun listener() {
        TODO("Not yet implemented")
    }
}