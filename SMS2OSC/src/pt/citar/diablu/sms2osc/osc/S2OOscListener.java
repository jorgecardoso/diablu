package pt.citar.diablu.sms2osc.osc;


import de.sciss.net.OSCListener;
import de.sciss.net.OSCMessage;
import java.net.SocketAddress;
import java.util.logging.Level;
import pt.citar.diablu.sms2osc.S2O;

public class S2OOscListener implements OSCListener {

    S2O s2o;

    public S2OOscListener(S2O s2o) {
        this.s2o = s2o;
    }

    public void messageReceived(OSCMessage msg, SocketAddress sender, long time) {
        s2o.getLogger().log(Level.INFO, "OSC message received: " +  msg.getName());
        if(msg.getName().compareTo("/diablu/sms2osc/sendsms") == 0)
            sendSms(msg);
   }
   
    private void sendSms(OSCMessage msg)
    {
        s2o.getBtConnection().sendMessage((String) msg.getArg(0), (String) msg.getArg(1));

    }
}




