package com.ubrain.viewdemoproject

import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class ViewDemoActivity : AppCompatActivity() {
    private lateinit var mBtnR0: Button
    private lateinit var mBtn200: Button
    private lateinit var mView: View
    private lateinit var mBtnR20: Button
    private lateinit var mBtn250: Button
    private lateinit var mBtnR100: Button
    private lateinit var mBtnBorder10: Button
    private lateinit var mBtnBorder0: Button
    private lateinit var mBtn300: Button
    private lateinit var mBtnBorder1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        mBtnR0 = findViewById<Button>(R.id.btn_r0)
        mBtn200 = findViewById<Button>(R.id.btn_200)
        mView = findViewById<View>(R.id.view)
        mBtnR20 = findViewById<Button>(R.id.btn_r20)
        mBtn250 = findViewById<Button>(R.id.btn_250)
        mBtnR100 = findViewById<Button>(R.id.btn_r100)
        mBtnBorder10 = findViewById<Button>(R.id.btn_border10)
        mBtnBorder0 = findViewById<Button>(R.id.btn_border0)
        mBtn300 = findViewById<Button>(R.id.btn_300)
        mBtnBorder1 = findViewById<Button>(R.id.btn_border1)

        val gradientDrawable: GradientDrawable? = GradientDrawable()

        mBtn200.setOnClickListener {
            mView!!.layoutParams = LinearLayout.LayoutParams(dpToPx(200), dpToPx(200))
        }
        mBtn250.setOnClickListener {
            mView!!.layoutParams = LinearLayout.LayoutParams(dpToPx(250), dpToPx(250))
        }
       mBtn300.setOnClickListener {
            mView!!.layoutParams = LinearLayout.LayoutParams(dpToPx(300), dpToPx(300))
        }
       mBtnR0.setOnClickListener {
            gradientDrawable!!.color = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.color_ffbf00))
            gradientDrawable.cornerRadius = dpToPx(0).toFloat()
            mView!!.background = gradientDrawable
        }
       mBtnR20.setOnClickListener {
            gradientDrawable!!.color = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.color_ffbf00))
            gradientDrawable.cornerRadius = dpToPx(20).toFloat()
            mView!!.background = gradientDrawable
        }
        mBtnR100.setOnClickListener {
            gradientDrawable!!.color = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.color_ffbf00))
            gradientDrawable.cornerRadius = dpToPx(100).toFloat()
            mView!!.background = gradientDrawable
        }
       mBtnBorder0.setOnClickListener {
            gradientDrawable!!.color = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.color_ffbf00))
            gradientDrawable.setStroke(0, Color.BLACK)
            mView!!.background = gradientDrawable
        }
        mBtnBorder1.setOnClickListener {
            gradientDrawable!!.color = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.color_ffbf00))
            gradientDrawable.setStroke(1, Color.BLACK)
            mView!!.background = gradientDrawable
        }
       mBtnBorder10.setOnClickListener {
            gradientDrawable!!.color = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.color_ffbf00))
            gradientDrawable.setStroke(10, Color.BLACK)
            mView!!.background = gradientDrawable
        }
    }

    private fun dpToPx(dp: Int): Int {
        return (dp * Resources.getSystem().displayMetrics.density).toInt()
    }
}
