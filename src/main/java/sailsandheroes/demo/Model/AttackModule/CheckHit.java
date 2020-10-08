package sailsandheroes.demo.Model.AttackModule;

import sailsandheroes.demo.Model.Damage;
import sailsandheroes.demo.Model.Ship;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class CheckHit {

    //Ship shooter = the ship shooting
    //Ship enemy = the ship getting hit (potentially (:3) )
    //TODO WHAT SHOULD RETURN TYPE BE? Boolean if hit? Void?
    //Lavet af Benjamin
    public static boolean checkHit(ArrayList<Point> path, Ship shooter, Ship enemy, Point point){
        Random random = new Random();

        //TODO WHAT IF ENEMY DOESN'T MOVE? THE LIST WOULD BE EMPTY NO? if (*statement* || point matches ship current position?)
        //Check center
        if(path.contains(new Point(point.x, point.y))){
            double chance = random.nextDouble();
            //40 percent for hit
            if(chance >= 0.4){
                //Calculate if crit
                if (chance <= 0.1){
                    //roll if crit hits
                    int crit = random.nextInt();
                    if(crit >= 2){
                        Damage.criticalShot(shooter, enemy, crit, random);
                    }else{
                        return false; //Miss (according to the rules)
                    }
                }
                //Hit, but didn't crit - Calculate normal damage
                Damage.calculate(shooter, enemy, chance);
            }
        }
        //Check north
        if(path.contains(new Point(point.x, point.y - 1))){
            double chance = random.nextDouble();
            //10 percent for hit
            if(chance >= 0.1){
                Damage.calculate(shooter, enemy, chance);
            }
        }
        //Check north-west
        if(path.contains(new Point(point.x - 1, point.y))){
            double chance = random.nextDouble();
            //10 percent for hit
            if(chance >= 0.1){
                Damage.calculate(shooter, enemy, chance);
            }
        }
        //Check south-west
        if(path.contains(new Point(point.x - 1, point.y + 1))){
            double chance = random.nextDouble();
            //10 percent for hit
            if(chance >= 0.1){
                Damage.calculate(shooter, enemy, chance);
            }
        }
        //Check south
        if(path.contains(new Point(point.x, point.y + 1))){
            double chance = random.nextDouble();
            //10 percent for hit
            if(chance >= 0.1){
                Damage.calculate(shooter, enemy, chance);
            }
        }
        //Check south-east
        if(path.contains(new Point(point.x + 1, point.y + 1))){
            double chance = random.nextDouble();
            //10 percent for hit
            if(chance >= 0.1){
                Damage.calculate(shooter, enemy, chance);
            }
        }
        //Check north-east
        if(path.contains(new Point(point.x + 1, point.y))){
            double chance = random.nextDouble();
            //10 percent for hit
            if(chance >= 0.1){
                Damage.calculate(shooter, enemy, chance);
            }
        }

        return false;
    }
}