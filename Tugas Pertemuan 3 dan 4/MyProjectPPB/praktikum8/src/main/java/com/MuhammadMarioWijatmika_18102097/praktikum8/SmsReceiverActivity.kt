package com.MuhammadMarioWijatmika_18102097.praktikum8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SmsReceiverActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_SMS_NO = "extra_sms_no"
        const val EXTRA_SMS_MESSAGE = "extra_sms_message"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_receiver)
    }
}