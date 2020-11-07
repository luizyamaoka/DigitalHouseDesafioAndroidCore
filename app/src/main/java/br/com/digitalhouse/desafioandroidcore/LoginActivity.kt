package br.com.digitalhouse.desafioandroidcore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.digitalhouse.desafioandroidcore.helper.AsteriskPasswordTransformationMethod
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        inputPassword.transformationMethod = AsteriskPasswordTransformationMethod()

        btnLogin.setOnClickListener { startActivity(Intent(this, RestaurantsListActivity::class.java)) }
        btnRegister.setOnClickListener { startActivity(Intent(this, RegistrationActivity::class.java)) }
    }
}