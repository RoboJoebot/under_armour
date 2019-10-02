/**
 * Created by Joe Taveras.
 */

package com.company_name.under_armour_app.activity

import android.support.v7.app.AppCompatActivity
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.content.Intent
import android.util.TypedValue
import com.company_name.under_armour_app.R
import android.animation.*
import android.support.v4.view.animation.PathInterpolatorCompat
import android.os.Bundle
import android.graphics.Color
import io.supernova.uitoolkit.animation.ViewBackgroundProperties
import android.support.constraint.ConstraintLayout
import com.robotemi.sdk.Robot
import com.robotemi.sdk.TtsRequest


class ShopActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, ShopActivity::class.java)
		}
	}
	
	private lateinit var img40361ImageView: ImageView
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.shop_activity)
		this.init()
		
		this.startAnimationOne()
		this.follow()

	}
	
	private fun init() {
	
		// Configure IMG_40361 component
		img40361ImageView = this.findViewById(R.id.img40361_image_view)
	}
	
	fun startAnimationOne() {
	
		val animator1 = ObjectAnimator.ofPropertyValuesHolder(img40361ImageView, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0f, 1f), Keyframe.ofFloat(0.67f, 1f), Keyframe.ofFloat(1f, 0f)))
		animator1.duration = 3000
		animator1.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animator2 = ObjectAnimator.ofPropertyValuesHolder(img40361ImageView, PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.04f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.04f))
		animator2.duration = 3000
		animator2.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet1 = AnimatorSet()
		animatorSet1.playTogether(animator1, animator2)
		animatorSet1.setTarget(img40361ImageView)
		
		val animatorSet2 = AnimatorSet()
		animatorSet2.playTogether(animatorSet1)
		animatorSet2.start()
	}

	fun tag(view: View) {
		val intent = Intent(this, TagActivity::class.java).apply {
			Robot.getInstance().speak(TtsRequest.create("Good find! Would you like to add it to your bag, or try it on?", false))


		}

		startActivity(intent)
	}

	fun tag1(view: View) {
		val intent = Intent(this, TagActivity::class.java).apply {
			Robot.getInstance().speak(TtsRequest.create("Good find! Would you like to add it to your bag, or try it on?", false))


		}

		startActivity(intent)
	}

	fun follow(){

		Robot.getInstance().beWithMe()

	}

}
