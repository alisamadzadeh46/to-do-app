package com.example.to_do_app.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.to_do_app.ui.screens.task.TaskScreen
import com.example.to_do_app.util.Action
import com.example.to_do_app.util.Constants.TASK_ARGUMENT_KEY
import com.example.to_do_app.util.Constants.TASK_SCREEN


fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        TaskScreen(navigateToListScreen = navigateToListScreen)
    }

}