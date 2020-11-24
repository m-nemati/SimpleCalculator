package ir.mnemati.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {

            if(etNum1.text.isEmpty() || etNum2.text.isEmpty()){
                Toast.makeText(this,"Please Enter Inputs", Toast.LENGTH_LONG).show()
            }
            else{
                val inputNumber1 = etNum1.text.toString().toInt()
                val inputNumber2 = etNum2.text.toString().toInt()

                var result = inputNumber1 + inputNumber2

                tvResult.text = result.toString()
            }

        }

        btnReset.setOnClickListener {
            etNum1.text.clear()
            etNum2.text.clear()
            tvResult.text = "Result"
        }
    }
}