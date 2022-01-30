package com.iyubinest.figures.colored_figures.yellow

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.YellowColor
import com.iyubinest.figures.figures.SquareFigure

class YellowSquare : ColoredFigure(YellowColor) {
  override fun figure() = SquareFigure
  override fun transform() = YellowRectangle()
}