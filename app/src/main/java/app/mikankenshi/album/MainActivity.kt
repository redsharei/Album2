package app.mikankenshi.album

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import app.mikankenshi.album.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent: Intent = Intent(this, Preview::class.java)

        val names = arrayOf("A","B","C")
        val items = Array(names.size, {i -> names[i]})

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter


        listView.setOnItemClickListener { _, view, _, _ ->
            val textView = view.findViewById<TextView>(android.R.id.text1)
            intent.putExtra("image",R.drawable.keybord)
            startActivity(intent)

        }
       /* imageView2.setOnClickListener {
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
*/

    }
}
