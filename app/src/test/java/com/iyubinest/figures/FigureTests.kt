package com.iyubinest.figures

import com.iyubinest.figures.colored_figures.red.RedCircle
import com.iyubinest.figures.colored_figures.yellow.*
import com.iyubinest.figures.colors.RedColor
import com.iyubinest.figures.colors.YellowColor
import com.iyubinest.figures.figures.CircleFigure
import com.iyubinest.figures.figures.LineFigure
import com.iyubinest.figures.figures.SquareFigure
import com.iyubinest.figures.figures.TriangleFigure
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test

class FigureTests {

  @Test
  fun `Yellow dropped on Square turns the shape into a Yellow rectangle`() {
    val figure = SquareFigure
    val expected = YellowRectangle()
    val newFigure = figure.drop(figure.with(YellowColor))
    MatcherAssert.assertThat(
      newFigure.name(),
      CoreMatchers.equalTo(expected.name())
    )
  }

  @Test
  fun `Yellow on Circle ⇒ Yellow Triangle`() {
    val figure = CircleFigure
    val expected = YellowTriangle()
    val newFigure = figure.drop(figure.with(YellowColor))
    MatcherAssert.assertThat(
      newFigure.name(),
      CoreMatchers.equalTo(expected.name())
    )
  }

  @Test
  fun `Yellow on Triangle ⇒ Yellow Line`() {
    val figure = TriangleFigure
    val expected = YellowLine()
    val newFigure = figure.drop(figure.with(YellowColor))
    MatcherAssert.assertThat(
      newFigure.name(),
      CoreMatchers.equalTo(expected.name())
    )
  }

  @Test
  fun `Yellow on Line ⇒ Yellow Circle`() {
    val figure = LineFigure
    val expected = YellowCircle()
    val newFigure = figure.drop(figure.with(YellowColor))
    MatcherAssert.assertThat(
      newFigure.name(),
      CoreMatchers.equalTo(expected.name())
    )
  }

  @Test
  fun `Red dropped on Square ⇒ turns the shape into a Circle`() {
    val figure = SquareFigure
    val expected = RedCircle()
    val newFigure = figure.drop(figure.with(RedColor))
    MatcherAssert.assertThat(
      newFigure.name(),
      CoreMatchers.equalTo(expected.name())
    )
  }

  @Test
  fun `Red on Circle ⇒ Yellow Square`() {
    val figure = CircleFigure
    val expected = YellowSquare()
    val newFigure = figure.drop(figure.with(RedColor))
    MatcherAssert.assertThat(
      newFigure.name(),
      CoreMatchers.equalTo(expected.name())
    )
  }

  @Test
  fun `With a Yellow Circle dropping Red ⇒ Yellow Square`() {
    val figure = YellowCircle().figure()
    val expected = YellowSquare()
    val newFigure = figure.drop(figure.with(RedColor))
    MatcherAssert.assertThat(
      newFigure.name(),
      CoreMatchers.equalTo(expected.name())
    )
  }

  @Test
  fun `Red on Triangle ⇒ Yellow Rectangle`() {
    val figure = TriangleFigure
    val expected = YellowRectangle()
    val newFigure = figure.drop(figure.with(RedColor))
    MatcherAssert.assertThat(
      newFigure.name(),
      CoreMatchers.equalTo(expected.name())
    )
  }

  @Test
  fun `Red on Line ⇒ Yellow Square`() {
    val figure = LineFigure
    val expected = YellowSquare()
    val newFigure = figure.drop(figure.with(RedColor))
    MatcherAssert.assertThat(
      newFigure.name(),
      CoreMatchers.equalTo(expected.name())
    )
  }
}

