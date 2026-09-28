/*
* File: App.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft II-N
* Date: 2026-09-28
* Github: https://github.com/gunkhu/
* Licenc: MIT
*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hálózat....");
        Network network = new Network();
        network.connectToNetwork("Egy");
        network.disconnectFromNetwork();
    }
}
