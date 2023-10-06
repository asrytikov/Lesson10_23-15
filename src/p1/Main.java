package p1;

public class Main {
    public static void main(String[] args) {
        Button button = new Button(new ButtonHandler());
        button.click();

        Button tvButton = new Button(new EventHandler() {
            private boolean on = false;
            @Override
            public void execute() {
                if (on){
                    System.out.println("TV is on");
                    on = false;
                }else{
                    System.out.println("TV is off");
                    on = true;
                }
            }
        });

        tvButton.click();
        tvButton.click();
    }
}