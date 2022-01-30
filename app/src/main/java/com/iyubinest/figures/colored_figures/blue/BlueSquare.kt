package com.iyubinest.figures.colored_figures.blue

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.BlueColor
import com.iyubinest.figures.figures.SquareFigure

class BlueSquare : ColoredFigure(BlueColor) {
  override fun figure() = SquareFigure
  override fun transform() = this
}