package com.qomar.widgetdasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import com.qomar.widgetdasar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var latihan: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        latihan = ActivityMainBinding.inflate(layoutInflater)
        setContentView(latihan.root)
    }
    fun onRbClicked(view: View) {
        if (view is RadioButton) {
            val checked = view.isChecked
            when (view.getId()) {
                R.id.radioPria ->
                    if (checked) {
                        Toast.makeText(applicationContext,
                            "Anda bernama ${latihan.editNama.text} seorang${latihan.radioPria.text}",
                        Toast.LENGTH_LONG).show()
                    }
            }
        }
    }
    fun onCbClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            when (view.id) {

                R.id.cd_coding ->
                    if (checked) {
                        Toast.makeText(applicationContext,
                            "${latihan.editNama.text} punya hobi ${latihan.cdCoding.text}",
                            Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext,
                            "Anda batal memilih ${latihan.cdCoding.text}",
                            Toast.LENGTH_SHORT).show()
                    }
            }
        }
    }
}
