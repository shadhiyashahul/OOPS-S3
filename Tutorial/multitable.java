//program for display multiplication table
//Shadhiya Shahul
//58 CSE AI
class MultiplicationTable {

    
    public static void printTable(int number, int range) {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();  
    }

    
    public static void printAllTables(int range) {
        for (int number = 1; number <= range; number++) {
            printTable(number, range);
        }
    }

    public static void main(String[] args) {
        int number = 5; 
        int range = 10;

        
        printTable(number, range);

        
        System.out.println("Multiplication tables from 1 to " + range + ":");
        printAllTables(range);
    }
}

