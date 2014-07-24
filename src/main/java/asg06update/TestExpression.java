package asg06update;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestExpression {
	@Test
    public void testNumeralEvaluate() {
        Expression two = new Numeral(2);
        assertEquals(2, two.evalute());
    }

    @Test
    public void testNumeralToString() {
        Expression two = new Numeral(2);
        assertEquals("2", two.toString());
    }

    @Test
    public void testSquareEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals(4, twoSquare.evalute());
    }

    @Test
    public void testSquareToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals("2^2", twoSquare.toString());
    }

    @Test
    public void testAdditionEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals(6, twoPlusTwoSquare.evalute());
    }
    @Test
    public void testAdditionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals("(2 + 2^2)", twoPlusTwoSquare.toString());
    }

    @Test
    public void testAdditionWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquarePlusOne = new Addition(threeSquare, one);
        Expression theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 + 1)^2", theBigSquare.toString());
    }
    
    // test  cua lop Subtraction
    
    public void testSubtractionEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Subtraction(two, twoSquare);
        assertEquals(-2, twoPlusTwoSquare.evalute());
    }
    @Test
    public void testSubtractionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Subtraction(two, twoSquare);
        assertEquals("(2- 2^2)", twoPlusTwoSquare.toString());
    }

    @Test
    public void testSubtractionWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquarePlusOne = new Subtraction(threeSquare, one);
        Expression theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 - 1)^2", theBigSquare.toString());
    }
    
    
    //test cua lop Multiplication
    
    public void testMultiplicationEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Multiplication(two, twoSquare);
        assertEquals(8, twoPlusTwoSquare.evalute());
    }
    @Test
    public void testMultiplicationToString() {
        Expression two = new Numeral(2);
        Expression three = new Numeral(3);
        
        Expression addition = new Addition(two,three);
        Expression testMu = new Multiplication(two, addition);
        assertEquals("(2*2+3)", testMu.toString());
    }

    @Test
    public void testMultiplicationWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression three = new Numeral(3);
        Expression subtraction = new Subtraction(three,one);
        Expression threePlusOne = new Multiplication(subtraction, one);
        Expression theBig = new Square(threePlusOne);
        assertEquals("(3-1)*2", theBig.toString());
    }
    
    
}
