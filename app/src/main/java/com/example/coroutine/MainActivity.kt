package com.example.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        /**
        * Sonsuz döngü oluşturuldu.
        */
        while (true){

            counter++
            /**
            * Sayac her döngüye girdiğinde counter artıyor ve ekrana değer bastırılıyor.
            */
            println("Counter: $counter")
            /**
            * Sonsuz döngüye CoroutineScope eklendi.
            */
            CoroutineScope(Dispatchers.IO).launch {

                val answer = doNetworkCall()

                withContext(Dispatchers.Main){
                    Log.v("PATIKA", answer)
                }
            }
            /**
             * Kitlenmeyi görmek için koşul ekleyip while döngüsünden çıkıyoruz.
             * Break işlemi gerleştikten sonra kitlenen Coroutine fonksiyonu çalışıyor.
             */
            if(counter == 10000){
                break
            }
        }
    }

    /**
    * 1 sn delay eklendi.
    */
    private suspend fun doNetworkCall(): String{
        delay(1000)
        return "Network Call"
    }
}