package com.mariga.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var tv_answer:TextView? = null
    var edit_text_first_number:EditText? = null
    var edit_text_second_number:EditText? = null
    var button_add:Button? = null
    var button_divide:Button? = null
    var button_subtract:Button? = null
    var button_multiply:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_answer = findViewById(R.id.mTvAnswer)
        edit_text_first_number = findViewById(R.id.mEditFnum)
        edit_text_second_number = findViewById(R.id.mEditSnum)
        button_add = findViewById(R.id.mBtnAdd)
        button_divide = findViewById(R.id.mBtnDivide)
        button_subtract = findViewById(R.id.mBtnSub)
        button_multiply = findViewById(R.id.mBtnMul)

        button_add!!.setOnClickListener {
           //receive the two numbers from the users
            var firstNumber = edit_text_first_number!!.text.toString().trim()
            var secondNumber = edit_text_second_number!!.text.toString().trim()
            //check if the user is trying to submit empty fields
            if (firstNumber.isEmpty()){
                edit_text_first_number!!.setError("Please fill this field")
                edit_text_first_number!!.requestFocus()

            }else if (secondNumber.isEmpty()){
                edit_text_second_number!!.setError("Please fill this field")
                edit_text_second_number!!.requestFocus()

            }else{
                //proceed with the calculation
                var answer = firstNumber.toDouble() + secondNumber.toDouble()
                //Finally display the answer on the screen
                tv_answer!!.text = answer.toString()
            }

        }
        button_multiply!!.setOnClickListener {
            //receive the two numbers from the users
            var firstNumber = edit_text_first_number!!.text.toString().trim()
            var secondNumber = edit_text_second_number!!.text.toString().trim()
            //check if the user is trying to submit empty fields
            if (firstNumber.isEmpty()){
                edit_text_first_number!!.setError("Please fill this field")
                edit_text_first_number!!.requestFocus()

            }else if (secondNumber.isEmpty()){
                edit_text_second_number!!.setError("Please fill this field")
                edit_text_second_number!!.requestFocus()

            }else{
                //proceed with the calculation
                var answer = firstNumber.toDouble() * secondNumber.toDouble()
                //Finally display the answer on the screen
                tv_answer!!.text = answer.toString()
            }
        }
        button_subtract!!.setOnClickListener {
            //receive the two numbers from the users
            var firstNumber = edit_text_first_number!!.text.toString().trim()
            var secondNumber = edit_text_second_number!!.text.toString().trim()
            //check if the user is trying to submit empty fields
            if (firstNumber.isEmpty()){
                edit_text_first_number!!.setError("Please fill this field")
                edit_text_first_number!!.requestFocus()

            }else if (secondNumber.isEmpty()){
                edit_text_second_number!!.setError("Please fill this field")
                edit_text_second_number!!.requestFocus()

            }else{
                //proceed with the calculation
                var answer = firstNumber.toDouble() - secondNumber.toDouble()
                //Finally display the answer on the screen
                tv_answer!!.text = answer.toString()
            }
        }
        button_divide!!.setOnClickListener {
            //receive the two numbers from the users
            var firstNumber = edit_text_first_number!!.text.toString().trim()
            var secondNumber = edit_text_second_number!!.text.toString().trim()
            //check if the user is trying to submit empty fields
            if (firstNumber.isEmpty()){
                edit_text_first_number!!.setError("Please fill this field")
                edit_text_first_number!!.requestFocus()

            }else if (secondNumber.isEmpty()){
                edit_text_second_number!!.setError("Please fill this field")
                edit_text_second_number!!.requestFocus()

            }else{
                //proceed with the calculation
                var answer = firstNumber.toDouble() / secondNumber.toDouble()
                //Finally display the answer on the screen
                tv_answer!!.text = answer.toString()
            }
        }
    }
}