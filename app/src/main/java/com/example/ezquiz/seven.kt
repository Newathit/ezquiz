package com.example.ezquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)
        a.setOnClickListener {
            val intent = Intent(this@seven, eight::class.java)
            intent.putExtra("name", "SuperCom")
            intent.putExtra("name2", "5")
            startActivity(intent)
        }
        b.setOnClickListener {
            val myToast = Toast.makeText(applicationContext, "ไม่ถูกต้อง", Toast.LENGTH_SHORT)
            myToast.show()
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