package br.com.developerjfm.aulaandroid

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSave = findViewById<Button>(R.id.buttonGravar);
        val textViewName = findViewById<TextView>(R.id.editText_nome);
        val textViewReview = findViewById<TextView>(R.id.editText_opniao);

        buttonSave.setOnClickListener {
            val name = textViewName.text
            val review = textViewReview.text

            Toast.makeText(this,"Nome:$name - Opnião:$review",Toast.LENGTH_LONG).show();
        }
    }


}
