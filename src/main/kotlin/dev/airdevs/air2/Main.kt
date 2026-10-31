package dev.airdevs.air2

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import dev.airdevs.air2.presentation.screens.home.Air2HomeScreen
import dev.airdevs.air2.presentation.theme.A2Theme
import dev.airdevs.air2.presentation.theme.A2ThemeVariant

/**
 * Air2 Desktop 入口
 *
 * 三平台共用一套代码：Windows / Linux / macOS
 * UI 与 Android 完全一致（都是 Kotlin + Compose + Material3）
 */
fun main() = application {
    val windowState = rememberWindowState(
        size = DpSize(1280.dp, 720.dp),
        position = WindowPosition.Aligned(Alignment.Center),
    )

    Window(
        onCloseRequest = ::exitApplication,
        title = "Air2",
        state = windowState,
    ) {
        A2Theme(
            variant = A2ThemeVariant.Embermire,
            darkTheme = true,   // 先固定暗色；后续接系统主题
        ) {
            Air2HomeScreen(
                versionName = "1.21.1",
                versionType = "原版 · 隔离 · 关闭",
                accountName = "yitenchen1234",
                accountType = "第三方 (littleskin.cn)",
                onLaunch = { /* TODO: 接启动核心 */ },
                onOpenAccount = { /* TODO */ },
                onOpenDownloads = { /* TODO */ },
                onOpenSettings = { /* TODO */ },
            )
        }
    }
}
