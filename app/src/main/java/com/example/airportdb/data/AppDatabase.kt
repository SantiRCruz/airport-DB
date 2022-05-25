package com.example.airportdb.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.airportdb.data.models.*

@Database(
    entities = [
        AirLineEntity::class, AirplaneEntity::class, AirplaneModelEntity::class, AirportEntity::class,
        ArriveEntity::class, CityEntity::class, CountryEntity::class, FlyEntity::class, HistoryUsersEntity::class,
        ProgramFliesEntity::class, ProvinceEntity::class, ScalesEntity::class, SeatingEntity::class, TypeScalesEntity::class,
        TypeUserEntity::class, UsersEntity::class, WeekDaysEntity::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getAirlineDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "airline_table"
            ).build()
            return INSTANCE!!
        }

        fun getAirPlaneDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "AirPlane_table"
            ).build()
            return INSTANCE!!
        }

        fun getAirPlaneModelDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "air_plane_model_table"
            ).build()
            return INSTANCE!!
        }

        fun getAirportDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "airport_table"
            ).build()
            return INSTANCE!!
        }

        fun getArriveDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "arrive_table"
            ).build()
            return INSTANCE!!
        }

        fun getCityDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "city_table"
            ).build()
            return INSTANCE!!
        }

        fun getCountryDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "country_table"
            ).build()
            return INSTANCE!!
        }

        fun getFlyDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "fly_table"
            ).build()
            return INSTANCE!!
        }

        fun getHistoryUserDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "history_table"
            ).build()
            return INSTANCE!!
        }

        fun getProgramFliesDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "program_flies_table"
            ).build()
            return INSTANCE!!
        }

        fun getProvinceDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "province_table"
            ).build()
            return INSTANCE!!
        }

        fun getScalesDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "scales-table"
            ).build()
            return INSTANCE!!
        }

        fun getSeatingDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "seating_table"
            ).build()
            return INSTANCE!!
        }

        fun getTypeScalesDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "type_scales_table"
            ).build()
            return INSTANCE!!
        }

        fun getTypeUserDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "type_user_table"
            ).build()
            return INSTANCE!!
        }

        fun getUserDatabase(context: Context): AppDatabase {
            INSTANCE = INSTANCE ?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "user_table"
            ).build()
            return INSTANCE!!
        }
        fun getWeekDaysDatabase(context: Context):AppDatabase{
            INSTANCE = INSTANCE?: Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "week_days_table"
            ).build()
            return INSTANCE!!
        }
    }
}