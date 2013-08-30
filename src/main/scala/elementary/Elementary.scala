package elementary

import js.Dynamic.{ global => g }

object Elementary {
  def main(): Unit = {

    var str: String = ""

    // Alpha:
    // Attempt to have an component like Velocity require Position
    // Using self => Type attempt a variety of weird uses
    var b = new Ball(3, 5)
    b.x += 2
    b.y += 55
    str += "B = " + b.render()

    // Beta:
    // Attempt to have an entity expose a custom access interface
    // Such as a custom to_string method

    // Gamma:
    // Handling name clashes between traits
    // Try SentanceRenderer->render() and StringRenderer->render()
    // Should call specially defined one
    var renderer = new TextThing("Blah be blah")
    renderer.x = 23
    str += "<br />" + foo(renderer)

    // Something:
    // Handling multiple traits with the same base traits
    var obj = new Ball(3, 5)
    obj.x += 2
    obj.y += 10
    str += "<br />" + "Obj = "+ foo(obj)

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
