package com.yalantis.filter.model

import java.io.Serializable

interface FilterModel : Serializable {

    fun getText(): String

}