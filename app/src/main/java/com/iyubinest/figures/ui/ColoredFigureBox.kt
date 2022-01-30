package com.iyubinest.figures.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.iyubinest.figures.colored_figures.ColoredFigure
import kotlin.math.roundToInt

@Composable
fun ColumnScope.ColoredFigureBox(
  coloredFigure: ColoredFigure,
  onPositioned: (Rect) -> Unit
) {
  val figure = coloredFigure.figure()
  val offset by remember { mutableStateOf(Offset.Zero) }
  Column(
    modifier = Modifier
      .weight(1f)
      .height(140.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    Box(
      modifier = Modifier
        .clip(figure.shape())
        .offset { IntOffset(offset.x.roundToInt(), offset.y.roundToInt()) }
        .border(1.dp, Color.Black, figure.shape())
        .width(figure.width())
        .height(figure.height())
        .background(coloredFigure.color())
        .onGloballyPositioned { coordinates ->
          onPositioned(coordinates.boundsInWindow())
        }
    )
    Text(text = coloredFigure.name())
  }
}