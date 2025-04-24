package com.xworkz.late.runner;

import com.xworkz.late.external.ConnectorImpl;
import com.xworkz.late.external.ConnectorUser;
import com.xworkz.late.internal.Connector;

public class Runner {
    public static void main(String[] args) {
        Connector connector = new ConnectorImpl();
        ConnectorUser connectorUser = new ConnectorUser(connector);
        connectorUser.execute();
    }
}
