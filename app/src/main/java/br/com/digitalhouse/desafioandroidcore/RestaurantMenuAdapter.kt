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
import br.com.digitalhouse.desafioandroidcore.domain.Dish
import kotlinx.android.synthetic.main.item_dish.view.*

class RestaurantMenuAdapter(
    private val context: Context,
    private val dishes : ArrayList<Dish>) : RecyclerView.Adapter<RestaurantMenuAdapter.DishViewHolder>() {

    class DishViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val cvDish : CardView = view.cvDish
        val ivDish : ImageView = view.ivDish
        val tvDishName : TextView = view.tvDishName
    }

    override fun getItemCount() = dishes.size

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val dish = dishes.get(position)
        holder.ivDish.setImageResource(dish.image)
        holder.tvDishName.text = dish.name

        holder.cvDish.setOnClickListener{
            context.startActivity(
                Intent(context, RestaurantDishActivity::class.java)
                    .putExtra("dish", dish)
            )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_dish, parent, false)
        return DishViewHolder(view)
    }
}