package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient() {

    }

    public static SocketClient getInstance() {
        if (this.sockectClient == null) {
            sockectClient = new SockectClient();
        }
        return sockect Client;
    }

    public void connet() {
        System.out.println('oo');
    }
}
