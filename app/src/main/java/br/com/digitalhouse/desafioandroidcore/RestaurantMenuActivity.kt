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

        rvDishes.adapter = RestaurantMenuAdapter(this, restaurant.dishes)
        rvDishes.layoutManager = GridLayoutManager(this, 2)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}