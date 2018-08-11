package com.example.ankit.calc

import android.util.Log
import java.util.ArrayList
import kotlin.system.exitProcess

class ParticularCalculate( var question:String){
    var arrayValue=ArrayList<Char>()
    var arrayIndex=ArrayList<Int>()
    fun calculate():String
    {  var posIndex=0

        ChangingValue()


            if(arrayIndex.size!=0) {
                Log.d("CHK","     why here ")

                for ((pos, i) in arrayValue.withIndex()) {
                    if (i == '/' && pos == arrayIndex.size - 1 && pos == 0) {
                        Log.d("CHK", "$question      fourthloop")
                        var division = question.substring(0, arrayIndex[pos]).toFloat() / question.substring(arrayIndex[pos] + 1).toFloat()
                        question = division.toString()
                        ChangingValue()
                        calculate()
                        break
                    }
                }

                for ((pos, i) in arrayValue.withIndex()) {
                    if (i == '/' && pos == 0 && pos != arrayIndex.size - 1) {   //Log.d("CHK","${arrayIndex[pos]+1}     ${arrayIndex[pos+1]}" )
                        var division = question.substring(0, arrayIndex[pos]).toFloat() / question.substring(arrayIndex[pos] + 1, arrayIndex[pos + 1]).toFloat()
                        question = division.toString() + question.substring(arrayIndex[pos + 1])
                        Log.d("CHK", "$question      $division      2ndloop")
                        ChangingValue()
                        calculate()

                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    Log.d("CHK", "$question      thirdLoop")
                    if (i == '/' && pos != 0 && pos != arrayIndex.size - 1) {
                        var division = question.substring(arrayIndex[pos - 1] + 1, arrayIndex[pos]).toFloat() / question.substring(arrayIndex[pos]+1, arrayIndex[pos + 1]).toFloat()
                        question = question.substring(0, arrayIndex[pos - 1]+1) + division + question.substring(arrayIndex[pos + 1])
                        ChangingValue()
                        calculate()
                        break
                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    Log.d("CHK", "$pos        3rdloop")
                    if (i == '/' && pos == arrayIndex.size - 1 && pos != 0) {
                        var division = question.substring(arrayIndex[pos - 1] + 1, arrayIndex[pos]).toFloat() / question.substring(arrayIndex[pos] + 1).toFloat()
                        question = question.substring(0, arrayIndex[pos - 1]+1) + division
                        Log.d("CHK","in innner third loop")
                       ChangingValue()
                        calculate()
                        break
                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    if (i == '*' && pos == arrayIndex.size - 1 && pos == 0) {
                        Log.d("CHK", "$question      fourthloop")
                        var division = question.substring(0, arrayIndex[pos]).toFloat() * question.substring(arrayIndex[pos] + 1).toFloat()
                        question = division.toString()
                        ChangingValue()
                        calculate()
                        break
                    }
                }

                for ((pos, i) in arrayValue.withIndex()) {
                    if (i == '*' && pos == 0 && pos != arrayIndex.size - 1) {   //Log.d("CHK","${arrayIndex[pos]+1}     ${arrayIndex[pos+1]}" )
                        var division = question.substring(0, arrayIndex[pos]).toFloat() * question.substring(arrayIndex[pos] + 1, arrayIndex[pos + 1]).toFloat()
                        question = division.toString() + question.substring(arrayIndex[pos + 1])
                        Log.d("CHK", "$question      $division      2ndloop")
                        ChangingValue()
                        calculate()

                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    Log.d("CHK", "$question      thirdLoop")
                    if (i == '*' && pos != 0 && pos != arrayIndex.size - 1) {
                        var division = question.substring(arrayIndex[pos - 1] + 1, arrayIndex[pos]).toFloat() * question.substring(arrayIndex[pos]+1, arrayIndex[pos + 1]).toFloat()
                        question = question.substring(0, arrayIndex[pos - 1]+1) + division + question.substring(arrayIndex[pos + 1])
                        ChangingValue()
                        calculate()
                        break
                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    Log.d("CHK", "$pos        3rdloop")
                    if (i == '*' && pos == arrayIndex.size - 1 && pos != 0) {
                        var division = question.substring(arrayIndex[pos - 1] + 1, arrayIndex[pos]).toFloat() * question.substring(arrayIndex[pos] + 1).toFloat()
                        question = question.substring(0, arrayIndex[pos - 1]+1) + division
                        Log.d("CHK","in innner third loop")
                        ChangingValue()
                        calculate()
                        break
                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    if (i == '+' && pos == arrayIndex.size - 1 && pos == 0) {
                        Log.d("CHK", "$question      fourth loop")
                        var division = question.substring(0, arrayIndex[pos]).toFloat() + question.substring(arrayIndex[pos] + 1).toFloat()
                        question = division.toString()
                        ChangingValue()
                        calculate()
                        break
                    }
                }

                for ((pos, i) in arrayValue.withIndex()) {
                    if (i == '+' && pos == 0 && pos != arrayIndex.size - 1) {   //Log.d("CHK","${arrayIndex[pos]+1}     ${arrayIndex[pos+1]}" )
                        var division = question.substring(0, arrayIndex[pos]).toFloat() + question.substring(arrayIndex[pos] + 1, arrayIndex[pos + 1]).toFloat()
                        question = division.toString() + question.substring(arrayIndex[pos + 1])
                        Log.d("CHK", "$question      $division      2ndloop")
                        ChangingValue()
                        calculate()

                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    Log.d("CHK", "$question      thirdLoop")
                    if (i == '+' && pos != 0 && pos != arrayIndex.size - 1) {
                        var division = question.substring(arrayIndex[pos - 1] + 1, arrayIndex[pos]).toFloat() + question.substring(arrayIndex[pos]+1, arrayIndex[pos + 1]).toFloat()
                        question = question.substring(0, arrayIndex[pos - 1]+1) + division + question.substring(arrayIndex[pos + 1])
                        ChangingValue()
                        calculate()
                        break
                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    Log.d("CHK", "$pos        3rdloop")
                    if (i == '+' && pos == arrayIndex.size - 1 && pos != 0) {
                        var division = question.substring(arrayIndex[pos - 1] + 1, arrayIndex[pos]).toFloat() + question.substring(arrayIndex[pos] + 1).toFloat()
                        question = question.substring(0, arrayIndex[pos - 1]+1) + division
                        Log.d("CHK","in innner third loop")
                        ChangingValue()
                        calculate()
                        break
                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    if (i == '-' && pos == arrayIndex.size - 1 && pos == 0) {
                        var division = question.substring(0, arrayIndex[pos]).toFloat() - question.substring(arrayIndex[pos] + 1).toFloat()
                        question = division.toString()
                        ChangingValue()
                        calculate()
                        break
                    }
                }

                for ((pos, i) in arrayValue.withIndex()) {
                    if (i == '-' && pos == 0 && pos != arrayIndex.size - 1) {   //Log.d("CHK","${arrayIndex[pos]+1}     ${arrayIndex[pos+1]}" )
                        var division = question.substring(0, arrayIndex[pos]).toFloat() - question.substring(arrayIndex[pos] + 1, arrayIndex[pos + 1]).toFloat()
                        question = division.toString() + question.substring(arrayIndex[pos + 1])
                        ChangingValue()
                        calculate()

                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    if (i == '-' && pos != 0 && pos != arrayIndex.size - 1) {
                        var division = question.substring(arrayIndex[pos - 1] + 1, arrayIndex[pos]).toFloat() - question.substring(arrayIndex[pos]+1, arrayIndex[pos + 1]).toFloat()
                        question = question.substring(0, arrayIndex[pos - 1]+1) + division + question.substring(arrayIndex[pos + 1])
                        ChangingValue()
                        calculate()
                        break
                    }
                }
                for ((pos, i) in arrayValue.withIndex()) {
                    if (i == '-' && pos == arrayIndex.size - 1 && pos != 0) {
                        var division = question.substring(arrayIndex[pos - 1] + 1, arrayIndex[pos]).toFloat() - question.substring(arrayIndex[pos] + 1).toFloat()
                        question = question.substring(0, arrayIndex[pos - 1]+1) + division
                        ChangingValue()
                        calculate()
                        break
                    }
                }

            }
       else {

            }
       return question
    }
    fun ChangingValue(){
        arrayIndex= ArrayList()
        arrayValue=ArrayList()
        for ((index,value) in question.withIndex())
        {
            if (value=='/'||value=='*'||value=='+'||value=='-')
            {
                arrayIndex.add(index)
                arrayValue.add(value)
            }

        }
    }
}