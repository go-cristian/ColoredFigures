package com.iyubinest.figures.colored_figures.blue

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.BlueColor
import com.iyubinest.figures.figures.RectangleFigure

class BlueRectangle : ColoredFigure(BlueColor) {
  override fun figure() = RectangleFigure
  override fun transform() = this
}