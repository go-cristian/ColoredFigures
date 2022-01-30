package com.iyubinest.figures.colored_figures.red

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colored_figures.yellow.YellowSquare
import com.iyubinest.figures.colors.RedColor
import com.iyubinest.figures.figures.CircleFigure

class RedCircle : ColoredFigure(RedColor) {
  override fun figure() = CircleFigure
  override fun transform() = YellowSquare()
}