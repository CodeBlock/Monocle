package monocle.thirdparty

import monocle.SimpleLens
import org.joda.time.DateTime

object datetime extends DateTimeInstances

trait DateTimeInstances {

  val minuteOfHour: SimpleLens[DateTime, Int] = {
    def _get(date: DateTime): Int = date.getMinuteOfHour
    def _set(date: DateTime, minutes: Int): DateTime = date.withMinuteOfHour(minutes)

    SimpleLens[DateTime, Int](_get, _set)
  }



}

