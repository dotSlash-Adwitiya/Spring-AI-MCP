package com.ai.mcpclient.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    // ToolCallbackProvider is AUTO-configured by MCP Client starter
    // It contains all tools discovered from mcp-server
    public ChatController(ChatClient.Builder builder,
                          ToolCallbackProvider mcpToolProvider) {
        this.chatClient = builder
                .defaultToolCallbacks(mcpToolProvider)  // wire MCP tools
                .build();
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String question) {
        return chatClient.prompt()
                .user(question)
                .call()
                .content();
    }
}