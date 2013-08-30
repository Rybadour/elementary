package elementary

class SentenceRenderer(_str: String) extends StringRenderer {

  val str: String = _str
  
  var words: Array[String] = str.split(" ")

  def get_word(i: Int) = words(i)

  override def render(): String = "Sentence: "+str
}
