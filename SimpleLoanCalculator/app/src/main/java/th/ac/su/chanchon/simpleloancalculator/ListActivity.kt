package th.ac.su.chanchon.simpleloancalculator

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_list.*
import th.ac.su.chanchon.simpleloancalculator.Utils.getJsonDataFromAsset
import th.ac.su.chanchon.simpleloancalculator.data.Loan
import th.ac.su.chanchon.simpleloancalculator.data.LoanAdapter

class ListActivity : AppCompatActivity() {
    var itemList:ArrayList<Loan> = ArrayList<Loan>()
    lateinit var arrayAdapter: ArrayAdapter<Loan>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val jsonFileString = getJsonDataFromAsset(applicationContext,"promotion.json")

        val gson = Gson()
        val listItemType = object : TypeToken<ArrayList<Loan>>(){}.type
        var menuList : ArrayList<Loan> = gson.fromJson(jsonFileString,listItemType)
        itemList = menuList
        val adapter = LoanAdapter(this@ListActivity,itemList)

        listItem.adapter = adapter

//        listItem.setOnClickListener {
//            setResult(Activity.RESULT_OK,intent)
//
//            finish()
//        }
    }
}