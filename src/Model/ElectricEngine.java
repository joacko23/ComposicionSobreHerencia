package Model;

import Interface.IEngine;

/**
 *
 * @author nahue
 */
public class ElectricEngine implements IEngine{

    @Override
    public String navigate() {
       return "Electric Engine";
    }
}
