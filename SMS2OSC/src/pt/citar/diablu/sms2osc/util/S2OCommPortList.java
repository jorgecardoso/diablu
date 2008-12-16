package pt.citar.diablu.sms2osc.util;

import java.util.Enumeration;
import java.util.Vector;
import org.smslib.helper.CommPortIdentifier;

public class S2OCommPortList {

    Vector<String> portList;

    public S2OCommPortList() {
        portList = new Vector<String>();
        Enumeration pList = CommPortIdentifier.getPortIdentifiers();
        CommPortIdentifier commPort;
        while (pList.hasMoreElements()) {
            commPort = (CommPortIdentifier) pList.nextElement();
            if (commPort.getPortType() == 1) {
                portList.add(commPort.getName());
            }
        }
    }

    public Vector<String> getCommPorts() {
        return portList;
    }

    public String getFirst() {
        if (portList.size() > 0) {
            return portList.elementAt(0);
        }
        return "";
    }
}
