package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionServiceTest {

    @Test
    public void SubIntegers() {
        // given
        SubtractionService service = new SubtractionService();

        // when
        Result result = service.Subr(5, 3);

        // then
        assertEquals(result.getResult(), 2);
    }
}
