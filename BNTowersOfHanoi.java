public class BNTowersOfHanoi {
    public static void main(String[] args) {
        int d = 4; // "disks"
        TowerOfHanoi(d, 'A', 'C', 'B'); 
    }
    // I could not figure out a way to simply visualise the problem
    //The output is messy and confusing but I am certin this is the right recursion solution
    public static void TowerOfHanoi(int d, char start, char dest, char mid) {
        if (d == 1) {
            System.out.println("Move disk "+d +" from rod " +  start + " to rod " + dest);
            return;
        }
        TowerOfHanoi(d-1, start, mid, dest);
        System.out.println("Move disk " + d + " from rod " +  start + " to rod " + dest);
        TowerOfHanoi(d-1, mid, dest, start);
    }
}
