package com.example.zaythelgyi.mvp.presenter

import com.example.zaythelgyi.mvp.view.BaseView

abstract class AbstractBasePresenter<T : BaseView> : BasePresenter<T> {

    var mView: T? = null

    override fun initPresenter(view: T) {
        mView = view
    }
}