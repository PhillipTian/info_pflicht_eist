package de.tum.in.ase.eist;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class SchoolProxy implements ConnectionInterface {
    private Set<String> denylistedHosts;
    private URL redirectPage;
    private Set<Integer> teacherIDs;
    private boolean authorized;
    private NetworkConnection networkConnection;

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    public void setDenylistedHosts(Set<String> denylistedHosts) {
        this.denylistedHosts = denylistedHosts;
    }

    public SchoolProxy(Set<String> denylistedHosts, URL redirectPage, Set<Integer> teacherIDs) {
        this.denylistedHosts = denylistedHosts;
        this.redirectPage = redirectPage;
        this.teacherIDs = teacherIDs;
        authorized = false;
        networkConnection = new NetworkConnection();
    }

    public boolean shouldDenied(Set<String> dh, URL url) {
        for (String str : dh) {
            if (url.toString().contains(str)) {
                return true;
            }
        }
        return false;
    }

    public void connect(URL url) {
        if (shouldDenied(denylistedHosts, url)) {
            System.err.println("Connection to '" + url + "' was rejected!");
            if (!authorized) {
                connect(redirectPage);
                System.out.println(redirectPage.getPath());
            } else {
                System.err.println("Connection to '" + url + "' was rejected!");
            }
        } else {
            networkConnection.connect(url);
        }
    }

    public void disconnect() {
        networkConnection.disconnect();
    }

    public boolean isConnected() {
        return networkConnection.isConnected();
    }

    public void login(int teacherID) {
        if (teacherIDs.contains(teacherID)) {
            setAuthorized(true);
            setDenylistedHosts(new HashSet<>());
        }
    }

    public void logout() {
        setAuthorized(false);
    }


}
