package elementary.TR.core

class Scene() extends {
  protected val _entities: IntMap[HasId] = new Array
  protected var _isPaused: Boolean = false

  def add(e: HasId) = {
    _entities.set(e.id, e)
  }

  def has(e: HasId): Boolean = {
    return _entities.has(e.id)
  }

  def remove(e: HasId): Boolean = {
    if ( !has(e) ) {
      return false
    }
  
    _entities.remove(e.id)
    return true
  }

  def isPaused() = {
    return _isPaused
  }

  def pause() = {
    _isPaused = true
  }

  def unpause() = {
    _isPaused = false
  }

  abstract def preUpdate(msTimeStep: Int)
  abstract def update(msTimeStep: Int)
  abstract def postUpdate(msTimeStep: Int)
}
