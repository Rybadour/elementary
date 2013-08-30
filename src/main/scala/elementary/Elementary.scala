package elementary

import js.Dynamic.{ global => g }

object Elementary {
  def main(): Unit = {

    // Alpha:
    // Attempt to have an component like Velocity require Position
    // Using self => Type attempt a variety of weird uses

    // Beta:
    // Attempt to have an entity expose a custom access interface
    // Such as a custom to_string method

    // Gamma:
    // Handling name clashes between traits
    // Try SentanceRenderer->render() and StringRenderer->render()
    // Should call specially defined one
    var renderer = new TextThing("Blah be blah")
    renderer.x = 23
    var str: String = foo(renderer)

    // Something:
    // Handling multiple traits with the same base traits
    var obj = new Ball(3, 5)

    // Something else:
    // Handling traits with the same private field
    // Try with offset
    // Can you access the specific offset of each component

    val paragraph = g.document.createElement("div")
    paragraph.innerHTML = str + "<br />First is " + renderer.get_word(0)
    g.document.getElementById("playground").appendChild(paragraph)
  }

  def foo(r: StringRenderer with Position): String = {
    return r.render() + " and it's at ("+r.x+", "+r.y+")"
  }
}
