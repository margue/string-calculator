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

  @Test
  public void shouldAddStringWithTwoNumbers(){

    int result = add("2,5");

    assertThat(result).isEqualTo(7);
  }

  private int add(String numbers) {
    if(numbers.isEmpty()) {
      return 0;
    } if(numbers.contains(",")) {
      String[] split = numbers.split(",");
      return Integer.valueOf(split[0]) + Integer.valueOf(split[1]);
    } else {
      return Integer.valueOf(numbers);
    }
  }

}
