public class ThreadHW {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                for (int i = 0; i < 11; i++) {
                System.out.println("Thread1: " + i);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                for (int i = 0; i < 11; i++) {
                    System.out.println("Thread2: " + (10-i));
                    try {
                        Thread.sleep(502);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        });

        Thread thread3 = new Thread(new Runnable(){
           @Override
            public void run() {
                for (int i = 0; i < 11; i++) {
                    System.out.println("Thread3: " + Character.toString((char)(i+97)));
                try {
                    Thread.sleep(504);
                } catch (Exception e) {
                    //TODO: handle exception
                }
                }
            }
        }); 

        Thread thread4 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                for (int i = 0; i < 11; i++) {
                    System.out.println("Thread4: " + Character.toString((char)(107-i)));
                    try {
                        Thread.sleep(506);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                }
            }
        });
       

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}