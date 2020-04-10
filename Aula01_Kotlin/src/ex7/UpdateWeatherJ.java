package ex7;

import java.awt.*;

public class UpdateWeatherJ {

    void updateWeather(int degrees) {
        String description;
        Color color;

        if (degrees < 10) {
            description = "cold";
            color = Color.BLUE;
        } else if (degrees < 25) {
            description = "mild";
            color = Color.ORANGE;
        } else {
            description = "hot";
            color = Color.RED;
        }
    }
}
