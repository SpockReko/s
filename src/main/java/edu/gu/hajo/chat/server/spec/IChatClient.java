package edu.gu.hajo.chat.server.spec;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashSet;

import edu.gu.hajo.chat.server.core.User;

/**
 * Contract for client (from Server view). Call backs from server
 *
 * @author hajo
 *
 */
public interface IChatClient extends Remote {

	public String getPassword() throws RemoteException;
    public String getLogin() throws RemoteException;
    public User getUser() throws RemoteException;
    public void setUser(User user) throws RemoteException;
    public void userLoggedIn(String user)throws RemoteException;
    public void userloggedOut(String user)throws RemoteException;
    public void iniChat(HashSet<User> users) throws RemoteException;
    public void publish(IMessage msg) throws RemoteException;
    public void ping() throws RemoteException;
   // public void recieveMessage(IMessage msg) throws RemoteException;
    
    
    
    /*preleminary test method*/
   
   // public User getUser() throws RemoteException;
   // public Map<String,IPeer> getPeers() throws RemoteException;

}
