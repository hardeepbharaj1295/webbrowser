package sample

import javafx.fxml.FXML
import javafx.scene.control.TextField
import javafx.scene.web.WebView

class Controller {

    @FXML
    var text:TextField ?= null

    @FXML
    var web:WebView ?= null

    fun search(){

        val engine = web!!.engine
        engine.load("https://google.com/search?q=${text!!.text}")
        engine.isJavaScriptEnabled = true

    }

}
