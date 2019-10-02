/**
 * Created by Joe Taveras.
 */

package com.company_name.under_armour_app.activity

import android.view.View
import android.os.Bundle
import android.graphics.Color
import android.animation.*
import android.util.TypedValue
import android.widget.ImageView
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.support.constraint.ConstraintLayout
import android.support.v4.view.animation.PathInterpolatorCompat
import com.company_name.under_armour_app.R
import io.supernova.uitoolkit.animation.ViewBackgroundProperties
import android.content.Intent
import com.robotemi.sdk.Robot
import com.robotemi.sdk.TtsRequest


class InitialwalkMenuActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, InitialwalkMenuActivity::class.java)
		}
	}
	
	private lateinit var menbuttonImageView: ImageView
	private lateinit var topleftsquareImageView: ImageView
	private lateinit var bottomrightsquareImageView: ImageView
	private lateinit var backbutton1ImageView: ImageView
	private lateinit var accessoriesImageView: ImageView
	private lateinit var bottomsImageView: ImageView
	private lateinit var outerwearImageView: ImageView
	private lateinit var jacketsImageView: ImageView
	private lateinit var shirtsImageView: ImageView
	private lateinit var ualogo2ImageView: ImageView
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.initialwalk_menu_activity)
		this.init()
		this.hideShirts()


	}
	
	private fun init() {
	
		// Configure menbutton component
		menbuttonImageView = this.findViewById(R.id.menbutton_image_view)
		
		// Configure TopLeftSquare component
		topleftsquareImageView = this.findViewById(R.id.topleftsquare_image_view)
		
		// Configure BottomRightSquare component
		bottomrightsquareImageView = this.findViewById(R.id.bottomrightsquare_image_view)
		
		// Configure backbutton1 component
		backbutton1ImageView = this.findViewById(R.id.backbutton1_image_view)
		
		// Configure Accessories component
		accessoriesImageView = this.findViewById(R.id.accessories_image_view)
		
		// Configure Bottoms component
		bottomsImageView = this.findViewById(R.id.bottoms_image_view)
		
		// Configure Outerwear component
		outerwearImageView = this.findViewById(R.id.outerwear_image_view)
		
		// Configure Jackets component
		jacketsImageView = this.findViewById(R.id.jackets_image_view)
		
		// Configure Shirts component
		shirtsImageView = this.findViewById(R.id.shirts_image_view)
		
		// Configure UaLOGO2 component
		ualogo2ImageView = this.findViewById(R.id.ualogo2_image_view)
	}
	
	fun startAnimationOne() {
	
		val animator1 = ObjectAnimator.ofPropertyValuesHolder(ualogo2ImageView, PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, -170f, this.resources.displayMetrics)), Keyframe.ofFloat(0.81f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, -170f, this.resources.displayMetrics)), Keyframe.ofFloat(1f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 0f, this.resources.displayMetrics))))
		animator1.duration = 1850
		animator1.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet1 = AnimatorSet()
		animatorSet1.playTogether(animator1)
		animatorSet1.setTarget(ualogo2ImageView)
		
		val animator2 = ObjectAnimator.ofPropertyValuesHolder(topleftsquareImageView, PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, -690f, this.resources.displayMetrics)), Keyframe.ofFloat(0.46f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, -690f, this.resources.displayMetrics)), Keyframe.ofFloat(1f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 0f, this.resources.displayMetrics))))
		animator2.duration = 1850
		animator2.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet2 = AnimatorSet()
		animatorSet2.playTogether(animator2)
		animatorSet2.setTarget(topleftsquareImageView)
		
		val animator3 = ObjectAnimator.ofPropertyValuesHolder(shirtsImageView, PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, -700f, this.resources.displayMetrics)), Keyframe.ofFloat(0.38f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, -500f, this.resources.displayMetrics)), Keyframe.ofFloat(1f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 0f, this.resources.displayMetrics))))
		animator3.duration = 1850
		animator3.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet3 = AnimatorSet()
		animatorSet3.playTogether(animator3)
		animatorSet3.setTarget(shirtsImageView)
		
		val animator4 = ObjectAnimator.ofPropertyValuesHolder(jacketsImageView, PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, -1100f, this.resources.displayMetrics)), Keyframe.ofFloat(0.7f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, -266f, this.resources.displayMetrics)), Keyframe.ofFloat(1f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 0.5f, this.resources.displayMetrics))))
		animator4.duration = 1850
		animator4.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet4 = AnimatorSet()
		animatorSet4.playTogether(animator4)
		animatorSet4.setTarget(jacketsImageView)
		
		val animator5 = ObjectAnimator.ofPropertyValuesHolder(outerwearImageView, PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, -1200f, this.resources.displayMetrics)), Keyframe.ofFloat(0.38f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, -665f, this.resources.displayMetrics)), Keyframe.ofFloat(1f, TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 0f, this.resources.displayMetrics))))
		animator5.duration = 1850
		animator5.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet5 = AnimatorSet()
		animatorSet5.playTogether(animator5)
		animatorSet5.setTarget(outerwearImageView)
		
		val animator6 = ObjectAnimator.ofPropertyValuesHolder(bottomsImageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, -2000f, 0f))
		animator6.duration = 1850
		animator6.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet6 = AnimatorSet()
		animatorSet6.playTogether(animator6)
		animatorSet6.setTarget(bottomsImageView)
		
		val animator7 = ObjectAnimator.ofPropertyValuesHolder(accessoriesImageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, -2000f, 0f))
		animator7.duration = 1850
		animator7.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet7 = AnimatorSet()
		animatorSet7.playTogether(animator7)
		animatorSet7.setTarget(accessoriesImageView)
		
		val animator8 = ObjectAnimator.ofPropertyValuesHolder(bottomrightsquareImageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, -2000f, 0f))
		animator8.duration = 1850
		animator8.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet8 = AnimatorSet()
		animatorSet8.playTogether(animator8)
		animatorSet8.setTarget(bottomrightsquareImageView)
		
		val animator9 = ObjectAnimator.ofPropertyValuesHolder(backbutton1ImageView, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, -2000f, 0f))
		animator9.duration = 1850
		animator9.interpolator = PathInterpolatorCompat.create(0.42f, 0f, 0.58f, 1f)
		
		val animatorSet9 = AnimatorSet()
		animatorSet9.playTogether(animator9)
		animatorSet9.setTarget(backbutton1ImageView)
		
		val animatorSet10 = AnimatorSet()
		animatorSet10.playTogether(animatorSet1, animatorSet2, animatorSet3, animatorSet4, animatorSet5, animatorSet6, animatorSet7, animatorSet8, animatorSet9)
		animatorSet10.start()
	}

	fun menClick(view:View){

		startAnimationOne()
		shirtsImageView.visibility = if (shirtsImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		bottomrightsquareImageView.visibility = if (bottomrightsquareImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		backbutton1ImageView.visibility = if (backbutton1ImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		outerwearImageView.visibility = if (outerwearImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		bottomsImageView.visibility = if (bottomsImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		jacketsImageView.visibility = if (jacketsImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		accessoriesImageView.visibility = if (accessoriesImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		topleftsquareImageView.visibility = if (topleftsquareImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		ualogo2ImageView.visibility = if (ualogo2ImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		Robot.getInstance().speak(TtsRequest.create("We have a wide assortment of men's clothing. What can I help you find today?", false))
	}

	fun hideShirts() {
		shirtsImageView.visibility = if (shirtsImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		bottomrightsquareImageView.visibility = if (bottomrightsquareImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		backbutton1ImageView.visibility = if (backbutton1ImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		outerwearImageView.visibility = if (outerwearImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		bottomsImageView.visibility = if (bottomsImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		jacketsImageView.visibility = if (jacketsImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		accessoriesImageView.visibility = if (accessoriesImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		topleftsquareImageView.visibility = if (topleftsquareImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}
		ualogo2ImageView.visibility = if (ualogo2ImageView.visibility == View.INVISIBLE){
			View.VISIBLE
		} else{
			View.INVISIBLE
		}

	}

	fun goShop(view: View) {
		val intent = Intent(this, ShopActivity::class.java).apply {

			Robot.getInstance().speak(TtsRequest.create("Let's shop! Just scan an item's barcode to my camera and I can add it to your bag or you can try it on.", false))


		}

		startActivity(intent)
	}

	fun home(view: View) {
		val intent = Intent(this, WalkCallShopRETURNActivity::class.java).apply {


		}

		startActivity(intent)
	}

	fun goShirts(view: View){
		Robot.getInstance().goTo("shirts")
		Robot.getInstance().speak(TtsRequest.create("Alright then. On to the shirts we go.", false))
	}

	fun goJackets(view: View){
		Robot.getInstance().goTo("jackets")
	}
	fun goOuterwear(view: View){
		Robot.getInstance().goTo("outerwear")
	}
	fun goBottoms(view: View){
		Robot.getInstance().goTo("bottoms")
	}
	fun goAccessories(view: View){
		Robot.getInstance().goTo("accessories")
	}
}
