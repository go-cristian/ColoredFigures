package com.iyubinest.figures.colored_figures.yellow

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.YellowColor
import com.iyubinest.figures.figures.LineFigure

class YellowLine : ColoredFigure(YellowColor) {
  override fun figure() = LineFigure
  override fun transform() = YellowCircle()
}