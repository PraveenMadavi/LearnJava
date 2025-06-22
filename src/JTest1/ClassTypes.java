package JTest1;

public class ClassTypes{
    static class Display{
        private class NewClass{
            int secretNumber= 56;
            public void printSecretNumber(){
                System.out.println("Secret number is : "+ secretNumber);
            }
        }

        public void show(){
            System.out.println("printing some string");
        }

        public void number(){
            NewClass newClass = new NewClass();
            newClass.printSecretNumber();
        }
    }


    public static void main(String[] args) {
        Display display = new Display();
        display.show();
        display.number();


    }
}
