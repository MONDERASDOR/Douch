# Douch Proxy

**Douch** is a next-generation, high-performance Minecraft proxy, fully compatible with all versions of Paper server and Minecraft. Designed and engineered by Sunpowder, Douch aims to surpass BungeeCord and Velocity in performance, compatibility, and extensibility.

## Features
- Full support for all Minecraft versions (legacy to latest)
- Ultra-fast Netty-based networking engine
- Advanced protocol translation and compatibility
- Plugin API for extensibility
- Robust security and anti-exploit features
- Monitoring, logging, and metrics
- **Standalone API module for plugin development** ([see DouchAPI on GitHub](https://github.com/MONDERASDOR/DouchAPI))

## Using the Douch API (Plugin Development)
Douch provides a full-featured, standalone API for plugin and integration developers. The API is published as a Maven dependency via JitPack:

```
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
<dependency>
  <groupId>com.github.yourusername</groupId>
  <artifactId>DouchAPI</artifactId>
  <version>v1.0.0</version>
</dependency>
```

- See the [DouchAPI README](https://github.com/MONDERASDOR/DouchAPI#readme) for full usage, events, and examples.

## Build & Run
```
mvn clean package
java -jar douch-proxy.jar
```

## License
Copyright (c) Sunpowder. All rights reserved.
