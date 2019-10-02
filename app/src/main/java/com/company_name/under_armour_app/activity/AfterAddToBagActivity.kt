/**
 * Created by Joe Taveras.
 */

package com.company_name.under_armour_app.activity

import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.content.Context
import com.company_name.under_armour_app.R
import android.widget.ImageView
import android.os.Bundle
import android.view.View
import android.support.constraint.ConstraintLayout
import com.robotemi.sdk.Robot
import com.robotemi.sdk.TtsRequest


class AfterAddToBagActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, AfterAddToBagActivity::class.java)
		}
	}
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.after_add_to_bag_activity)
		this.init()
	}
	
	private fun init() {
	
	}

	fun pickUp(view: View) {
		val intent = Intent(this, FurtherAssistActivity::class.java).apply {

			Robot.getInstance().goTo("checkout")
			Robot.getInstance().speak(TtsRequest.create("Follow me to the checkout counter to pick up your new clothes.", false))


		}

		startActivity(intent)
	}
}
