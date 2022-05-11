package tr.edu.maltepe.project.attendance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class instructorPage2 : AppCompatActivity() {

    val lessonhour = arrayOf("0","1","2","3","4","5","6","7","8","9")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructor_page2)

        val spinnerLessonhour = findViewById<Spinner>(R.id.spinnerLessonhour)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,lessonhour)

        spinnerLessonhour.adapter = arrayAdapter
        spinnerLessonhour.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                TODO("Not yet implemented")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }
}