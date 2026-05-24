# Spring AI MCP Demo Project

## Overview

This project demonstrates communication between an MCP Client and an MCP Server using Spring AI and the Model Context Protocol (MCP).

The MCP Client connects to the MCP Server and allows tools exposed by the server to be discovered and executed.

---

# What is MCP?

MCP (Model Context Protocol) is a protocol that allows AI models and applications to communicate with external tools, APIs, and services in a standardized way.

It enables:
- Tool calling
- Structured communication
- AI-agent integrations
- Dynamic capability discovery

---

# What is an MCP Server?

An MCP Server exposes tools/functions that can be called externally.

Examples:
- Weather tools
- Database query tools
- Calculator tools
- File processing tools

The server registers these tools and makes them available through the MCP protocol.

---

# What is an MCP Client?

An MCP Client connects to an MCP Server and interacts with the exposed tools.

The client can:
- Discover available tools
- Invoke tools
- Send requests
- Receive structured responses

---

# Project Structure

```text
mcp-project/
│
├── mcp-server/
│   ├── src/
│   ├── pom.xml
│   └── Exposes MCP tools
│
├── mcp-client/
│   ├── src/
│   ├── pom.xml
│   └── Connects to MCP server
│
└── README.md
```

---

# MCP Server Structure

```text
mcp-server/
│
├── src/main/java/com.ai.mcpserver
│   │
│   ├── config
│   │   └── McpConfig.java
│   │
│   ├── tools
│   │   └── CalculatorTools.java
│   │
│   └── McpServerApplication.java
│
├── src/main/resources
│   └── application.yaml
│
└── pom.xml
```

---

# MCP Client Structure

```text
mcp-client/
│
├── src/main/java/com.ai.mcpclient
│   │
│   ├── controller
│   │   └── ChatController.java
│   │
│   └── McpClientApplication.java
│
├── src/main/resources
│
└── pom.xml
```

---

# Technologies Used

- Java
- Spring Boot
- Spring AI
- MCP SDK
- Maven

---

# How to Run the Project

## Step 1 — Clone the Repository

```bash
git clone <YOUR_GITHUB_REPO_URL>
```

---

## Step 2 — Run MCP Server

Navigate to the server project:

```bash
cd mcp-server
```

Run the server:

```bash
mvn spring-boot:run
```

The MCP Server will start and expose tools.

---

## Step 3 — Run MCP Client

Open another terminal.

Navigate to the client project:

```bash
cd mcp-client
```

Run the client:

```bash
mvn spring-boot:run
```

The MCP Client will connect to the MCP Server.

---

# Testing Using MCP Inspector

After both applications are running, open MCP Inspector:

```bash
npx @modelcontextprotocol/inspector
```

The inspector allows you to:
- Discover available MCP tools
- Call tools manually
- Inspect requests/responses
- Test MCP communication

---

# Workflow

```text
MCP Inspector
       ↓
MCP Client
       ↓
MCP Server
       ↓
Registered Tools
```

---

# Features

- MCP Server implementation
- MCP Client implementation
- Tool registration
- Tool discovery
- Tool invocation
- Inspector-based testing

---

# Future Improvements

- Authentication
- Multiple MCP tools
- AI Agent integration
- Database support
- Streaming responses
- External API integrations

---

# Author

Adwitiya
