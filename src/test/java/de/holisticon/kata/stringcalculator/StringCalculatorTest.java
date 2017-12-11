package de.holisticon.kata.stringcalculator;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StringCalculatorTest {

  @Test
  public void shouldAddEmptyString(){

    int result = add("");

    assertThat(result).isEqualTo(0);
  }

  @Test
  public void shouldAddSingleNumberString_1(){

    int result = add("1");

    assertThat(result).isEqualTo(1);
  }

  @Test
  public void shouldAddSingleNumberString_5(){

    int result = add("5");

    assertThat(result).isEqualTo(5);
  }

  private int add(String numbers) {
    if(numbers.isEmpty()) {
      return 0;
    } else {
      return Integer.valueOf(numbers);
    }
  }

}
