package com.iyubinest.figures.colors

import androidx.compose.ui.graphics.Color
import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colored_figures.blue.*
import com.iyubinest.figures.figures.*

object BlueColor : FigureColor() {
  override fun create(figure: Figure): ColoredFigure {
    return when (figure) {
      is SquareFigure -> BlueSquare()
      is RectangleFigure -> BlueRectangle()
      is CircleFigure -> BlueCircle()
      is LineFigure -> BlueLine()
      is TriangleFigure -> BlueTriangle()
      else -> throw Error("figure not supported")
    }
  }

  override fun color() = Color.Blue
}
