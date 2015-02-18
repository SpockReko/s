package edu.gu.hajo.chat.server.spec;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * One clients view of another (peer2peer)
 *
 * @author hajo
 *
 */
public interface IPeer extends Remote {
	
	public List<String> getUploads() throws RemoteException;
	public byte [] uploadFile(String filename) throws RemoteException;
}
