package jp.techacademy.daiki.calcapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_second.*
import java.lang.Exception
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

        button5.setOnClickListener { view ->
            Snackbar.make(view, "数値を入力してください", Snackbar.LENGTH_INDEFINITE)
                .setAction("消す"){
                    Log.d("calc","Snackberをタップした")
                }.show()
        }
    }

    override fun onClick(v: View) {

        try {
            val num1 = editText1.text.toString().toDouble()
            val num2 = editText2.text.toString().toDouble()

            if (v.id == R.id.button1) {
                val num3 = num1 + num2
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("A", num3)
                startActivity(intent)
            } else if (v.id == R.id.button2) {
                val num4 = num1 - num2
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("A", num4)
                startActivity(intent)
            } else if (v.id == R.id.button3) {
                val num5 = num1 * num2
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("A", num5)
                startActivity(intent)
            } else if (v.id == R.id.button4) {
                val num6 = num1 / num2
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("A", num6)
                startActivity(intent)
            }
        } catch (e: NumberFormatException) {
            Log.d("calc", "計算できません")
        }
    }

}







