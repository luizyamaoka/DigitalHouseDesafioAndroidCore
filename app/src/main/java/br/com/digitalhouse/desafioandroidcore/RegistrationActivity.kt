package br.com.digitalhouse.desafioandroidcore

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

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}