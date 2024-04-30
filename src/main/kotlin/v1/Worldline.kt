package asteroid4.timeengine.v1

class Worldline() {
    val worldpoints = ArrayList<Worldpoint>()

    fun pointsAtTime(time: Int): Array<Worldpoint> {
        val output = ArrayList<Worldpoint>()
        worldpoints.forEach {worldpoint ->
            if (worldpoint.time == time) output += worldpoint
        }
        return output.toTypedArray()
    }
}