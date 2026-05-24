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
│   └── Exposes MCP tools
│
├── mcp-client/
│   └── Connects to MCP server
│
└── README.md
