package racingcar.domain

import java.lang.IllegalArgumentException

data class Position(
    val value: Int
) {

    init {
        if (value < 0) {
            throw IllegalArgumentException("위치는 0이상이어야 합니다.")
        }
    }

    constructor() : this(0)

    fun increase(step: Int): Position {
        return Position(value + step)
    }
}
