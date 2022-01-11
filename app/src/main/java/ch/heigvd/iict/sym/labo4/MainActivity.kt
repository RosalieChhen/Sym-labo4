package ch.heigvd.iict.sym.labo4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var compass_btn: Button
    private lateinit var BLE_btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        compass_btn = findViewById(R.id.main_compass_btn)
        BLE_btn = findViewById(R.id.main_BLE_btn)
    }
}