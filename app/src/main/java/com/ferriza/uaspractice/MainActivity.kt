package com.ferriza.uaspractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.ImageView

class MainActivity() : AppCompatActivity(), View.OnClickListener, Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgMakanan: ImageView = findViewById(R.id.imgMakanan)
        imgMakanan.setOnClickListener(this)

        val imgRumah: ImageView = findViewById(R.id.imgRumah)
        imgRumah.setOnClickListener(this)

        val imgKids: ImageView = findViewById(R.id.imgKids)
        imgKids.setOnClickListener(this)

        val imgHealth: ImageView = findViewById(R.id.imgHealth)
        imgHealth.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.imgMakanan -> {
                val foodActivity = Intent(this, FoodActivity::class.java)
                startActivity(foodActivity)
            }

            R.id.imgRumah -> {
                val houseActivity = Intent(this, HouseActivity::class.java)
                startActivity(houseActivity)
            }

            R.id.imgKids -> {
                val KidsActivity = Intent(this, KidsActivity::class.java)
                startActivity(KidsActivity)
            }

            R.id.imgHealth -> {
                val healthActivity2 = Intent(this, HealthActivity2::class.java)
                startActivity(healthActivity2)
            }

        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}

