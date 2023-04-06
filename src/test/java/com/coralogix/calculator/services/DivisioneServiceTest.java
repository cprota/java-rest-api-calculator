package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisioneServiceTest {

    @Test
    public void DivIntegers() {
        // given
        DivisioneService service = new DivisioneService();

        // when
        Result result = service.Div(4, 2);

        // then
        assertEquals(result.getResult(), 2);
    }
}
