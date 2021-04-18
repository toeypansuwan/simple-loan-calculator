package th.ac.su.chanchon.simpleloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import th.ac.su.chanchon.simpleloancalculator.Utils.getJsonDataFromAsset
import th.ac.su.chanchon.simpleloancalculator.data.Loan

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonFileString = getJsonDataFromAsset(applicationContext,"restaurant_data.json")

        val gson = Gson()
        val listItemType = object : TypeToken<ArrayList<Loan>>(){}.type
        var menuList : ArrayList<Loan> = gson.fromJson(jsonFileString,listItemType)

        var cal = 0



    }
}