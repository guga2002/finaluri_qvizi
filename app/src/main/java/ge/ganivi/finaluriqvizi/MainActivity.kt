package ge.ganivi.finaluriqvizi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ge.ganivi.finaluriqvizi.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var ActivityMainBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding = ge.ganivi.finaluriqvizi.databinding.ActivityMainBinding.inflate(layoutInflater)
        setContentView(ActivityMainBinding.root)
        ActivityMainBinding.playQuizHomeBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, PlayActivity::class.java)
            startActivity(intent)
        }
    }
}