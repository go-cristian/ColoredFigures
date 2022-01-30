package com.iyubinest.figures.colored_figures.yellow

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.YellowColor
import com.iyubinest.figures.figures.TriangleFigure

class YellowTriangle : ColoredFigure(YellowColor) {
  override fun figure() = TriangleFigure
  override fun transform() = YellowLine()
}