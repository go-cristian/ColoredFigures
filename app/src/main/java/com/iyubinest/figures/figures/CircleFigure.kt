package com.iyubinest.figures.figures

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.unit.dp

object CircleFigure : Figure() {
  override fun width() = 50.dp
  override fun height() = 50.dp
  override fun shape() = CircleShape
}
