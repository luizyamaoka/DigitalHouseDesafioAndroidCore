package br.com.digitalhouse.desafioandroidcore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.digitalhouse.desafioandroidcore.domain.Dish
import br.com.digitalhouse.desafioandroidcore.domain.Restaurant
import kotlinx.android.synthetic.main.activity_restaurants_list.*

class RestaurantsListActivity : AppCompatActivity() {

    private val restaurants = getRestaurants()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants_list)

        rvRestaurants.adapter = RestaurantsListAdapter(this, restaurants)

    }

    fun getRestaurants() : ArrayList<Restaurant> {
        return arrayListOf(
            Restaurant(1, "Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "22:00", R.drawable.image1, getDishes()),
            Restaurant(2, "Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "00:00", R.drawable.image4, getDishes()),
            Restaurant(3, "Outback - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "00:00", R.drawable.image5, getDishes()),
            Restaurant(4, "Sí Señor!", "Alameda Jauaperi, 626 - Moema", "01:00", R.drawable.image3, getDishes())
        )
    }

    fun getDishes() : ArrayList<Dish> {
        val dish = Dish(1, "Salada com molho Gengibre", R.drawable.image4, "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritalis.")
        return ArrayList(
            generateSequence { dish }.take(10).toMutableList()
        )
    }

}