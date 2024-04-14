package com.example.beehive

import com.google.gson.annotations.SerializedName

data class LoginResponse(

	@field:SerializedName("response")
	val response: List<ResponseItem?>? = null
)

data class ResponseItem(

	@field:SerializedName("code")
	val code: String? = null,

	@field:SerializedName("message")
	val message: String? = null
)
