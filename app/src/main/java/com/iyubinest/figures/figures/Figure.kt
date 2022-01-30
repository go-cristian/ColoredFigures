package com.iyubinest.figures.figures

import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.FigureColor

sealed class Figure {
  fun drop(coloredFigure: ColoredFigure): ColoredFigure {
    return coloredFigure.transform()
  }

  fun with(color: FigureColor): ColoredFigure {
    return color.create(this)
  }

  abstract fun width(): Dp
  abstract fun height(): Dp
  abstract fun shape(): Shape
}