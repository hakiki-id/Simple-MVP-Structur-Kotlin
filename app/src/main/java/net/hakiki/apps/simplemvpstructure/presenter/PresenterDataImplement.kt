package net.hakiki.apps.simplemvpstructure.presenter

import net.hakiki.apps.simplemvpstructure.models.ResponseMessage
import net.hakiki.apps.simplemvpstructure.view.ResponseData

class PresenterDataImplement(view : ResponseData) : PresenterData {

    var viewModel : ResponseData? = null

    init {
        viewModel  = view
    }

    override fun showmessage(data: String) {

        if(data.isNotEmpty()){
             var model = ResponseMessage(data)
             viewModel?.success(model)
        }else {
            viewModel?.error()
        }
    }

}