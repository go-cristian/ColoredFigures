package com.iyubinest.figures.colored_figures.red

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.RedColor
import com.iyubinest.figures.figures.SquareFigure

class RedSquare : ColoredFigure(RedColor) {
  override fun figure() = SquareFigure
  override fun transform() = RedCircle()
}