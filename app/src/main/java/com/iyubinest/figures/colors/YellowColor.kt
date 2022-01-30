package com.iyubinest.figures.colors

import androidx.compose.ui.graphics.Color
import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colored_figures.yellow.*
import com.iyubinest.figures.figures.*

object YellowColor : FigureColor() {
  override fun create(figure: Figure): ColoredFigure {
    return when (figure) {
      is SquareFigure -> YellowSquare()
      is RectangleFigure -> YellowRectangle()
      is CircleFigure -> YellowCircle()
      is LineFigure -> YellowLine()
      is TriangleFigure -> YellowTriangle()
      else -> throw Error("figure not supported")
    }
  }

  override fun color() = Color.Yellow
}