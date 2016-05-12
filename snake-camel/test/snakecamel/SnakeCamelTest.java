package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelTest {

	/*
	@Test
	
	public final void test() {
		fail("Not yet implemented");
	}*/

	@Test
	public void snaketocamelでapple_orangeの大文字変換ができる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String exp = "AppleOrange";
		String actual = scu.snakeToCamelcase("apple_orange");
		assertThat(actual,is(exp));
	}
	
	@Test
	public void camelToSnakeでAppleOrangeの小文字変換ができる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String exp = "apple_orange";
		String actual = scu.camelToSnakecase("AppleOrange");
		assertThat(actual,is(exp));
	}
	
	@Test
	public void cameltosnakeでacatの大文字変換ができる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String exp = "ACat";
		String actual = scu.snakeToCamelcase("a_cat");
		assertThat(actual,is(exp));
	}
	
	
	
	
}
