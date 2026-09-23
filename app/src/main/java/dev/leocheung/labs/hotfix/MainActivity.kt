package dev.leocheung.labs.hotfix

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.leocheung.labs.hotfix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.list.text = PatchBoundaryCatalog.render()
    }
}
