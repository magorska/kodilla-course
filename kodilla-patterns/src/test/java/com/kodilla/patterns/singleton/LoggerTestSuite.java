package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void getLastLogTest() {
        // Given
        Logger.INSTANCE.log("First log");
        // When
        String logResult = Logger.INSTANCE.getLastLog();
        // Then
        Assertions.assertEquals(logResult,"First log" );
    }
}
