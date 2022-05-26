package com.example.gonzalez_marcos_examen3t

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.gonzalez_marcos_examen3t.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val viewModel by viewModels<MusicViewModel>()

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    lateinit var navController: NavController
    lateinit var navHostFragment: NavHostFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar!!.setTitle("Music library")

        navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment_content_main) as NavHostFragment
        navController= navHostFragment.navController

        appBarConfiguration = AppBarConfiguration(
            setOf(  // Los que pasamos son los que se consideran top-level (no se muestra el icono "atrás"
                R.id.menu_fragment,
            )
        )


        /*Snackbar.make(mView, info, Snackbar.LENGTH_SHORT).setAction("Info",
            View.OnClickListener {
                //aqui cosas nazis
            }).show()
        mView es el binding.root*/
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.info-> AlertDialog.Builder(this).setMessage("Se ha restaurado la biblioteca")
                .setTitle("Reinicio").create().show()

        }
        viewModel.reiniciar()
        return super.onOptionsItemSelected(item)
    }


    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}