package Model;

import Interface.IDriver;

/**
 *
 * @author nahue
 */
public class Robot implements IDriver{

    @Override
    public String move() {
       return "Robot Driver";
    }
    
}
