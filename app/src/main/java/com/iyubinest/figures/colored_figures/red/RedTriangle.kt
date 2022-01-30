package com.iyubinest.figures.colored_figures.red

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colored_figures.yellow.YellowRectangle
import com.iyubinest.figures.colors.RedColor
import com.iyubinest.figures.figures.TriangleFigure

class RedTriangle : ColoredFigure(RedColor) {
  override fun figure() = TriangleFigure
  override fun transform() = YellowRectangle()
}