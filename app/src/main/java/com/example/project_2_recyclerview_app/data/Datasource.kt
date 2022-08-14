package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Anime

class Datasource {
    fun loadAnime() : List<Anime>{
        return listOf(
            Anime(R.string.anime1, R.drawable.nitero),
            Anime(R.string.anime2, R.drawable.hisoka),
            Anime(R.string.anime3, R.drawable.whatsapp_image_2022_07_31_at_1_00_23_pm),
            Anime(R.string.anime4, R.drawable.irumi),
            Anime(R.string.anime5, R.drawable.zeno),
            Anime(R.string.anime6, R.drawable.gon_freecs),
            Anime(R.string.anime7, R.drawable.killua_zoldyck)
        )
    }
}