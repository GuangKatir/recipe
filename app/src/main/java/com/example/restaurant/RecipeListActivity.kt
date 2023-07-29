package com.example.restaurant

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class RecipeListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)

        // Sample recipe titles for demonstration
        val recipeTitles = arrayOf(
            "Drinks",
            "Breakfast",
            "Meal",
            "Snacks"
        )

        // Display recipe titles in a list view
        val recipeListView: ListView = findViewById(R.id.recipeListView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, recipeTitles)
        recipeListView.adapter = adapter

        // Set click listener to open Recipe Details when a recipe title is clicked
        recipeListView.setOnItemClickListener { _, _, position, _ ->
            val selectedRecipe = recipeTitles[position]
            val intent = Intent(this, RecipeDetailsActivity::class.java)
            intent.putExtra("RECIPE_TITLE", selectedRecipe)
            startActivity(intent)
        }
    }
}
