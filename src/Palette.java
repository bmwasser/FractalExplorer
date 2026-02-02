import java.awt.Color;

public class Palette {
    
    private final int colorScheme;

    public Palette(int colorScheme){
        this.colorScheme = colorScheme;
    }

    public Color getColor(double n){
        if (colorScheme == 1){
            return mapColorSine(n);
        }
        if (colorScheme == 2){
            return mapColorLinear(n);
        }
        return Color.WHITE;
    }

    private Color mapColorSine(double normedN) {
        System.out.println(normedN);
        if (normedN < 0){
            return Color.BLACK;
        }  
        int red = (int) (127.5 * (1 + Math.sin(3.0 * Math.PI * normedN)));
        int green = (int) (127.5 * (1 + Math.sin(3.0 * Math.PI * normedN + 2.0 * Math.PI / 3.0)));
        int blue = (int) (127.5 * (1 + Math.sin(3.0 * Math.PI * normedN + 4.0 * Math.PI / 3.0)));
        return new Color(red, green, blue);
    }

    private Color mapColorLinear(double normedN){
        System.out.println(normedN);
        if (normedN < 0){
            return Color.BLACK;
        }
        int red = (int) (255 * normedN);
        int green = 0;
        int blue = 255 - (int) (255 * normedN);
        return new Color(red, green, blue);
    }




}
