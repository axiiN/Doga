/*
* File: Main.java
* Author: Tukolicza Péter
* Copyright: 2024, Tukolicza Péter
* Group: Szoft II/1/N
* Date: 2024-10-07
* Github: https://github.com/axiin/
* Licenc: GNU GPL
*/

public class Main{
    public static void main(String[] args) throws Exception {
       Network network = new Network();

       network.connectToNetwork("Hálózat");
       network.disconnectFromNetwork();
    }
}
