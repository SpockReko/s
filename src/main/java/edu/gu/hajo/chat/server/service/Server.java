package edu.gu.hajo.chat.server.service;

import edu.gu.hajo.chat.server.core.Chat;
import edu.gu.hajo.chat.server.core.Constants;
import edu.gu.hajo.chat.server.spec.IChatClient;
import edu.gu.hajo.chat.server.spec.IPeer;
import edu.gu.hajo.chat.server.spec.IChatServer;
import edu.gu.hajo.chat.server.core.User;
import edu.gu.hajo.chat.server.spec.IMessage;


import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class adds networking and notification to other clients by wrapping the
 * model (delegation). No application logic here
 *
 * @author hajo
 *
 */
public class Server implements IChatServer {

    // Usage, see ping below
    private static final Logger LOG = Logger.getLogger(Server.class.getName());
    private static final int PING_DELAY = 3000;

    private final Map<String, IChatClient> connectedClients = new HashMap<>();
    private Chat chat;
    
    public Server(Chat chat) {
        this.chat = chat;
    }

    // ------- IServer ---------------------------------------------

    
    // this gives an pling in the server teminal and sends "server alive"
    // Is for TestServer in Client project.
    @Override
    public synchronized String ping() throws RemoteException {
        LOG.log(Level.INFO, "Pinged!");
        return Constants.SERVER_PING_MESSAGE;
    }

    // Connect the client to the Chat
	@Override
	public void connectClient(IChatClient client) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	// Disconnect the client from the Chat
	@Override
	public void disconnectClient(IChatClient client) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	// Take the message and sends it to all connected Clients.
	@Override
	public void broadcast(IMessage message) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	// Search for an Client to be a Peer
	@Override
	public IPeer searchFor(String user) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	
	// --------- Privates -----------
	// Clients alive?
	private final TimerTask pinger = null; //TODO

}
