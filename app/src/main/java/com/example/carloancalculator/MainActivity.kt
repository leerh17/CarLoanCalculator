package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     btnCalculate.setOnClickListener {
         val carPrice:Double = editTextCarPrice.text.toString().toDouble()
         val downPayment:Double = editTextDownPayment.text.toString().toDouble()
         val loanPeriod:Double = editTextLoanPeriod.text.toString().toDouble()
         val interestRate:Double = editTextLoanPeriod.text.toString().toDouble()

         val carLoan:Double = carPrice - downPayment
         val interest:Double = carLoan * interestRate * loanPeriod
         val monthly:Double = (carLoan + interest) / loanPeriod / 12

         textViewLoan.text = "Car Loan :RM %.2f".format(carLoan)
         textViewInterest.text = "Interest Rate :RM %.2f".format(interest)
         textViewMonthlyRepayment.text = "Monthly Repayment :RM %.2f".format(monthly)

     }




    }
}
