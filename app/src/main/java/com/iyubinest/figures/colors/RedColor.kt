package com.iyubinest.figures.colors

import androidx.compose.ui.graphics.Color
import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colored_figures.red.*
import com.iyubinest.figures.figures.*

object RedColor : FigureColor() {
  override fun create(figure: Figure): ColoredFigure {
    return when (figure) {
      is SquareFigure -> RedSquare()
      is RectangleFigure -> RedRectangle()
      is CircleFigure -> RedCircle()
      is LineFigure -> RedLine()
      is TriangleFigure -> RedTriangle()
      else -> throw Error("figure not supported")
    }
  }

  override fun color() = Color.Red
}
