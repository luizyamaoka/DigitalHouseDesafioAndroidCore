package br.com.digitalhouse.desafioandroidcore.domain

import java.io.Serializable

class Restaurant(
    val id: Int, val name: String, val address: String,
    val closingHour: String, val image: Int, val dishes: ArrayList<Dish>) : Serializable