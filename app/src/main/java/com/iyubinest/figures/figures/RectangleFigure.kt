package com.iyubinest.figures.figures

import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

object RectangleFigure : Figure() {
  override fun width() = 80.dp
  override fun height() = 50.dp
  override fun shape() = RectangleShape
}
