package devandroid.allan.appqrcodekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var editQRCode: EditText? = null
    var btnGerar: Button? = null
    var imgQRCode: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponentes()

    }

    fun initComponentes() {

        editQRCode = findViewById(R.id.editQRCode)
        btnGerar = findViewById(R.id.btnGerar)
        imgQRCode = findViewById(R.id.imgQRCode)

    }
}