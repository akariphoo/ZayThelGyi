package com.example.zaythelgyi.activity

import android.os.Bundle
import com.example.zaythelgyi.R
import com.example.zaythelgyi.mvp.view.WelcomeView

class WelcomeActivity : BaseActivity() , WelcomeView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }
    override fun init() {
        TODO("Not yet implemented")
    }

    override fun listener() {
        TODO("Not yet implemented")
    }
}