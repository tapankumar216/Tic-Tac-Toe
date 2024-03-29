package com.file.tictactoe

sealed class UserActions {
    object PlayAgainButtonClicked: UserActions()
    data class BoardTapped(val cellNo: Int): UserActions()

}