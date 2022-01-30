package com.iyubinest.figures.colored_figures.blue

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.BlueColor
import com.iyubinest.figures.figures.LineFigure

class BlueLine : ColoredFigure(BlueColor) {
  override fun figure() = LineFigure
  override fun transform() = this
}