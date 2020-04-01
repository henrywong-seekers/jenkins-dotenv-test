@Grab('io.github.cdimascio:java-dotenv:5.1.3')

import io.github.cdimascio.dotenv.Dotenv

class Test {
  def test(f) {
    Dotenv
      .configure()
      .filename(f)
      .load()
  }
}
