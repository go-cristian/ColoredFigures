package com.iyubinest.figures.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.iyubinest.figures.colors.FigureColor
import kotlin.math.roundToInt

@Composable
fun RowScope.ColorBox(
  figureColor: FigureColor,
  onDragFinished: (Rect) -> Unit,
) {
  var position by remember { mutableStateOf(Rect.Zero) }
  var offset by remember { mutableStateOf(Offset.Zero) }
  Box(
    modifier = Modifier
      .offset { IntOffset(offset.x.roundToInt(), offset.y.roundToInt()) }
      .height(50.dp)
      .weight(1f)
      .background(figureColor.color())
      .onGloballyPositioned {
        position = it.boundsInWindow()
      }
      .pointerInput(Unit) {
        detectDragGestures(
          onDragEnd = {
            onDragFinished(position)
            offset = Offset.Zero
          },
          onDrag = { change, dragAmount ->
            offset += dragAmount
          }
        )
      }
  )
}