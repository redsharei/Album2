package app.mikankenshi.album

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import app.mikankenshi.album.R

class MainActivity : AppCompatActivity() {
    //var num = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent: Intent = Intent(this, Preview::class.java)

        val names = arrayOf(
            "スタートメニューを表示",
            "デスクトップを表示",
            "Cortanaを起動",
            "設定画面を表示",
            "アクションセンターを表示",
            "Windows Ink Workspaceを起動",
            "タスクバーからアプリを起動",
            "アプリやウィンドウを切り替え",
            "タスクビューを表示",
            "仮装デスクトップを追加",
            "仮想デスクトップを切り替え",
            "仮想デスクトップを閉じる",
            "操作を元に戻す",
            "元に戻した操作をやり直す",
            "すべての項目を選択",
            "複数の項目を選択",
            "切る取り",
            "コピー",
            "貼り付け",
            "クリップボードの履歴を表示",
            "新規ウィンドウを開く",
            "ファイルを保存",
            "ファイルを開く",
            "ファイルを印刷",
            "ショートカットメニューを表示",
            "エクスプローラーを起動",
            "アイコンの表示形式を変更",
            "前のフォルダに戻る",
            "戻る前のフォルダに進む",
            "親フォルダに移動",
            "フォルダ名を変更",
            "新しいフォルダを作成",
            "フォルダを検索",
            "リボンを表紙",
            "複数項目を選択",
            "フォルダを完全削除",
            "ウィンドウを閉じる",
            "プロパティを表示",
            "プレビューパネルを表示",
            "アドレスバーに履歴を表示",
            "ウィンドウのメニューを表示",
            "ウィンドウを最大化・最小化",
            "ウィンドウを左半分・右半分に合わせる",
            "全てのウィンドウを最小化",
            "ウィンドウを閉じる",
            "画面表示のモードを選択",
            "スクリーンショットを撮影",
            "スクリーンショットを撮影して保存",
            "指定した範囲のスクリーンショットを撮影",
            "ファイル名を指定して実行",
            "タスクマネージャー",
            "パソコンをロック",
            "クイックリンクメニューを表示"
        )
        val items = Array(names.size, { i -> names[i] })

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter


        listView.setOnItemClickListener { _, _, position, _ ->
            //  val textView = view.findViewById<TextView>(android.R.id.text1)
            //num = position
            intent.putExtra("pos", position)
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
