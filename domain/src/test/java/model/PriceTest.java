package model;

import com.switchfully.model.item.Currency;
import com.switchfully.model.item.Price;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PriceTest {

    @Test
    void constructor_ValidParameters_CreatesObjectWithValues() {
        Price testPrice = new Price(BigDecimal.ONE, Currency.EURO);

        assertEquals(BigDecimal.ONE,testPrice.getAmount());
        assertEquals(Currency.EURO,testPrice.getCurrency());
    }


    @Test
    void constructor_NegativeAmountPrice_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Price(BigDecimal.valueOf(-1.0),Currency.EURO));
    }

    @Test
    void constructor_ZeroAmountPrice_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Price(BigDecimal.ZERO, Currency.EURO));
    }
}