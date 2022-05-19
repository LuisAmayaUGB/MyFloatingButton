package com.example.myfloatingbutton1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),  View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupFabButtons()

    }


    private fun setupFabButtons() {
        fab_menu_actions.shrink()
        fab_menu_actions.setOnClickListener(this)
        fab_menu_add_alarm.setOnClickListener(this)
        fab_menu_add_person.setOnClickListener(this)
    }



    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.fab_menu_actions -> {
                expandOrCollapseFAB()
            }
            R.id.fab_menu_add_alarm -> {
                showToast("Hello From Add Alarm Button")
            }
            R.id.fab_menu_add_person -> {
                showToast("Hello From Add Person Button")
            }
        }

    }



    private fun showToast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_SHORT).show()
    }

    private fun expandOrCollapseFAB() {
        if (fab_menu_actions.isExtended) {
            fab_menu_actions.shrink()
            fab_menu_add_alarm.hide()
            fab_menu_add_alarm_text.visibility = View.GONE
            fab_menu_add_person.hide()
            fab_menu_add_person_text.visibility = View.GONE
        } else {
            fab_menu_actions.extend()
            fab_menu_add_alarm.show()
            fab_menu_add_alarm_text.visibility = View.VISIBLE
            fab_menu_add_person.show()
            fab_menu_add_person_text.visibility = View.VISIBLE
        }
    }






}