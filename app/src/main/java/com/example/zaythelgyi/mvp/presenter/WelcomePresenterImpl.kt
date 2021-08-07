package com.example.zaythelgyi.mvp.presenter

import com.example.zaythelgyi.mvp.view.WelcomeView

class WelcomePresenterImpl : AbstractBasePresenter<WelcomeView>() , WelcomePresenter {
    override fun onStart() {
        TODO("Not yet implemented")
    }

    override fun onCreate() {
        mView?.init()
        mView?.listener()
    }

    override fun onCreateView() {
        TODO("Not yet implemented")
    }

    override fun onViewCreated() {
        TODO("Not yet implemented")
    }

    override fun onResume() {
        TODO("Not yet implemented")
    }

    override fun onPause() {
        TODO("Not yet implemented")
    }

    override fun onStop() {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        TODO("Not yet implemented")
    }
}