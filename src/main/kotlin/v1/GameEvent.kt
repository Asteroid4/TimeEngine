package asteroid4.timeengine.v1

abstract class GameEvent {
    abstract fun isConnected(pastEvent: GameEvent): Boolean

    fun predictNext(): GameEvent? = null
}
