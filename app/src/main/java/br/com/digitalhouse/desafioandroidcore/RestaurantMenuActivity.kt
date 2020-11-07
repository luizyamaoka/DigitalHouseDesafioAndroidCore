package br.com.digitalhouse.desafioandroidcore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import br.com.digitalhouse.desafioandroidcore.domain.Restaurant
import kotlinx.android.synthetic.main.activity_restaurant_menu.*

class RestaurantMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_menu)
        setSupportActionBar(toolbar)

        val restaurant = intent.getSerializableExtra("restaurant") as Restaurant

        tvRestaurantName.text = restaurant.name
        ivRestaurant.setImageResource(restaurant.image)

//        val dish = Dish(1, "Salada com molho Gengibre", R.drawable.image4, "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritalis.")
        rvDishes.adapter = RestaurantMenuAdapter(this, restaurant.dishes)
        rvDishes.layoutManager = GridLayoutManager(this, 2)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}