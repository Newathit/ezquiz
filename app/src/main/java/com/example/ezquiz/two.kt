package com.example.ezquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        a.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
        b.setOnClickListener {
            val intent = Intent(this@two, three::class.java)
            intent.putExtra("name", "SuperCom")
            intent.putExtra("name2", "5")
            startActivity(intent)
        }
        c.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()

        }
        d.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }
}