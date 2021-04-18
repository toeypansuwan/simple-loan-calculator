package th.ac.su.chanchon.simpleloancalculator

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculate.*

class CalculateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)

        var bath = intent.getDoubleExtra("cal",0.0)

        tvB.text = bath.toFloat().toString()

        btnBack.setOnClickListener {
            setResult(Activity.RESULT_OK,intent)

            finish()
        }
    }
}