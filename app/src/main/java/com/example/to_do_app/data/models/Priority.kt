package com.example.to_do_app.data.models


import androidx.compose.ui.graphics.Color
import com.example.to_do_app.ui.theme.*


enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}