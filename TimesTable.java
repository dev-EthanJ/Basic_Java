public class TimesTable {
    public static void main(String[] args) {
        TimesTable table = new TimesTable();
        table.printTimesTable();
    }

    public void printTimesTable() {
        firstLabel:
        for(int level=2; level<10; ++level) {
            secondLabel:
            for(int unit=1; unit<10; ++unit) {
                if(unit==4) continue firstLabel;
                System.out.println(level + " * " + unit + " = " + level * unit);
            }
        }
    }

}
