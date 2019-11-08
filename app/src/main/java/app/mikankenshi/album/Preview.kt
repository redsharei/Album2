package app.mikankenshi.album

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class Preview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        val posId: Int = intent.getIntExtra("pos", 0)
        val keys = arrayOf("Windows",
            "Windows + D",
            "Windows + S",
            "Windows + I",
            "Windows + A",
            "Windows + W",
            "Windows + 1～0",
            "Alt + Tab",
            "Windows + Tab",
            "Windows + Ctrl + D",
            "Windows + Ctrl + ←,→",
            "Windows + Ctrl + F4",
            "Ctrl + Z",
            "Ctrl + Y",
            "Ctrl + A",
            "Ctrl + 矢印",
            "Ctrl + X",
            "Ctrl + C",
            "Ctrl + V",
            "Windows + V",
            "Ctrl + N",
            "Ctrl + S",
            "Ctrl + O",
            "Ctrl + P",
            "Shift + F10",
            "Windows + E",
            "Ctrl +Shift + 1～8",
            "Alt + ←",
            "Alt + →",
            "Alt + ↑",
            "F2",
            "Ctrl + Shift + N",
            "Ctrl + F",
            "Ctrl + F1",
            "Ctrl + 矢印 からの Space",
            "Shift + Delete ",
            "Alt + F4",
            "Alt + Enter",
            "Alt + P",
            "F4",
            "Alt + Space",
            "Windows + ↑,↓",
            "Windows + ←,→",
            "Windows + M",
            "Ctrl + W",
            "Windows + P",
            "PrintScreen",
            "Windows + PrintScreen",
            "Windows + Shift + S",
            "Windows + R",
            "Ctrl + Shift + Eac",
            "Windows + L",
            "Windows + X"
        )

        textView.text = keys[posId]
        //preview.setImageResource(posId)


        back.setOnClickListener{
            finish()
        }
    }
}
