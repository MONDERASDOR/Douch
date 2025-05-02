package com.sunpowder.douch.bootstrap;

import com.sunpowder.douch.core.DouchProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DouchBootstrap {
    private static final Logger logger = LoggerFactory.getLogger(DouchBootstrap.class);

    public static void main(String[] args) {
        logger.info("Starting Douch Proxy by Sunpowder...");
        try {
            DouchProxy proxy = new DouchProxy();
            proxy.start();
        } catch (Exception e) {
            logger.error("Failed to start Douch Proxy", e);
            System.exit(1);
        }
    }
}
