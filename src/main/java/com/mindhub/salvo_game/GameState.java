package com.mindhub.salvo_game;

public enum GameState {
    WAITING_FOR_OPPONENT,
    WAITING_FOR_YOUR_SHIPS,
    WAITING_FOR_ENEMY_SHIPS,
    WAITING_FOR_YOUR_SHOTS,
    WAITING_FOR_ENEMY_SHOTS,
    GAME_OVER_WON, GAME_OVER_TIE, GAME_OVER_LOSS
}