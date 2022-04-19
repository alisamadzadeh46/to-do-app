package com.example.to_do_app.navigation

import androidx.navigation.NavHostController
import com.example.to_do_app.util.Action

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = {action->
     navController.navigate("list/${action.name}")
    }
}