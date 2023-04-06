package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuloServiceTest {

    @Test
    public void ModIntegers() {
        // given
        ModuloService service = new ModuloService();

        // when
        Result result = service.Mod(4, 2);

        // then
        assertEquals(result.getResult(), 1);
    }
}
