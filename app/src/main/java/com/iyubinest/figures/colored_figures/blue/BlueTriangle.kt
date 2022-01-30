package com.iyubinest.figures.colored_figures.blue

import com.iyubinest.figures.colored_figures.ColoredFigure
import com.iyubinest.figures.colors.BlueColor
import com.iyubinest.figures.figures.TriangleFigure

class BlueTriangle : ColoredFigure(BlueColor) {
  override fun figure() = TriangleFigure
  override fun transform() = this
}
