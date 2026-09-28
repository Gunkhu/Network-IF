/*
* File: Network.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft II-N
* Date: 2026-09-28
* Github: https://github.com/gunkhu/
* Licenc: MIT
*/
public class Network implements Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Kapcsolódva");
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Leválasztva");
    }
    
}
