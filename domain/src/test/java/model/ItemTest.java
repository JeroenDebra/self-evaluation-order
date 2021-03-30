package model;

import com.switchfully.model.Currency;
import com.switchfully.model.Item;
import com.switchfully.model.Price;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void constructorWithValidParamaters_createsItemWithSpeciefiedValues() {
        Item testItem = new Item("hammer",new Price(BigDecimal.TEN, Currency.EURO),10);

        assertEquals("hammer", testItem.getName());
        assertEquals(new Price(BigDecimal.TEN,Currency.EURO), testItem.getPrice());
        assertEquals(10, testItem.getStockAmount());
    }

    @Test
    void constructorWithUnValidName_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Item("   ",new Price(BigDecimal.TEN,Currency.EURO),10));
    }

    @Test
    void constructorWithUnNullName_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Item(null,new Price(BigDecimal.TEN,Currency.EURO),10));
    }

    @Test
    void constructorWithUnZeroAmount_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Item("hammer",new Price(BigDecimal.TEN,Currency.EURO),0));
    }

    @Test
    void constructorWithUnNegativeAmount_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Item("hammer",new Price(BigDecimal.TEN,Currency.EURO),-1));
    }

}