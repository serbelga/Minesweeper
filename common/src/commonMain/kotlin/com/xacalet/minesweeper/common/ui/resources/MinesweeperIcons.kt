package com.xacalet.minesweeper.common.ui.resources

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
object MinesweeperIcons {
    val CellFlag: Painter @Composable get() = painterResource("icons/ic_cell_flag.xml")

    val CellMine: Painter @Composable get() = painterResource("icons/ic_cell_mine.xml")

    val CellWrongFlag: Painter @Composable get() = painterResource("icons/ic_cell_wrong_flag.xml")

    val Display0: Painter @Composable get() = painterResource("icons/ic_display_0.xml")

    val Display1: Painter @Composable get() = painterResource("icons/ic_display_1.xml")

    val Display2: Painter @Composable get() = painterResource("icons/ic_display_2.xml")

    val Display3: Painter @Composable get() = painterResource("icons/ic_display_3.xml")

    val Display4: Painter @Composable get() = painterResource("icons/ic_display_4.xml")

    val Display5: Painter @Composable get() = painterResource("icons/ic_display_5.xml")

    val Display6: Painter @Composable get() = painterResource("icons/ic_display_6.xml")

    val Display7: Painter @Composable get() = painterResource("icons/ic_display_7.xml")

    val Display8: Painter @Composable get() = painterResource("icons/ic_display_8.xml")

    val Display9: Painter @Composable get() = painterResource("icons/ic_display_9.xml")

    val DisplayMinus: Painter @Composable get() = painterResource("icons/ic_display_minus.xml")

    val SmileyDizzy: Painter @Composable get() = painterResource("icons/ic_smiley_dizzy.xml")

    val SmileySmiling: Painter @Composable get() = painterResource("icons/ic_smiley_smiling.xml")

    val SmileySunglasses: Painter @Composable get() = painterResource("icons/ic_smiley_sunglasses.xml")

    val SmileySurprised: Painter @Composable get() = painterResource("icons/ic_smiley_surprised.xml")
}
