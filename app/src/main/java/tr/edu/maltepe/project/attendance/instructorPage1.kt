package tr.edu.maltepe.project.attendance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class instructorPage1 : AppCompatActivity() {
    val lesson = arrayOf("CEN","SE")
    val lessoncode1 = arrayOf("0","1","2","3","4","5","6","7","8")
    val lessoncode2 = arrayOf("0","1","2","3","4","5","6","7","8")
    val lessoncode3 = arrayOf("0","1","2","3","4","5","6","7","8")
    val sessioncode = arrayOf("01","02","03","04","05","06","07","08","09")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructor_page1)

        val spinner1 = findViewById<Spinner>(R.id.spinner1)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,lesson)

        val spinner2 = findViewById<Spinner>(R.id.spinner2)
        val arrayAdapter2 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,lessoncode1)

        val spinner3 = findViewById<Spinner>(R.id.spinner3)
        val arrayAdapter3 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,lessoncode2)

        val spinner4 = findViewById<Spinner>(R.id.spinner4)
        val arrayAdapter4 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,lessoncode3)

        val spinner5 = findViewById<Spinner>(R.id.spinner5)
        val arrayAdapter5 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,sessioncode)


        spinner1.adapter = arrayAdapter
        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                TODO("Not yet implemented")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        spinner2.adapter = arrayAdapter2
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                TODO("Not yet implemented")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        spinner3.adapter = arrayAdapter3
        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                TODO("Not yet implemented")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        spinner4.adapter = arrayAdapter4
        spinner4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                TODO("Not yet implemented")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        spinner5.adapter = arrayAdapter5
        spinner5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                TODO("Not yet implemented")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }
}