package com.leandro.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalculate = btCalculate
        val tvResultado = tvResultado

        btCalculate.setOnClickListener {
            val etNumber1 = Integer.parseInt(etNumber1.text.toString())
            val etNumber2 = Integer.parseInt(etNumber2.text.toString())
            val etNumber3 = Integer.parseInt(etNumber3.text.toString())
            val media = (etNumber1 + etNumber2 + etNumber3) / 3

            if (media >= 6) {
                tvResultado.setText("Aprovado com:" + "\n" + media)
                tvResultado.setTextColor(Color.GREEN)
            } else if (media == 5) {
                tvResultado.setText("Recuperação com: " + "\n" + media)
                tvResultado.setTextColor(Color.YELLOW)
            } else {
                tvResultado.setText("Reprovado com: " + "\n" + media)
                tvResultado.setTextColor(Color.RED)
            }
        }
    }
}