package jp.techacademy.satou3.shunsuke.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
            showTimePickerDialog()

    }

        private fun showTimePickerDialog() {
            val timePickerDialog = TimePickerDialog(
                    this,
                    TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                        Log.d("UI-PARTS", "$hour:$minute")
                        if (hour>=18){
                            textView1.text="こんばんは"
                            Log.d("UI_PARTS","こんばんは")
                        }else if (hour>=10){
                            textView1.text="こんにちは"
                            Log.d("UI_PARTS","こんにちは")
                        }else if (hour>=2){
                            textView1.text="おはよう"
                            Log.d("UI_PARTS","おはよう")
                        }else{
                            textView1.text="こんばんは"
                            Log.d("UI_PARTS","こんばんは")
                        }
                    },

                    1, 0, true)
            timePickerDialog.show()
        }
}
