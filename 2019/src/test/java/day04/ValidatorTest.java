package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void validate() {
        assertFalse(Validator.validate(123456));
        assertFalse(Validator.validate(123450));
        assertFalse(Validator.validate(12345));
        assertFalse(Validator.validate(1234567));

        assertTrue(Validator.validate(112345));
        assertTrue(Validator.validate(111111));
    }


    @Test
    void validateNew() {
        assertFalse(Validator.validateNew(123456));
        assertFalse(Validator.validateNew(123450));
        assertFalse(Validator.validateNew(12345));
        assertFalse(Validator.validateNew(1234567));
        assertFalse(Validator.validateNew(111111));
        assertFalse(Validator.validateNew(111222));

        assertTrue(Validator.validateNew(112345));
    }
}