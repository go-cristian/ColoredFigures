package com.iyubinest.figures.figures

import androidx.compose.ui.unit.dp
import com.iyubinest.figures.ui.TriangleShape

object TriangleFigure : Figure() {
  override fun width() = 50.dp
  override fun height() = 50.dp
  override fun shape() = TriangleShape
}
