package com.example.restaurant

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class WelcomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        val introSlides = listOf(
            IntroSlides(
                "Welcome to the Recipe App",
                "Explore and discover a variety of delicious recipes to try.",
                R.drawable.img
            ),
            IntroSlides(
                "Easy-to-Follow Instructions",
                "Our recipes come with detailed preparation steps for hassle-free cooking.",
                R.drawable.img_1
            ),
            IntroSlides(
                "Save Your Favorites",
                "Bookmark your favorite recipes to access them anytime, anywhere.",
                R.drawable.img_2
            )

        )

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val adapter = IntroSlideAdapter(introSlides)
        viewPager.adapter = adapter
    }
}
