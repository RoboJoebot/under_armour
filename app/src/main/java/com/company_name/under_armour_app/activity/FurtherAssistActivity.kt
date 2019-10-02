/**
 * Created by Joe Taveras.
 */

package com.company_name.under_armour_app.activity

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.support.constraint.ConstraintLayout
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.company_name.under_armour_app.R
import android.content.Intent
import com.robotemi.sdk.Robot
import com.robotemi.sdk.TtsRequest


class FurtherAssistActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, FurtherAssistActivity::class.java)
		}
	}
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.further_assist_activity)
		this.init()
	}
	
	private fun init() {
	
	}

	fun reset(view: View) {
		val intent = Intent(this, WelcomewalkCallShopActivity::class.java).apply {

			Robot.getInstance().speak(TtsRequest.create("Thank you for coming to Under Armour, have a great day! I'm off to help the next person. Say, what time do I go on lunch today?", false))
			Robot.getInstance().goTo("entrance")


		}

		startActivity(intent)
	}

	fun yes(view: View) {
		val intent = Intent(this, WalkCallShopRETURNActivity::class.java).apply {




		}

		startActivity(intent)
	}
}
