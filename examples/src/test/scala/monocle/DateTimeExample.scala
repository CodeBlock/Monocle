package monocle

import org.specs2.scalaz.Spec
import org.joda.time.DateTime
import monocle.syntax.lens._
import monocle.thirdparty.datetime._


class DateTimeExample extends Spec {

  "minute is a Lens from DateTime to number of minutes"  in {
    val date = new DateTime(2014, 4, 12, 22, 12, 0)

    (date |-> minuteOfHour get) shouldEqual 12
    (date |-> minuteOfHour set 30) shouldEqual new DateTime(2014, 4, 12, 22, 30, 0)

   // (date |-> minuteOfHour set 70) shouldEqual new DateTime(2014, 4, 12, 23, 10, 0)


  }

}
