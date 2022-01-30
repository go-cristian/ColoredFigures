package com.iyubinest.figures.colored_figures.yellow

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.YellowColor
import com.iyubinest.figures.figures.RectangleFigure

class YellowRectangle : ColoredFigure(YellowColor) {
  override fun figure() = RectangleFigure
  override fun transform() = this
}
