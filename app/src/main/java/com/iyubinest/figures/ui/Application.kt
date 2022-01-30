package com.iyubinest.figures.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.unit.dp
import com.iyubinest.figures.colored_figures.yellow.*
import com.iyubinest.figures.colors.BlueColor
import com.iyubinest.figures.colors.RedColor
import com.iyubinest.figures.colors.YellowColor

val colors = listOf(YellowColor, RedColor, BlueColor)
val shapes = listOf(
  YellowCircle(),
  YellowSquare(),
  YellowRectangle(),
  YellowLine(),
  YellowTriangle(),
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Application() {

  val state = remember { mutableStateOf(shapes) }
  val coordinates = remember { mutableStateMapOf<Int, Rect>() }

  Column(
    modifier = Modifier.fillMaxSize(),
  ) {
    LazyVerticalGrid(
      cells = GridCells.Fixed(2),
      contentPadding = PaddingValues(8.dp),
      modifier = Modifier.weight(1f),
    ) {
      state.value.forEachIndexed { index, coloredFigure ->
        item {
          ColoredFigureBox(coloredFigure) { rect ->
            coordinates[index] = rect
          }
        }
      }
    }
    Row {
      colors.forEach { figureColor ->
        ColorBox(figureColor) { position ->
          coordinates.forEach { entry ->
            if (entry.value.overlaps(position)) {
              val newState = state.value.toMutableList()
              val figure = state.value[entry.key].figure()
              newState[entry.key] = figure.drop(figure.with(figureColor))
              state.value = newState
            }
          }
        }
      }
    }
  }
}
