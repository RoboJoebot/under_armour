/**
 * Created by Joe Taveras.
 */

package com.company_name.under_armour_app.activity

import android.os.Bundle
import android.content.Context
import android.support.constraint.ConstraintLayout
import com.company_name.under_armour_app.R
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView


class WalkMenuReturnActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, WalkMenuReturnActivity::class.java)
		}
	}
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.walk_menu_return_activity)
		this.init()
	}
	
	private fun init() {
	
	}
}
