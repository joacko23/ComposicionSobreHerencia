package ProgramMain;

import Model.Transport;


public class Program {


    public static void main(String[] args) {
          Instance.instance();

        for (Transport transport : Instance.transports) {
            System.out.println(transport.deliver("Sample Destination", "Sample Cargo"));
        }
    }
    
}
