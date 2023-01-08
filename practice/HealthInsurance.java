
public enum HealthInsurance {
    LEVEL_ONE(1000, 1.0), 
    LEVEL_TWO(2000, 2.0),
    LEVEL_THREE(3000, 3.2),
    LEVEL_FOUR(4000, 4.5),
    LEVEL_FIVE(5000, 5.6),
    LEVEL_SIX(6000, 7.1);
    private final int mySalary;
    private final double myRatio;

    private HealthInsurance(int maxSalary, double ratio) {
        this.mySalary = maxSalary;
        this.myRatio = ratio;
    }

    public double getRatio() {
         return myRatio;
    }

    public static HealthInsurance getHealthInsurance(int salary) {
        int level = (int)(salary / 1000);
    
        level++;

        switch(level) {
            case 1:
                return LEVEL_ONE;
            case 2:
                return LEVEL_TWO;
            case 3:
                return LEVEL_THREE;
            case 4:
                return LEVEL_FOUR;
            case 5:
                return LEVEL_FIVE;
            default:
                return LEVEL_SIX;
        }
    }


    public static void main(String[] args) {
        int[] salaryArray = new int[]{1500, 5500, 8000};
        HealthInsurance[] insurances = new HealthInsurance[3];

        for(int i = 0; i < 3; ++i) {
            insurances[i] = HealthInsurance.getHealthInsurance(salaryArray[i]);
        }

        for(int j = 0; j < 3; ++j) {
            System.out.println(salaryArray[j] + " = " + insurances[j] + ", " + insurances[j].getRatio());
        }

    }442
}