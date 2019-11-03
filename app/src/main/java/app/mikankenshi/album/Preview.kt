package app.mikankenshi.album

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class Preview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        val imageId: Int = intent.getIntExtra("image", 0)
        preview.setImageResource(imageId)


        back.setOnClickListener{
            finish()
        }
    }
}
