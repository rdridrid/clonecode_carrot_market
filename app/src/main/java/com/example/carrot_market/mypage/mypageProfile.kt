package com.example.carrot_market.mypage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.carrot_market.R
import com.example.carrot_market.databinding.ActivityMainBinding
import com.example.carrot_market.databinding.ActivityMypageProfileBinding
import com.skydoves.balloon.ArrowPositionRules
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.BalloonSizeSpec
import com.skydoves.balloon.createBalloon

class mypageProfile : AppCompatActivity() {
    lateinit var binding: ActivityMypageProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMypageProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val balloon = createBalloon(this){
            setWidthRatio(1.0f)
            setHeight(BalloonSizeSpec.WRAP)
            setText("테스트")
            setTextColorResource(com.google.android.material.R.color.abc_background_cache_hint_selector_material_dark)
            setTextSize(15f)
            setIconDrawableResource(R.drawable.button_design)
            setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
            setArrowSize(10)
            setArrowPosition(0.5f)
            setPadding(12)
            setCornerRadius(8f)
            setBackgroundColorResource(com.google.android.material.R.color.material_blue_grey_800)
            setBalloonAnimation(BalloonAnimation.ELASTIC)
            setLifecycleOwner(lifecycleOwner)
            build()
        }
        balloon.showAlignBottom(binding.mannerTempExplain)
    }
}