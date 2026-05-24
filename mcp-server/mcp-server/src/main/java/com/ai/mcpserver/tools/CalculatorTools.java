package com.ai.mcpserver.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class CalculatorTools {

    @Tool(name = "add", description = "Add two integers and return the result")
    public int add(
            @ToolParam(description = "First number") int a,
            @ToolParam(description = "Second number") int b) {
        return a + b;
    }

    @Tool(name = "multiply", description = "Multiply two integers and return the result")
    public int multiply(
            @ToolParam(description = "First number") int a,
            @ToolParam(description = "Second number") int b) {
        return a * b;
    }
}