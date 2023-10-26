package chatassert;

import java.lang.Exception;
import py4j.GatewayServer;

public class Main {
    
    public static void main(String[] args) throws Exception {
        try {
          GatewayServer gatewayServer = new GatewayServer(new PY4JGateway());
          gatewayServer.start();
        } catch(Exception e){
          e.printStackTrace();
        }
    }


}
