package com.iyubinest.figures.colored_figures.yellow

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.YellowColor
import com.iyubinest.figures.figures.CircleFigure

class YellowCircle : ColoredFigure(YellowColor) {
  override fun figure() = CircleFigure
  override fun transform() = YellowTriangle()
}
