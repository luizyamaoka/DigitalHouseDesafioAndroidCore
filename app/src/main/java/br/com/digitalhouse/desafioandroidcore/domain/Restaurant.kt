package br.com.digitalhouse.desafioandroidcore.domain

data class Restaurant(
    val id: Int, val name: String, val address: String,
    val closingHour: String, val image: Int, val dishes: ArrayList<Dish>)