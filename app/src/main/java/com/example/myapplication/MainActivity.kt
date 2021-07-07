package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Basic observable
         *
         */
        val observable = Observable.just(1,2,3)
            .subscribe(object : Observer<Int> {
                override fun onSubscribe(d: Disposable) {
                    d.dispose()
                }

                override fun onNext(t: Int) {

                }

                override fun onError(e: Throwable) {

                }

                override fun onComplete() {

                }

            })

    }
}