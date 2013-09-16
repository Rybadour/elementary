package elementary

import TR.SimpleGame

class MyTestGame(canvasId: String) extends SimpleGame(canvasId) {

    var ball: Ball           = new Ball(this);
    var playerPaddle: Paddle = new Paddle(this);
    var enemyPaddle: Paddle  = new Paddle(this);

    var playerEndZone:  = new RectRegion();
    var enemyEndZone: RectRegion  = new RectRegion();

    var playerScore: Int = 0;
    var enemyScore: Int  = 0;

    // Controllers
    var player: Player = new Player(playerPaddle);

    override def update(msTimeStep: Int) {

      super.update(msTimeStep);

      player.update(msTimeStep);

      /* *
      // Should be inside super i guess
      ball.update(msTimeStep);
      enemyPaddle.update(msTimeStep);
      /* */

      if (collider.checkCollision(ball, playerPaddle) || collider.checkCollision(ball, enemyPaddle)) {
        ball.reverse();
      }

      if (collider.checkCollision(ball, playerEndZone)) {
        enemyScore++;
      }

      if (collider.checkCollision(ball, enemyEndZone)) {
        playerScore++;
      }
    }
}
