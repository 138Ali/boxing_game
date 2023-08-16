package boxing_game;

public class main {
    
        public static void main(String[] args) {
            fighter f1 = new fighter("A", 10, 120, 100, 30);
            fighter f2 = new fighter("B", 20, 85, 85, 40);
    
            match match = new match(f1, f2, 80, 100);
            match.run();
    
        }
    }

