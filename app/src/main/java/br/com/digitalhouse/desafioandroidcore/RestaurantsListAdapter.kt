package br.com.digitalhouse.desafioandroidcore

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse.desafioandroidcore.domain.Restaurant
import kotlinx.android.synthetic.main.item_restaurant.view.*

class RestaurantsListAdapter(
    val context: Context,
    private val restaurants: ArrayList<Restaurant>): RecyclerView.Adapter<RestaurantsListAdapter.RestaurantViewHolder>() {

    class RestaurantViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val cvRestaurant : CardView = view.cvRestaurant
        val ivRestaurant : ImageView = view.ivRestaurant
        val tvRestaurantName : TextView = view.tvRestaurantName
        val tvRestaurantAddress : TextView = view.tvRestaurantAddress
        val tvRestaurantClosingHour : TextView = view.tvRestaurantClosingHour
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun getItemCount() = restaurants.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val restaurant = restaurants.get(position)

        holder.ivRestaurant.setImageResource(restaurant.image)
        holder.tvRestaurantName.text = restaurant.name
        holder.tvRestaurantAddress.text = restaurant.address
        holder.tvRestaurantClosingHour.text = "Fecha às ${restaurant.closingHour}"

        holder.cvRestaurant.setOnClickListener {
            context.startActivity(
                Intent(context, RestaurantMenuActivity::class.java).putExtra("restaurant", restaurant)
            )
        }
    }
}