package ProgramMain;

import Interface.IDriver;
import Interface.IEngine;
import Model.CombustionEngine;
import Model.ElectricEngine;
import Model.Human;
import Model.Robot;
import Model.Transport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nahue
 */
public abstract class Instance {

    public static List<IEngine> engines = new ArrayList<>();
    public static List<IDriver> drivers = new ArrayList<>();
    public static List<Transport> transports = new ArrayList<>();

    public static void instance() {
        instanceDrivers();
        instanceEngines();
        instanceTransports();
    }

    private static void instanceEngines() {
        engines.add(new CombustionEngine());
        engines.add(new CombustionEngine());
        engines.add(new ElectricEngine());
        engines.add(new ElectricEngine());
    }

    private static void instanceDrivers() {
        drivers.add(new Human());
        drivers.add(new Robot());
    }

    private static void instanceTransports() {
        transports.add(new Transport(engines.get(0), drivers.get(0)));
        transports.add(new Transport(engines.get(1), drivers.get(1)));
        transports.add(new Transport(engines.get(2), drivers.get(0)));
        transports.add(new Transport(engines.get(3), drivers.get(1)));
    }
}
