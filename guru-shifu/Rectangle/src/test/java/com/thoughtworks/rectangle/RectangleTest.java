package com.thoughtworks.rectangle;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RectangleTest {
    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsGiven(){

        final Rectangle rectangle = new Rectangle(2.4,3.6);
        final double area = rectangle.area();

        assertThat(area, is(closeTo(8.64,0.001)));

    }

    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsGiven(){

        final Rectangle rectangle = new Rectangle(2.67,9.36);
        final double perimeter = rectangle.perimeter();
        
        assertThat(perimeter, is(closeTo(24.06,0.001)));
    }
}