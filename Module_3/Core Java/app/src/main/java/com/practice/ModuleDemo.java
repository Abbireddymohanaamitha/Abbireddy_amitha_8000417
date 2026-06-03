package com.practice;

import com.greetings.GreetingService;
import com.utils.StringUtils;

/**
 * 34. Create and Use Java Modules
 * Shows how the com.practice module consumes exported modules.
 */
public class ModuleDemo {
    public static void main(String[] args) {
        GreetingService greetingService = new GreetingService();
        String message = greetingService.greet("Developer");
        System.out.println(message);

        String repeated = StringUtils.repeat("Java ", 3);
        System.out.println("Repeated string: " + repeated);
    }
}
