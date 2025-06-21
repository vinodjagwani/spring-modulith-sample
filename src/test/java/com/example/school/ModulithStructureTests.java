package com.example.school;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest
class ModulithStructureTests {

    @Autowired
    private ApplicationModules modules;

    @Test
    void verifyModuleStructure() {
        modules.verify();
    }

    @Configuration
    public static class ModulithTestConfig {

        @Bean
        ApplicationModules applicationModules() {
            return ApplicationModules.of("com.example.school");
        }
    }

}