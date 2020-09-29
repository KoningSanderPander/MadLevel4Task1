package nl.svdoetelaar.madlevel4task1.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
data class Product(
    @PrimaryKey
    @ColumnInfo(name = "product")
    var productName: String,

    var quantity: Long
)
