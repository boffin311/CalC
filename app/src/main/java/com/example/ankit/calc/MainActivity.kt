package com.example.ankit.calc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    btnDivide.setOnClickListener { tvApply.text=tvApply.text.toString()+"/" }
   btnEqual.setOnClickListener {
       var particularCalculate=ParticularCalculate(tvApply.text.toString())

       var returedValue=particularCalculate.calculate()
       tvApply.text=returedValue
      Log.d("CHK1","Helllo ") }


        try{ btnDelete.setOnClickListener {var Value=tvApply.text.toString();
                tvApply.text=tvApply.text.toString().substring(0,Value.length-1) }}catch (s:StringIndexOutOfBoundsException){}
        btnDelete.setOnLongClickListener { tvApply.text=null;true }
        btnDot.setOnClickListener {  tvApply.text=tvApply.text.toString()+"." }
        btnAdd.setOnClickListener { tvApply.text=tvApply.text.toString()+"+" }
        btnOne.setOnClickListener { tvApply.text=tvApply.text.toString()+"1" }
        btnTwo.setOnClickListener { tvApply.text=tvApply.text.toString()+"2" }
        btnThree.setOnClickListener { tvApply.text=tvApply.text.toString()+"3" }
        btnFour.setOnClickListener { tvApply.text=tvApply.text.toString()+"4" }
        btnSix.setOnClickListener { tvApply.text=tvApply.text.toString()+"6" }
        btnFive.setOnClickListener { tvApply.text=tvApply.text.toString()+"5" }
        btnSeven.setOnClickListener { tvApply.text=tvApply.text.toString()+"7" }
        btnEight.setOnClickListener { tvApply.text=tvApply.text.toString()+"8" }
        btnNine.setOnClickListener { tvApply.text=tvApply.text.toString()+"9" }
        btnMultiply.setOnClickListener { tvApply.text=tvApply.text.toString()+"*" }


    }
}
