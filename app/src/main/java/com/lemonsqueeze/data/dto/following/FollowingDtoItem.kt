package com.lemonsqueeze.data.dto.following

import com.lemonsqueeze.data.model.FollowingModel

data class FollowingDtoItem (
    val id: String,
    val username: String
    ) {
    fun toFollowingModel(): FollowingModel = FollowingModel(
        id = this.id,
        username = this.username
    )
}