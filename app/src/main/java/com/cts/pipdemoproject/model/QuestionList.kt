package com.cts.pipdemoproject.model

data class QuestionList (
    val items:List<Question>?=null,
    val has_more:Boolean?=null,
    val quota_max:Int?=null,
    val  quota_remaining: Int?=null

)