package sailsandheroes.demo.Model;

import sailsandheroes.demo.Enums.Action;

import java.awt.*;
import java.util.List;

public class PlayerOrderMaker {

    public static PlayerOrder createPlayerOrder(boolean isMove, boolean isAttack, List<Point> coords, String shipID, List<Player> players) throws NullPointerException{
        Action action = Action.MOVE;
        if(isMove & !isAttack){
            action = Action.MOVE;
        }else if(!isMove & isAttack){
            action = Action.ATTACK;
        }
        for (Player player : players) {
            if (Integer.parseInt(shipID) == player.getShipList().get(0).getId()) {
                return new PlayerOrder(player, action, coords);
            }
        }
        return null;
    }
}