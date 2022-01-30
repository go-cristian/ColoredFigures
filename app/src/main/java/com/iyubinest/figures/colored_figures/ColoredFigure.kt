package com.iyubinest.figures.colored_figures

import com.iyubinest.figures.colors.FigureColor
import com.iyubinest.figures.figures.Figure

abstract class ColoredFigure(
  private val figureColor: FigureColor,
) {
  abstract fun figure(): Figure
  abstract fun transform(): ColoredFigure
  fun color() = figureColor.color()
  fun name(): String = javaClass.simpleName
}