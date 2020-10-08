package sailsandheroes.demo.Model;

import sailsandheroes.demo.Enums.Action;

import java.awt.*;
import java.util.List;

public class PlayerOrder {

    private Player player;
    private Action action;
    private List<Point> coords;


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public List<Point> getCoords() {
        return coords;
    }

    public void setCoords(List<Point> coords) {
        this.coords = coords;
    }

    @Override
    public String toString() {
        return "PlayerOrder{" +
                "player=" + player +
                ", action=" + action +
                ", coords=" + coords +
                '}';
    }
}
