import java.util.Scanner;

/**
 * Skill Builder 1
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName ="";
        float spice;
        //TODO : Replace this comment with your code
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's you're name?\"");
        userName = input.nextLine();
        System.out.println("Enter a floating-point number:");
        spice = input.nextFloat();
        System.out.println("Well "+ userName+", the spice value resulted in "+ ((float)4/3)*Math.pow(2,(Math.sqrt(5)/Math.pow(spice,3))));
        System.out.println("And the converted value is "+ String.format("%.2f", ((float)4/3)*Math.pow(2,(Math.sqrt(5)/Math.pow(spice,3)))));




    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + (int)wallArea +" square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: "+String.format("%.2f",gallonsPaintNeeded)+" gallons");
        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        cansNeeded = (int)Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: "+cansNeeded +" can(s)");
    }
}
