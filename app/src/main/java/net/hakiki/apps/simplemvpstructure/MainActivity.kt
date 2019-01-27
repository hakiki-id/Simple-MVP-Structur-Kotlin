package net.hakiki.apps.simplemvpstructure

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.hakiki.apps.simplemvpstructure.models.ResponseMessage
import net.hakiki.apps.simplemvpstructure.presenter.PresenterDataImplement
import net.hakiki.apps.simplemvpstructure.view.ResponseData

class MainActivity : AppCompatActivity(), ResponseData {


    lateinit var precenterImp:  PresenterDataImplement

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        precenterImp = PresenterDataImplement(this)

        btnGo.setOnClickListener {
            precenterImp.showmessage("gas kan brow")
        }
    }

    override fun success(response: ResponseMessage) {
        Toast.makeText(applicationContext, "=== response text ${response.msg}", Toast.LENGTH_LONG).show()
    }

    override fun error() {
        Log.e(this.localClassName, "error bwor")
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
