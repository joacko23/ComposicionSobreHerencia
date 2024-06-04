package Model;

import Interface.IDriver;

/**
 *
 * @author nahue
 */
public class Human implements IDriver{

    @Override
    public String move() {
       return "Human Driver";
    }
}
