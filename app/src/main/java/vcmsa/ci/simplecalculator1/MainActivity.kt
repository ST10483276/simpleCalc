package vcmsa.ci.simplecalculator1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.widget.EditText
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit private var etNum1: EditText
    lateinit private var etNum2: EditText
    lateinit private var btnAdd: Button
    lateinit private var btnSubtract: Button
    lateinit private var btnMultiply: Button
    lateinit private var btnDivide: Button
    lateinit private var tvDisplay: TextView












    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply= findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        tvDisplay = findViewById(R.id.tvDisplay)

        btnAdd.setOnClickListener{ calcAdd() }
        btnSubtract.setOnClickListener{ calcSubtract() }
        btnMultiply.setOnClickListener{ calcMultiply() }
        btnDivide.setOnClickListener{ calcDivide() }

    }
    private fun calcAdd(){
        //retrieve user input
        val dblNum1 = etNum1.text.toString().toDouble()
        val dblNum2 = etNum2.text.toString().toDouble()

        var dblResult: Double

        dblResult = dblNum1+dblNum2

        tvDisplay.text = dblResult.toString()
    }
    private fun calcSubtract(){
        //retrieve user input
        val dblNum1 = etNum1.text.toString().toDouble()
        val dblNum2 = etNum2.text.toString().toDouble()

        var dblResult: Double

        dblResult = dblNum1-dblNum2

        tvDisplay.text = dblResult.toString()
    }
    private fun calcMultiply(){
        //retrieve user input
        val dblNum1 = etNum1.text.toString().toDouble()
        val dblNum2 = etNum2.text.toString().toDouble()

        var dblResult: Double

        dblResult = dblNum1*dblNum2

        tvDisplay.text = dblResult.toString()
    }
    private fun calcDivide() {
        //retrieve user input
        val dblNum1 = etNum1.text.toString().toDouble()
        val dblNum2 = etNum2.text.toString().toDouble()

        var dblResult: Double

        dblResult = dblNum1 / dblNum2

        tvDisplay.text = dblResult.toString()
    }







    }
