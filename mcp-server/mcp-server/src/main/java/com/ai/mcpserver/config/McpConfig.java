package com.ai.mcpserver.config;

import com.ai.mcpserver.tools.CalculatorTools;
//import org.springframework.ai.mcp.server.McpServerFeatures;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpConfig {

    @Bean
    public ToolCallbackProvider calculatorToolCallbacks(CalculatorTools calculatorTools) {
        // MethodToolCallbackProvider scans @Tool methods
        // and wraps them as MCP-compatible ToolCallbacks
        return MethodToolCallbackProvider.builder()
                .toolObjects(calculatorTools)
                .build();
    }
}