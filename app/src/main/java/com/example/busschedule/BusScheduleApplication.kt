package com.example.busschedule

import database.schedule.AppDatabase

class BusScheduleApplication : Application() {

    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}