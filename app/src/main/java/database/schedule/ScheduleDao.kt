package database.schedule

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ScheduleDao {
    @Query("SELECT * FROM database.schedule.schedule ORDER BY arrival_time ASC")
    fun getAll(): List<Schedule>

    @Query("SELECT * FROM database.schedule.schedule WHERE stop_name = :stopName ORDER BY arrival_time ASC")
    fun getByStopName(stopName: String): List<Schedule>

}