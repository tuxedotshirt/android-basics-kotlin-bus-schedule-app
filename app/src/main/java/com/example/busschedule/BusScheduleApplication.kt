package com.example.busschedule

import database.database.AppDatabase
import android.app.Application

class BusScheduleApplication : Application() {

    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}