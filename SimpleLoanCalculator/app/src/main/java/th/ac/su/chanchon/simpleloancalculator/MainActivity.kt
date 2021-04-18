package th.ac.su.chanchon.simpleloancalculator

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.activity_main.*
import th.ac.su.chanchon.simpleloancalculator.Utils.getJsonDataFromAsset
import th.ac.su.chanchon.simpleloancalculator.data.Loan
import th.ac.su.chanchon.simpleloancalculator.data.LoanAdapter

class MainActivity : AppCompatActivity() {

    companion object{
        const val CH = 1000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var cal:Double = 0.0

        btn1.setOnClickListener {
            var n = edtN.text.toString().toDouble()
            var d = edtD.text.toString().toDouble()
            var v = edtV.text.toString().toDouble()

            cal = (n+(n*(d/100)*v))/(v*12)


            var intent = Intent(this@MainActivity,CalculateActivity::class.java)

            intent.putExtra("cal",cal)

            startActivityForResult(intent,CH)
        }


        btn2.setOnClickListener {
            var intent = Intent(this@MainActivity,ListActivity::class.java)


            startActivityForResult(intent,CH)
        }


    }
}