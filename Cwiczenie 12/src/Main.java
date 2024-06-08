// Wątki
// Cykl życia  thread.getState()
//  - NEW
//  - RUNNABLE
//  - BLOCKED
//  - WAITING
//  - TIMED_WAITING
//  - TREMINATED

//synchronized gwarantuje ze dwa watki beda chcialy wywolac te metode to maszyna javy
// zagwaratnuje ze tylko jeden watek naraz sie wykona chroniac przed wyscigem do zmiennych

class test extends Thread {
    public synchronized void run() {
        // tutaj instrukcjie do wątka
        synchronized (this){
            // tutaj tez mozna wywaolac kod z synchronizowany
        }
    }
}



// Lepsze niz klasa jest interface bo klasa moze byc rozrzeszana tylko raz
class test2 implements  Runnable{

    public void run(){
        // tutaj instrukcjie do wątka
    }
}

public class Main {
    public static void main(String[] args) {

        // tak uruchamiamy watek
        test testApp = new test();
        testApp.start();

        test2 testApp2 = new test2();
        testApp2.run();

    }
}