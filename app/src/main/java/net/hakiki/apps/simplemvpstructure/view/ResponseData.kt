package net.hakiki.apps.simplemvpstructure.view

import net.hakiki.apps.simplemvpstructure.models.ResponseMessage

interface ResponseData {

    fun success(response : ResponseMessage)

    fun error()
}