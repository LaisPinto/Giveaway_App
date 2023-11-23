package pinto.lais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortition(view: View) {
        val textRusult = findViewById<TextView>(R.id.text_result) // encontrar a interface pe ID
        val number = Random().nextInt(10)
        textRusult.text = "número gerado $number"
    }

}