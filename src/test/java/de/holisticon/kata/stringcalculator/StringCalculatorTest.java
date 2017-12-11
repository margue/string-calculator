package de.holisticon.kata.stringcalculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StringCalculatorTest {

  @Test
  public void shouldAddEmptyString(){

    int result = add("");

    Assertions.assertThat(result).isEqualTo(0);
  }

  private int add(String numbers) {
    return 0;
  }

}
