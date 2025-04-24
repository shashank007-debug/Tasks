package com.xworkz.late.external;

import com.xworkz.late.internal.Connector;

public class ConnectorImpl implements Connector {
    public ConnectorImpl(){
        System.out.println("no-args constructor of ConnectorImpl");
    }
    @Override
    public void run() {
        System.out.println("Running the run in ConnectorImpl");
    }
}
