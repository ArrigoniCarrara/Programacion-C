//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Infusion infu1 = new Cafe(true);
            Infusion infu2 = new Cafe(false);
            Infusion infu3 = new Mate();

            infu1.PrepararyTomar();
            System.out.println("-------------------------------------------");
            infu2.PrepararyTomar();
            System.out.println("-------------------------------------------");
            infu3.PrepararyTomar();
    }
}