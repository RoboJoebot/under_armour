/**
 * Created by Joe Taveras.
 */

package com.company_name.under_armour_app.activity

import com.company_name.under_armour_app.R
import android.content.Intent
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import com.robotemi.sdk.Robot
import com.robotemi.sdk.TtsRequest


class TagActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, TagActivity::class.java)
		}
	}
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.tag_activity)
		this.init()
	}
	
	private fun init() {
	
	}

	fun addToBag(view: View) {
		val intent = Intent(this, AfterAddToBagActivity::class.java).apply {
			Robot.getInstance().speak(TtsRequest.create("The White Short Sleeved Shirt has been added to your bag. Let's get back to shopping!", false))

		}

		startActivity(intent)
	}

	fun tryOn (view: View){
		Robot.getInstance().speak(TtsRequest.create("Using augmented reality, this is when I would show you what this shirt would look like on you. Unfortunately, I'm not that smart.. yet.", false))
	}

	fun home2(view: View) {
		val intent = Intent(this, WalkCallShopRETURNActivity::class.java).apply {


		}

		startActivity(intent)
	}


}
