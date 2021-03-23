package jp.techacademy.daiki.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val a = intent.getDoubleExtra("A", 0.0)
        val b = intent.getDoubleExtra("A", 0.0)
        val c = intent.getDoubleExtra("A", 0.0)
        val d = intent.getDoubleExtra("A", 0.0)

        textView.text = a.toString()
        textView.text = b.toString()
        textView.text = c.toString()
        textView.text = d.toString()
    }
}