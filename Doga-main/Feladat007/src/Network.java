/*
* File: Network.java
* Author: Tukolicza Péter
* Copyright: 2024, Tukolicza Péter
* Group: Szoft II/1/N
* Date: 2024-10-07
* Github: https://github.com/axiin/
* Licenc: GNU GPL
*/
public class Network implements Connectable {
    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Csatlakozott a hálózatra: " + networkName);
    };

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Lecsatlakozás a hálózatról");
    };
    
}
