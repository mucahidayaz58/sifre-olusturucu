package com.greyinc.sifreolusturucu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    var sifre=""
    var rakam= arrayOf(0,1,2,3,4,5,6,7,8,9)
    var harf= arrayOf("a","b","c","d","e","f","g")
    var ozelkarakter= arrayOf("!,#,?")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sifreolustur(view: View){
        sifre=""
        var randomsifre=Random()
        sifre=sifre+harf[randomsifre.nextInt(3)]+rakam[randomsifre.nextInt(2)]+ozelkarakter[randomsifre.nextInt(1)]
        findViewById<TextView>(R.id.textView).setText(sifre)
    }
}