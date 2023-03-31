package cl.hardcoder.game_of_life

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.fragment.NavHostFragment
import cl.hardcoder.game_of_life.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private val navHostFragment by lazy { supportFragmentManager.findFragmentById(R.id.nav_host_fragment_content_main) as NavHostFragment }
    private val navController by lazy { navHostFragment.navController }

    private val bottomNavigation by lazy { binding.bottomNavigation }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        initViews()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    private fun initViews() {
        initToolbar()
        initBottomNavigation()
    }

    private fun initToolbar() {
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    private fun initBottomNavigation() {
        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.bn_item_playground -> {
                    navController.navigate(R.id.to_playground_nav_graph)
                    true
                }
                R.id.bn_item_hub -> {
                    navController.navigate(R.id.to_hub_nav_graph)
                    true
                }
                R.id.bn_item_info -> {
                    navController.navigate(R.id.to_info_nav_graph)
                    true
                }
                else -> { false}
            }

        }
    }
}