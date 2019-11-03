package app.mikankenshi.album

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent: Intent = Intent(this, Preview::class.java)

        imageView2.setOnClickListener {
            intent.putExtra("image",R.drawable.cute)
            startActivity(intent)
        }
        imageView3.setOnClickListener {
            intent.putExtra("image",R.drawable.cute)
            startActivity(intent)
        }

        imageView4.setOnClickListener {
            intent.putExtra("image",R.drawable.cute)
            startActivity(intent)
        }

        imageView5.setOnClickListener {
            intent.putExtra("image",R.drawable.cute)
            startActivity(intent)
        }

        imageView6.setOnClickListener {
            intent.putExtra("image",R.drawable.cute)
            startActivity(intent)
        }

        imageView.setOnClickListener {
            intent.putExtra("image",R.drawable.cute)
            startActivity(intent)
        }


    }
}
