package br.com.digitalhouse.desafioandroidcore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.digitalhouse.desafioandroidcore.helper.AsteriskPasswordTransformationMethod
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        setSupportActionBar(toolbar)

        inputPassword.transformationMethod = AsteriskPasswordTransformationMethod()
        inputPasswordConfirmation.transformationMethod = AsteriskPasswordTransformationMethod()

        btnRegister.setOnClickListener{
            startActivity(
                Intent(this, RestaurantsListActivity::class.java)
            )
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}