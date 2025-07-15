package com.tpc.nudj.ui.screens.auth.emailVerification

data class EmailVerificationUiState(
    val isLoading: Boolean = false,
    val canResend: Boolean = false,
    val countdown: Int = 60,
    val message: String? = null,
)