package asteroid4.timeengine.v1

abstract class GameState() {
    abstract operator fun plus(event: GameEvent?): GameState
}
