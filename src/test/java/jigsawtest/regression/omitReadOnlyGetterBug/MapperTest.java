package jigsawtest.regression.omitReadOnlyGetterBug;

import org.junit.Test;

import com.remondis.remap.Mapping;

public class MapperTest {
  @Test
  public void test() {

    Mapping.from(A.class)
        .to(B.class)
        .omitInSource(A::getReadOnly)
        .mapper();

  }
}
