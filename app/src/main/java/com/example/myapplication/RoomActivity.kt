package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.room.*
import androidx.room.Database
import androidx.room.OnConflictStrategy.REPLACE

class RoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)


        val database = Room.databaseBuilder(
            applicationContext,
            UserDatabase::class.java,
            "user-database"
        ).allowMainThreadQueries().build()

        findViewById<TextView>(R.id.save).setOnClickListener {
            val userProfile = UserProfile("홍", "길동")
            database.userProfileDao().insert(userProfile)
        }

        findViewById<TextView>(R.id.load).setOnClickListener {
            val userProfiles = database.userProfileDao().getAll()
            userProfiles.forEach {
                Log.d("testt","${it.id} + ${it.firstName}")
            }

        }

        findViewById<TextView>(R.id.delete).setOnClickListener {
            database.userProfileDao().delete(1)
        }

    }
}

@Database(entities = [UserProfile::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userProfileDao(): UserProfileDao
}

@Dao
interface UserProfileDao {
    // Create
    @Insert(onConflict = REPLACE)
    fun insert(userProfile: UserProfile)

    // Delete
    @Query("DELETE FROM userprofile WHERE id = :userId")
    fun delete(userId: Int)

    // Query
    @Query("SELECT * FROM userprofile")
    fun getAll(): List<UserProfile>
}

@Entity
class UserProfile(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "last_name")
    val lastName: String,
    @ColumnInfo(name = "first_name")
    val firstName: String
) {
    constructor(lastName: String, firstName: String) : this(0, lastName,firstName)
}
