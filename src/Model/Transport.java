package Model;

import Interface.IDriver;
import Interface.IEngine;

/**
 *
 * @author nahue
 */
public class Transport {
    private IEngine engine;
    private IDriver driver;

    public Transport(IEngine engine, IDriver driver) {
        this.engine = engine;
        this.driver = driver;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public IDriver getDriver() {
        return driver;
    }

    public void setDriver(IDriver driver) {
        this.driver = driver;
    }
    
    public String deliver(String destination, String cargo){
        return "DESTINATION: " + destination + " - CARGO: " + cargo + "\n ENGINE: " + engine.navigate() + "\n DRIVER: " + driver.move();
    }
}
