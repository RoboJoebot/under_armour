/**
 * Created by Joe Taveras.
 */

package com.company_name.under_armour_app.activity

import android.content.Intent
import com.company_name.under_armour_app.R
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.app.AppCompatActivity
import com.robotemi.sdk.Robot
import com.robotemi.sdk.TtsRequest


class WalkCallShopRETURNActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, WalkCallShopRETURNActivity::class.java)
		}
	}
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.walk_call_shop_returnactivity)
		this.init()
	}
	
	private fun init() {
	
	}

	fun walk1(view: View) {
		val intent = Intent(this, InitialwalkMenuActivity::class.java).apply {

			Robot.getInstance().speak(TtsRequest.create("What can I help you find today?", false))
		}

		startActivity(intent)
	}

	fun shop1(view: View) {
		val intent = Intent(this, ShopActivity::class.java).apply {
			Robot.getInstance().speak(TtsRequest.create("How swell. Let's get to shopping. Just scan an item's barcode to my camera and I can add it to your bag or you can try it on.", false))
		}

		startActivity(intent)
	}


	fun call1(view: View) {
		Robot.getInstance().startTelepresence(Robot.getInstance().adminInfo?.name, Robot.getInstance().adminInfo?.userId)

		Robot.getInstance().speak(TtsRequest.create("Now calling your very own personal stylist.", false))

	}
}
