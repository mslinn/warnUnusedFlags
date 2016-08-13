import java.time.LocalDateTime

import scala.concurrent._, ExecutionContext.Implicits
import scala.concurrent.duration.Duration

object Test extends App {
  val now = LocalDateTime.now
  implicit val t = now

  // warn-unused-imports should generate a warning when this is commented out but it does not:
  // Console println implicitly[LocalDateTime]

  // warn-unused should generate a warning when this is present but it does not:
  val shouldComplain = now

  implicit val global = Implicits.global
  val f = Future(42)
  Console println Await.result(f, Duration.Inf)
}
