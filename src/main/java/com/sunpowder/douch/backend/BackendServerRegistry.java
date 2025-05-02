package com.sunpowder.douch.backend;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BackendServerRegistry {
    private final Map<String, BackendServer> servers = new ConcurrentHashMap<>();
    public void registerServer(BackendServer server) {
        servers.put(server.getName(), server);
    }
    public BackendServer getServer(String name) {
        return servers.get(name);
    }
    public void removeServer(String name) {
        servers.remove(name);
    }
    public Map<String, BackendServer> getServers() {
        return servers;
    }
}
