package com.example.restaurant

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RecipeDetailsActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_details)

        // Get the selected recipe title from the intent
        val selectedRecipe = intent.getStringExtra("RECIPE_TITLE")

        // Use the selected recipe title to populate the details (dummy data for demonstration)
        val recipeTitleTextView: TextView = findViewById(R.id.recipeTitleTextView)
        val mealTypeTextView: TextView = findViewById(R.id.mealTypeTextView)
        val servingTextView: TextView = findViewById(R.id.servingTextView)
        val difficultyTextView: TextView = findViewById(R.id.difficultyTextView)
        val ingredientsTextView: TextView = findViewById(R.id.ingredientsTextView)
        val preparationTextView: TextView = findViewById(R.id.preparationTextView)

        recipeTitleTextView.text = selectedRecipe
        mealTypeTextView.text = "Meal Type: Breakfast"
        servingTextView.text = "Serves: 2"
        difficultyTextView.text = "Difficulty: Intermediate"
        ingredientsTextView.text = "Ingredients:\n- Ingredient 1\n- Ingredient 2\n- Ingredient 3"
        preparationTextView.text = "Preparation:\n1. Step 1\n2. Step 2\n3. Step 3\n..."
    }
}
