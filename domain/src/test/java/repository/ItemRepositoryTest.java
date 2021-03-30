package repository;

import com.switchfully.repository.ItemRepository;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

class ItemRepositoryTest {

    @Test
    void getAllItemsGivesCollectionOfItems() {
      ItemRepository itemRepository = new ItemRepository();

      assertThat(itemRepository.getAllItems()).isInstanceOf(Collection.class);

    }
}