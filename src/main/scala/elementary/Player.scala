package elementary

class Player(var paddle: Paddle) {

	def update(msTimeStep: Int) = {
      if (player.keyDown(UserInput.UpArrow)) {
        paddle.up();
      }

      if (player.keyDown(UserInput.DownArrow)) {
        paddle.down();
      }
	}
}
