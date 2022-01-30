package com.iyubinest.figures.colored_figures.blue

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.BlueColor
import com.iyubinest.figures.figures.CircleFigure

class BlueCircle : ColoredFigure(BlueColor) {
  override fun figure() = CircleFigure
  override fun transform() = this
}