public class MyPage {
    static InputBox input;
    
    public static void main(String[] args) {
        MyPage page = new MyPage();
        page.setUI();
        page.pressKey();
    }

    public void setUI() {
        input = new InputBox();
        input.setKeyEventListener(new KeyEventListener() {    
            public void onKeyDown() { System.out.println("Key Down"); }
            public void onKeyUp() { System.out.println("Key Up"); }
        });
    }

    public void pressKey() {
        input.listenerCalled(2);
        input.listenerCalled(4);
    }
}