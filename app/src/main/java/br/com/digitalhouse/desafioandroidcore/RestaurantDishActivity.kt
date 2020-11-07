package br.com.digitalhouse.desafioandroidcore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.digitalhouse.desafioandroidcore.domain.Dish
import kotlinx.android.synthetic.main.activity_restaurant_dish.*
import kotlinx.android.synthetic.main.cover.*

class RestaurantDishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_dish)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        var dish = intent.getSerializableExtra("dish") as Dish

        ivCover.setImageResource(dish.image)
        tvCoverTitle.text = dish.name
        tvDishDescription.text = dish.description

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}