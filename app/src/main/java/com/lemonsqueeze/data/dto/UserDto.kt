package com.lemonsqueeze.data.dto

import com.lemonsqueeze.data.model.UserModel

data class UserDto (
    val username: String,
    val email: String
    ) {
    fun toUserModel(): UserModel = UserModel(
        username = this.username,
        email = this.email
    )
}