package com.iyubinest.figures.colored_figures.red

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.RedColor
import com.iyubinest.figures.figures.RectangleFigure

class RedRectangle : ColoredFigure(RedColor) {
  override fun figure() = RectangleFigure
  override fun transform() = this
}