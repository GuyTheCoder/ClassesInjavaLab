public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("A", "X", 100);
        Account account2 = new Account("B", "Y", 100);
        Account account3 = new Account("C", "Z", 100);

        //String account1Info = account1.

        //System.out.println(describe(Account));

        // what do i need to do to code my statement?

        String account1details = account1.describeIndividual();
        String account2details = account2.describeIndividual();
        String account3details = account3.describeIndividual();

        System.out.println("Account " + account1details);
        System.out.println("Account " + account2details);
        System.out.println("Account " + account3details);

        // PART 2



        // PART 3


    }
}
