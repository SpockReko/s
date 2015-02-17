package edu.gu.hajo.chat.server.spec;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

import edu.gu.hajo.chat.server.core.User;

/**
 * Contract for client (from Server view). Call backs from server
 *
 * @author hajo
 *
 */
public interface IChatClient extends Remote {

	public User login();
}
