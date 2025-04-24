package com.xworkz.late.external;

import com.xworkz.late.internal.Connector;

public class ConnectorUser {
    Connector connector;
    public ConnectorUser(Connector connector){
        this.connector = connector;
        System.out.println("Parameterized constructor of ConnectorUser");
    }
    public void execute(){
        if(this.connector != null){
            System.out.println("Running execute in ConnectorUser");
            this.connector.run();
        }else{
            System.err.println("Null Pointer Exception");
        }
    }
}
