package com.example.zaythelgyi.mvp.presenter

import com.example.zaythelgyi.mvp.view.BaseView

interface BasePresenter<T: BaseView> {
    fun initPresenter(view : T)

    fun onStart()
    fun onCreate()
    fun onCreateView()
    fun onViewCreated()
    fun onResume()
    fun onPause()
    fun onStop()
    fun onDestroy()
}