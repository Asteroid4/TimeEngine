package asteroid4.timeengine.v1

class Timeline() {
    private val worldlines = HashMap<String, Worldline>()

    operator fun get(worldlineName: String): Worldline? = worldlines[worldlineName]

    operator fun set(worldlineName: String, worldline: Worldline) { worldlines[worldlineName] = worldline }

    fun getGameState(time: Int): Array<Pair<String, Worldpoint>> {
        val output = ArrayList<Pair<String, Worldpoint>>()
        worldlines.forEach {(worldlineName, worldline) ->
            worldline.pointsAtTime(time).forEach {worldpoint ->
                output += Pair(worldlineName, worldpoint)
            }
        }
        return output.toTypedArray()
    }
}
