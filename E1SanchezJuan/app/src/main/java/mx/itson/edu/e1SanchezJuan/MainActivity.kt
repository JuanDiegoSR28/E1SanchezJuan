package mx.itson.edu.e1SanchezJuan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var percentage : String
        val originalPrice : EditText = findViewById<EditText>(R.id.OriginalPrice)
        val percentage01 : Button = findViewById(R.id.First_Percentage)
        val percentage02 : Button = findViewById(R.id.Second_Percentage)
        val percentage03 : Button = findViewById(R.id.Third_Percentage)
        val percentage04 : Button = findViewById(R.id.Forth_Percentage)
        val percentage05 : Button = findViewById(R.id.Fifth_Percentage)
        val percentage06 : Button = findViewById(R.id.Sixth_Percentage)
        val displayValorPercentage : TextView = findViewById<TextView>(R.id.PlaceHolderPercentage)

        percentage01.setOnClickListener()
        {

            var priceToDouble = percentage01.text.toString().toDoubleOrNull() as Double
                percentage = priceToDouble*0.1
                displayValorPercentage.setText(percentage)


        }

        percentage02.setOnClickListener()
        {
            var priceToDouble = percentage02.text.toString().toDoubleOrNull() as Double
            percentage = priceToDouble*0.15
            displayValorPercentage.setText(percentage)

        }

        percentage03.setOnClickListener()
        {
            var priceToDouble = percentage01.text.toString().toDoubleOrNull() as Double
            percentage = priceToDouble*0.2
            displayValorPercentage.setText(percentage)

        }

        percentage04.setOnClickListener()
        {
            var priceToDouble = percentage01.text.toString().toDoubleOrNull() as Double
            percentage = priceToDouble*0.25
            displayValorPercentage.setText(percentage)

        }

        percentage05.setOnClickListener()
        {
            var priceToDouble = percentage01.text.toString().toDoubleOrNull() as Double
            percentage = priceToDouble*0.30
            displayValorPercentage.setText(percentage)

        }

        percentage06.setOnClickListener()
        {
            var priceToDouble = percentage01.text.toString().toDoubleOrNull() as Double
            percentage = priceToDouble*0.4
            displayValorPercentage.setText(percentage)

        }



    }




}