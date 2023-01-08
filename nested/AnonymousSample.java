public class AnonymousSample {
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        // sample.setButtonListener();
        sample.setButtonListenerAnonymous();
    }

    public void setButtonListener() {
        MagicButton button = new MagicButton();
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }

    public void setButtonListenerAnonymous() {
        MagicButton button = new MagicButton();
        button.setListener(new EventListener() {
            public void onClick() {
                System.out.println("Anonymous Magic Button Clicked!");
            }
        });
        button.onClickProcess();
    }
}