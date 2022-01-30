package com.iyubinest.figures.colors

import androidx.compose.ui.graphics.Color
import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.figures.Figure

sealed class FigureColor {
  abstract fun create(figure: Figure): ColoredFigure
  abstract fun color(): Color
}