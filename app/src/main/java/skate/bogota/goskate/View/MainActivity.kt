package skate.bogota.goskate.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import skate.bogota.goskate.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_map_btn -> {
                    val login = Intent(this, MapsGoSkate::class.java)
                    startActivity(login)
                }

                R.id.cam_btn -> {
                    val login = Intent(this, galeryActivity::class.java)
                    startActivity(login)
                }

                R.id.new_spot_btn -> {
                    val login = Intent(this, newSpotActivity::class.java)
                    startActivity(login)
                }
            }

            true
        }

    }

}
