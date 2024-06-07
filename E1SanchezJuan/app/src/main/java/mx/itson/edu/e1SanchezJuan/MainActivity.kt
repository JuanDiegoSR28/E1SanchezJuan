package mx.itson.edu.e1SanchezJuan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entradaPrecio: EditText = findViewById(R.id.OriginalPrice)
        val percentage01: Button = findViewById(R.id.First_Percentage)
        val percentage02: Button = findViewById(R.id.Second_Percentage)
        val percentage03: Button = findViewById(R.id.Third_Percentage)
        val percentage04: Button = findViewById(R.id.Forth_Percentage)
        val percentage05: Button = findViewById(R.id.Fifth_Percentage)
        val percentage06: Button = findViewById(R.id.Sixth_Percentage)
        val tip: Button = findViewById(R.id.Button_Tip)
        val discount: Button = findViewById(R.id.Button_Discount)
        val displayValorPercentage: TextView = findViewById(R.id.PlaceHolderPercentage)
        val displayValorTotal: TextView = findViewById(R.id.PlaceHolderTotal)


        percentage01.setOnClickListener {
            val entradaPrecioString = entradaPrecio.text.toString()
            val entradaPrecioToDouble = entradaPrecioString.toDoubleOrNull()
            entradaPrecioToDouble?.let {
                displayValorPercentage.text = calcularPorcentaje(it, 0.10).toString()
            }
        }


        percentage02.setOnClickListener {
            val entradaPrecioString = entradaPrecio.text.toString()
            val entradaPrecioToDouble = entradaPrecioString.toDoubleOrNull()
            entradaPrecioToDouble?.let {
                displayValorPercentage.text = calcularPorcentaje(it, 0.15).toString()
            }
        }

        percentage03.setOnClickListener {
            val entradaPrecioString = entradaPrecio.text.toString()
            val entradaPrecioToDouble = entradaPrecioString.toDoubleOrNull()
            entradaPrecioToDouble?.let {
                displayValorPercentage.text = calcularPorcentaje(it, 0.20).toString()
            }
        }

        percentage04.setOnClickListener {
            val entradaPrecioString = entradaPrecio.text.toString()
            val entradaPrecioToDouble = entradaPrecioString.toDoubleOrNull()
            entradaPrecioToDouble?.let {
                displayValorPercentage.text = calcularPorcentaje(it, 0.25).toString()
            }
        }

        percentage05.setOnClickListener {
            val entradaPrecioString = entradaPrecio.text.toString()
            val entradaPrecioToDouble = entradaPrecioString.toDoubleOrNull()
            entradaPrecioToDouble?.let {
                displayValorPercentage.text = calcularPorcentaje(it, 0.30).toString()
            }
        }

        percentage06.setOnClickListener {
            val entradaPrecioString = entradaPrecio.text.toString()
            val entradaPrecioToDouble = entradaPrecioString.toDoubleOrNull()
            entradaPrecioToDouble?.let {
                displayValorPercentage.text = calcularPorcentaje(it, 0.35).toString()
            }
        }

        tip.setOnClickListener{
            val entradaPrecioString = entradaPrecio.text.toString()
            val entradaPrecioToDouble = entradaPrecioString.toDoubleOrNull()
            val entradaPorcentajeString = displayValorPercentage.text.toString()
            val entradaPorcentajeToDouble = entradaPorcentajeString.toDoubleOrNull()
            entradaPorcentajeToDouble?.let {
                displayValorTotal.text = calcularTip(entradaPrecioToDouble, entradaPorcentajeToDouble).toString()
        }
    }
        discount.setOnClickListener{
            val entradaPrecioString = entradaPrecio.text.toString()
            val entradaPrecioToDouble = entradaPrecioString.toDoubleOrNull()
            val entradaPorcentajeString = displayValorPercentage.text.toString()
            val entradaPorcentajeToDouble = entradaPorcentajeString.toDoubleOrNull()
            entradaPorcentajeToDouble?.let {
                displayValorTotal.text = calcularDescuento(entradaPrecioToDouble, entradaPorcentajeToDouble).toString()
            }
        }








}

    private fun calcularDescuento(entradaPrecioToDouble: Double?, entradaPorcentajeToDouble: Double):Double? {
        if (entradaPrecioToDouble != null) {
            return entradaPrecioToDouble - entradaPorcentajeToDouble
        }
        return null
    }

    private fun calcularTip(entradaPrecioToDouble: Double?, entradaPorcentajeToDouble: Double): Double? {
        if (entradaPrecioToDouble != null) {
            return entradaPrecioToDouble + entradaPorcentajeToDouble
        }
        return null
    }
    private fun calcularPorcentaje(precio: Double, porcentaje: Double): Double {
        return precio * porcentaje
    }
}
