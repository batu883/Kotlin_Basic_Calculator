package com.example.hesapmak3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hesapmak3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         //setContentView(R.layout.activity_main)
         binding = ActivityMainBinding.inflate(layoutInflater)
         val view = binding.root
         setContentView(view)
     }

    fun SayiSec(view: android.view.View) {

        var btnTikla= view as Button
        var ekran=binding.Ekran.text.toString()
        when(btnTikla.id){
            binding.Btn0.id->{ekran+="0"}
            binding.Btn1.id->{ekran+="1"}
            binding.Btn2.id->{ekran+="2"}
            binding.Btn3.id->{ekran+="3"}
            binding.Btn4.id->{ekran+="4"}
            binding.Btn5.id->{ekran+="5"}
            binding.Btn6.id->{ekran+="6"}
            binding.Btn7.id->{ekran+="7"}
            binding.Btn8.id->{ekran+="8"}
            binding.Btn9.id->{ekran+="9"}
            binding.BtnArtEksi.id->{ekran="-"+ekran}
        }
      binding.Ekran.setText(ekran)
    }
    var eskisayi=""
    var yenisayi=""
    var islem=""
    var total:Double = 0.0
    fun DörtIslem(view: android.view.View) {

        var BtnTikla= view as Button


        when( BtnTikla.id){
            binding.BtnArti.id->{islem="+"}
            binding.BtnEksi.id->{islem="-"}
            binding.BtnCarpi.id->{islem="x"}
            binding.BtnBolme.id->{islem="/"}
        }
        eskisayi=binding.Ekran.text.toString()
        binding.Ekran.text.clear()
    }

    fun esittir(view: android.view.View) {

        yenisayi= binding.Ekran.text.toString()

        when(islem){
            "+"->{total=eskisayi.toDouble()+yenisayi.toDouble()}
            "-"->{total=eskisayi.toDouble()-yenisayi.toDouble()}
            "x"->{total=eskisayi.toDouble()*yenisayi.toDouble()}
            "/"->{total=eskisayi.toDouble()/yenisayi.toDouble()}
        }
        binding.Ekran.setText(total.toString())
    }

    fun ac(view: android.view.View) {
        binding.Ekran.text.clear()
    }

    fun yüzde(view: android.view.View) {
        var sonuc:Double = binding.Ekran.text.toString().toDouble()/100
        binding.Ekran.setText(sonuc.toString())

    }

    fun nokta(view: android.view.View) {

        var sonuc= binding.Ekran.text.toString()
        binding.Ekran.setText(sonuc+".")

    }

}