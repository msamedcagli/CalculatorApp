package com.msamedcagli.odevhesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.msamedcagli.odevhesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var numara1 : Double ?= null
    var numara2 : Double ?= null
    var sonuc : Double ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun toplama(view: View){
        numara1 = binding.editText1.text.toString().toDoubleOrNull()
        numara2 = binding.editText2.text.toString().toDoubleOrNull()

        if(numara1 != null && numara2 !=null) {
            sonuc= numara1!! + numara2!!
            binding.textView.text = "Sonuç ${sonuc}"
        }else {
            binding.textView.text="Sayıları Eksik Veya Yanlış Girdiniz"
        }
    }

    fun cikarma(view: View){
        numara1 = binding.editText1.text.toString().toDoubleOrNull()
        numara2 = binding.editText2.text.toString().toDoubleOrNull()

        if(numara1 != null && numara2 !=null) {
            sonuc= numara1!! - numara2!!
            binding.textView.text = "Sonuç ${sonuc}"
        }else {
            binding.textView.text="Sayıları Eksik Veya Yanlış Girdiniz"
        }
    }
    fun carpma(view: View){
        numara1 = binding.editText1.text.toString().toDoubleOrNull()
        numara2 = binding.editText2.text.toString().toDoubleOrNull()

        if(numara1 != null && numara2 !=null) {
            sonuc= numara1!! * numara2!!
            binding.textView.text = "Sonuç ${sonuc}"
        }else {
            binding.textView.text="Sayıları Eksik Veya Yanlış Girdiniz"
        }
    }

    fun bolme(view: View){
        numara1 = binding.editText1.text.toString().toDoubleOrNull()
        numara2 = binding.editText2.text.toString().toDoubleOrNull()

        if(numara1 != null && numara2 !=null) {
            sonuc= numara1!! / numara2!!
            binding.textView.text = "Sonuç ${sonuc}"
        }else {
            binding.textView.text="Sayıları Eksik Veya Yanlış Girdiniz"
        }
    }
}