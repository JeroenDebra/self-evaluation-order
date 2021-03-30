package repository;

import model.Currency;
import model.Item;
import model.Price;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest {

    @Test
    void getAllItemsGivesCollectionOfItems() {
      ItemRepository itemRepository = new ItemRepository();

      assertThat(itemRepository.getAllItems()).isInstanceOf(Collection.class);

    }
}