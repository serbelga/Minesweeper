package com.xacalet.minesweeper.common.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.xacalet.minesweeper.common.ui.resources.MinesweeperIcons
import kotlin.math.absoluteValue

sealed class DisplayValue {
    object Minus : DisplayValue()
    class Number(val number: Int) : DisplayValue()
}

@Composable
internal fun SevenSegment(
    modifier: Modifier = Modifier,
    displayValue: DisplayValue
) {
    val painter: Painter = when (displayValue) {
        DisplayValue.Minus -> MinesweeperIcons.DisplayMinus
        is DisplayValue.Number -> when (displayValue.number) {
            0 -> MinesweeperIcons.Display0
            1 -> MinesweeperIcons.Display1
            2 -> MinesweeperIcons.Display2
            3 -> MinesweeperIcons.Display3
            4 -> MinesweeperIcons.Display4
            5 -> MinesweeperIcons.Display5
            6 -> MinesweeperIcons.Display6
            7 -> MinesweeperIcons.Display7
            8 -> MinesweeperIcons.Display8
            9 -> MinesweeperIcons.Display9
            else -> throw IllegalArgumentException()
        }
    }
    Image(
        modifier = modifier,
        painter = painter,
        contentDescription = null
    )
}

@Composable
internal fun NumericDisplay(
    modifier: Modifier = Modifier,
    value: Int
) {
    val rangedValue = value.coerceIn(-99, 999)
    val displayValues = listOf(
        if (rangedValue < 0) {
            DisplayValue.Minus
        } else {
            DisplayValue.Number(rangedValue.absoluteValue.div(100).rem(10))
        },
        DisplayValue.Number(rangedValue.absoluteValue.div(10).rem(10)),
        DisplayValue.Number(rangedValue.absoluteValue % 10)
    )
    Row(
        modifier = modifier
            .background(Color.Black)
            .bevel(1.dp, type = BevelType.Lowered)
            .padding(2.dp)
    ) {
        SevenSegment(displayValue = displayValues[0])
        Spacer(modifier = Modifier.size(4.dp))
        SevenSegment(displayValue = displayValues[1])
        Spacer(modifier = Modifier.size(4.dp))
        SevenSegment(displayValue = displayValues[2])
    }
}
