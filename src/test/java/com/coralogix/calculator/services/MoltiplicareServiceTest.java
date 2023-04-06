package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoltiplicareServiceTest {

    @Test
    public void MoltIntegers() {
        // given
        MoltiplicareService service = new MoltiplicareService();

        // when
        Result result = service.Molt(5, 3);

        // then
        assertEquals(result.getResult(), 15);
    }
}
