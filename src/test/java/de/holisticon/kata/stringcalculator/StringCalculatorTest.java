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
  public void shouldAddSingleNumberString(){

    int result = add("1");

    assertThat(result).isEqualTo(1);
  }

  private int add(String numbers) {
    return 0;
  }

}
