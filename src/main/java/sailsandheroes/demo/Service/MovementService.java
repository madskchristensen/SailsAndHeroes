package sailsandheroes.demo.Service;

import org.springframework.stereotype.Service;
import sailsandheroes.demo.Enums.TurnResult;
import sailsandheroes.demo.Model.Ship;
import sailsandheroes.demo.Movement.Move;
// Joakim
@Service
public class MovementService {

    private Move move;

    public MovementService() {
        move = new Move();
    }

    public boolean Move(Ship ship) {
        return move.moveShip(ship);
    }


}
