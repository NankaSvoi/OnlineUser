fun main(args: Array<String>) {

    agoToText(100000) // пример вызова функции
}
    fun agoToText(seconds: Int) {
        when (seconds) {
            in 0..60 ->
                println("был(а) только что")
            in 61..60 * 60 -> {
                val minutes =
                    seconds / 60
                println("был(а) $minutes ${minutesText(minutes)}  назад")
            }
            in (60 * 60 + 1)..(24 * 60 * 60) -> {
                val hours =
                    seconds / 3600
                println("был(а) $hours ${hoursText(hours)} назад")
            }

            in (24 * 60 * 60 + 1)..(2 * 24 * 60 * 60) ->
                println("был(а) вчера")
            in (2 * 24 * 60 * 60 + 1)..(3 * 24 * 60 * 60) ->
                println("был(а) позавчера")
            else -> println("был(а) давно")
        }
    }

    fun minutesText(minutes: Int):
            String {
        return when {
            minutes % 100 in 11..14 -> "минут" // исключение для 11 - 14
            minutes % 10 == 1 -> "минуту"
            minutes % 10 in 2..4 -> "минуты"
            else -> "минут"
        }
    }
    fun hoursText(hours: Int):
            String {
        return when {
            hours % 100 in 11..14 -> "часов" // исключение для 11 - 14
            hours % 10 == 1 -> "час"
            hours % 10 in 2..4 -> "часа"
            else -> "часов"
        }
    }
