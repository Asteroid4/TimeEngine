package asteroid4.timeengine.v1

class Timeline(private val startingState: GameState, private val timewaveSpeed: Int) {
    private val events = ArrayList<GameEvent?>()
    val timewaves = ArrayList<Int>()

    operator fun plusAssign(event: GameEvent) { events += event }

    fun constructState(moment: Int = events.lastIndex) = events.subList(0, moment+1).fold(startingState) { state, event -> state + event }

    fun getEvents() = events.toList()

    fun setEvent(index: Int, event: GameEvent) { events[index] = event }
}
