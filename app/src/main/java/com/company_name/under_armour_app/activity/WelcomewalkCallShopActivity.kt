/**
 * Created by Joe Taveras.
 */

package com.company_name.under_armour_app.activity

import android.os.Bundle
import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import io.supernova.uitoolkit.animation.ViewBackgroundProperties
import android.graphics.Color
import android.support.v4.view.animation.PathInterpolatorCompat
import android.view.View
import android.content.Intent
import com.company_name.under_armour_app.R
import android.util.TypedValue
import android.animation.*
import com.robotemi.sdk.Robot
import com.robotemi.sdk.TtsRequest
import kotlinx.android.synthetic.main.welcomewalk_call_shop_activity.*


class WelcomewalkCallShopActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, WelcomewalkCallShopActivity::class.java)
		}
	}
	
	private lateinit var lefttriangleImageView: ImageView
	private lateinit var bottomtriangleImageView: ImageView
	private lateinit var righttriangleImageView: ImageView
	private lateinit var toptriangleImageView: ImageView
	private lateinit var logouaImageView: ImageView
	private lateinit var emailsignupimageview: ImageView

	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.welcomewalk_call_shop_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure leftTriangle component
		lefttriangleImageView = this.findViewById(R.id.lefttriangle_image_view)
		
		// Configure bottomTriangle component
		bottomtriangleImageView = this.findViewById(R.id.bottomtriangle_image_view)
		
		// Configure RightTriangle component
		righttriangleImageView = this.findViewById(R.id.righttriangle_image_view)
		
		// Configure topTriangle component
		toptriangleImageView = this.findViewById(R.id.toptriangle_image_view)
		
		// Configure logoUA component
		logouaImageView = this.findViewById(R.id.logoua_image_view)

		emailsignupimageview = this.findViewById(R.id.emailsignup_image_view)
	}
// email signup

	fun startAnimationOne(view:View) {
	
		val animator1 = ObjectAnimator.ofPropertyValuesHolder(logouaImageView, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0f, 0.96f), Keyframe.ofFloat(0.5f, 0f), Keyframe.ofFloat(1f, 0f)))
		animator1.duration = 1000
		animator1.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet1 = AnimatorSet()
		animatorSet1.playTogether(animator1)
		animatorSet1.setTarget(logouaImageView)
		
		val animator2 = ObjectAnimator.ofPropertyValuesHolder(bottomtriangleImageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0f, 650f))
		animator2.duration = 700
		animator2.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		animator2.startDelay = 300
		
		val animatorSet2 = AnimatorSet()
		animatorSet2.playTogether(animator2)
		animatorSet2.setTarget(bottomtriangleImageView)
		val animator3 = ObjectAnimator.ofPropertyValuesHolder(toptriangleImageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0f, -650f))
		animator3.duration = 700
		animator3.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		animator3.startDelay = 300
		
		val animatorSet3 = AnimatorSet()
		animatorSet3.playTogether(animator3)
		animatorSet3.setTarget(toptriangleImageView)
		
		val animator4 = ObjectAnimator.ofPropertyValuesHolder(lefttriangleImageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 0f, -1100f))
		animator4.duration = 700
		animator4.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		animator4.startDelay = 300
		
		val animatorSet4 = AnimatorSet()
		animatorSet4.playTogether(animator4)
		animatorSet4.setTarget(lefttriangleImageView)
		
		val animator5 = ObjectAnimator.ofPropertyValuesHolder(righttriangleImageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 0f, 980f))
		animator5.duration = 700
		animator5.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		animator5.startDelay = 300
		
		val animatorSet5 = AnimatorSet()
		animatorSet5.playTogether(animator5)
		animatorSet5.setTarget(righttriangleImageView)
		
		val animatorSet6 = AnimatorSet()
		animatorSet6.playTogether(animatorSet1, animatorSet2, animatorSet3, animatorSet4, animatorSet5)
		animatorSet6.start()

		val animator6 = ObjectAnimator.ofPropertyValuesHolder(emailsignupimageview, PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0f, 0.96f), Keyframe.ofFloat(0.5f, 0f), Keyframe.ofFloat(1f, 0f)))
		animator6.duration = 1000
		animator6.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)

		val animatorSet7 = AnimatorSet()
		animatorSet7.playTogether(animator6)
		animatorSet7.setTarget(emailsignupimageview)

		emailsignupimageview.visibility = if (emailsignupimageview.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}

		Robot.getInstance().hideTopBar()
		Robot.getInstance().speak(TtsRequest.create("Welcome to Under Armour. Would you like to walk around, call a personal stylist, or get to shopping?", false))


	}

	fun walk(view: View) {
		val intent = Intent(this, InitialwalkMenuActivity::class.java).apply {
			Robot.getInstance().hideTopBar()
			Robot.getInstance().speak(TtsRequest.create("Let's go for a stroll shall we? What can I help you find?", false))


		}

		startActivity(intent)
	}
	fun shop(view: View) {
		val intent = Intent(this, ShopActivity::class.java).apply {
			Robot.getInstance().beWithMe()
			Robot.getInstance().hideTopBar()
			Robot.getInstance().speak(TtsRequest.create("Let's shop. Just scan your item's barcode to my camera and I can add it to your bag or you can try it on.", false))


		}

		startActivity(intent)
	}

	fun personalShopper(view: View) {
		Robot.getInstance().startTelepresence(Robot.getInstance().adminInfo?.name, Robot.getInstance().adminInfo?.userId)
		Robot.getInstance().speak(TtsRequest.create("Now calling your very own personal stylist.", false))

	}

	fun hideTop(view: View) {
		Robot.getInstance().hideTopBar()


	}
}
