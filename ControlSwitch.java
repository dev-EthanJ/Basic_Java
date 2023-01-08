public class ControlSwitch {
    
    public static void main(String[] args) {
        ControlSwitch control = new ControlSwitch();

        control.printTimesTable();
        //control.forLoop(10);
        //control.doWhile();
        //control.switchStatement(2);
        //control.switchStatement(3);
        //control.switchStatement(4);
    }

    public void switchStatement(int numberOfWheel) {
        switch (numberOfWheel) {
            case 1:
            System.out.println(numberOfWheel + "one foot bicycle");
            break;

            case 2:
            System.out.println(numberOfWheel + "a motor cycle or bicycle");
            break;

            case 3:
            System.out.println(numberOfWheel + "a three wheel car");
            break;

            default:
            System.out.println(numberOfWheel);
        }
    }

    public void doWhile() {
        ControlSwitch control = new ControlSwitch();
        int loop = 0;

        do {
            ++loop;
            control.switchStatement(loop);
        } while(loop < 12);
    }

    public void forLoop(int until) {
        int sum = 0;
        for(int i = 1; i <= until; ++i) {
            sum += i;
        }

        System.out.println("1 to " + until + " = " + sum);
    }

    public void printTimesTable() {
        for(int i = 2; i <= 9; ++i) {
            if (i == 4) continue;
            for(int j = 1; j <= 9; ++j) {
                if (j == 4) break;
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
    }
}
