public class ReferenceAtNested {
    static class StaticNested {
        private int staticNestedInt = 99;
    }

    public static void main(String[] args) {
        StaticNested staticNested = new StaticNested();
        staticNested.staticNestedInt = 15;
        System.out.println(staticNested.staticNestedInt);
    }
}