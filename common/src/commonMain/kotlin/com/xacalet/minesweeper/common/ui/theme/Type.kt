package com.xacalet.minesweeper.common.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

expect val mineSweeperFontFamily: FontFamily

object Type {
    val contiguousMineCountTextStyle = TextStyle(
        fontFamily = mineSweeperFontFamily,
        fontSize = 18.sp,
        baselineShift = BaselineShift(-0.16f),
        textAlign = TextAlign.Center
    )
}
