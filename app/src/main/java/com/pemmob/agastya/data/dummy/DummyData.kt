package com.pemmob.agastya.data.dummy

import com.pemmob.agastya.data.model.Category
import com.pemmob.agastya.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        // Makanan
        Product(id = 1, category_id = 1, category = categories[0], name = "Kripik Singkong", description = "Kripik gurih", price = 15000.0, stock = 50, img = "kripik_singkong"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Mendoan", description = "Tempe khas Banyumas", price = 20000.0, stock = 30, img = "mendoan"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Sale Pisang", description = "Sale manis", price = 25000.0, stock = 20, img = "sale_pisang"),
        Product(id = 4, category_id = 1, category = categories[0], name = "Getuk Goreng", description = "Getuk manis", price = 30000.0, stock = 40, img = "getuk_goreng"),
        Product(id = 5, category_id = 1, category = categories[0], name = "Nopia", description = "Kue nopia renyah", price = 22000.0, stock = 15, img = "nopia"),

        // Minuman
        Product(id = 6, category_id = 2, category = categories[1], name = "Es Dawet", description = "Dawet segar", price = 10000.0, stock = 25, img = "es_dawet"),
        Product(id = 7, category_id = 2, category = categories[1], name = "Kopi Robusta", description = "Kopi hitam mantap", price = 15000.0, stock = 30, img = "kopi_robusta"),
        Product(id = 8, category_id = 2, category = categories[1], name = "Es Cendol", description = "Cendol manis gurih", price = 12000.0, stock = 20, img = "es_cendol"),
        Product(id = 9, category_id = 2, category = categories[1], name = "Teh Melati", description = "Teh wangi", price = 8000.0, stock = 40, img = "teh_melati"),
        Product(id = 10, category_id = 2, category = categories[1], name = "Sirup Strawberry", description = "Sirup manis segar", price = 18000.0, stock = 15, img = "sirup_strawberry"),

        // Kerajinan
        Product(id = 11, category_id = 3, category = categories[2], name = "Batik Purbalingga", description = "Kain batik khas", price = 150000.0, stock = 10, img = "batik"),
        Product(id = 12, category_id = 3, category = categories[2], name = "Sandal Bandol", description = "Sandal ban bekas", price = 45000.0, stock = 25, img = "sandal_bandol"),
        Product(id = 13, category_id = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu lantai glagah", price = 25000.0, stock = 30, img = "sapu_glagah"),
        Product(id = 14, category_id = 3, category = categories[2], name = "Kerajinan Tempurung", description = "Kerajinan batok kelapa", price = 35000.0, stock = 12, img = "kerajinan_tempurung"),
        Product(id = 15, category_id = 3, category = categories[2], name = "Tas Rajut Kulit", description = "Tas rajut cantik", price = 85000.0, stock = 8, img = "tas_rajut")
    )
}
