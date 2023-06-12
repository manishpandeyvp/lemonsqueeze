package com.lemonsqueeze.data.dto

import com.lemonsqueeze.data.model.RecipeModel

data class RecipeDto (
    val title: String,
    val desc: String,
    val ingredients: List<String>,
    val steps: List<String>,
    val tips: String,
    val author: String,
    val imgUrl: String
    ) {
    fun toRecipeModel(): RecipeModel = RecipeModel(
        title = this.title,
        desc = this.desc,
        ingredients = this.ingredients,
        steps = this.steps,
        tips = this.tips,
        author = this.author,
        imgUrl = this.imgUrl
    )
}