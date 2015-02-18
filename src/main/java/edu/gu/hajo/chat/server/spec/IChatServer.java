package edu.gu.hajo.chat.server.spec;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Client view of server
 *
 * @author hajo
 *
 */
public interface IChatServer extends Remote {

    // Utility

    
    // Utility
    public String ping() throws RemoteException;
    public void connectClient(IChatClient client) throws RemoteException;
    public void disconnectClient(IChatClient client) throws RemoteException;
    public void broadcast(IMessage message) throws RemoteException;
    public IPeer lookUp(String user) throws RemoteException;
    
    /* testing only */

}
