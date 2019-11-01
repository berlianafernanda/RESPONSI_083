package com.example.listview_icon

import com.example.responsi083.R

object detail {


    private val foodName = arrayOf(
        "bakso",
        "ayam geprek",
        "mie ayam",
        "mie goreng",
        "nasi goreng",
        "pecel",
        "ramen",
        "rawon",
        "sushi",
        "nasi kuning"
    )

    private val detail = arrayOf(
        "bakso adalah makan asal jawa tengah",
        "ayam geprek adalah ayam yang di geprek dan dikasih sambal",
        "mie ayam adalah mie kuning yang di rebus dan dikasih potongan ayam",
        "mie goreng adalah mie ang digoreng",
        "nasi goreng adalah makanan khas indonesia",
        "pecel adalah makanan khas dari daerah madiun",
        "rame adalah makanan khas korea",
        "rawon adalah masakan Indonesia berupa sup daging berkuah hitam sebagai campuran bumbu khas yang menggunakan kluwek.",
        "sushi adalah makanan khas jepang",
        "nasi kuning adalah nasi yang biasa digunakan untuk tumpengan"
    )

    private val foodPoster = intArrayOf(
        R.drawable.bakso,
        R.drawable.geprek,
        R.drawable.mieayam,
        R.drawable.miegoreng,
        R.drawable.nasgor,
        R.drawable.pecel,
        R.drawable.ramen,
        R.drawable.rawon,
        R.drawable.sushi,
        R.drawable.nasikuning
    )

    val listfood: ArrayList<food>
        get() {
            val list = arrayListOf<food>()
            for (position in foodName.indices) {
                val food = food()
                food.name = foodName[position]
                food.detail = detail[position]
                food.poster = foodPoster[position]
                list.add(food)
            }
            return list
        }
}


