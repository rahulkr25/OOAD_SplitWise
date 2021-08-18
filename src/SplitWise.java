/*import java.util.ArrayList;
import java.util.HashMap;

public class SplitWise {
 
    private ArrayList<Expense>allexpensehistory;
    private HashMap<Integer,User>allexpense;
    public void adduser(User user)
    {
        allexpense.put(user.getid(), user);
    }
    public void show()
    {

    }
    public void showforgivenuser(User user)
    {
        ArrayList<Balance>particular_balances=new ArrayList<Balance>(allexpense.get(user.getid()));
        for(Balance balance:particular_balances)
        {
            
        } 

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        User rahul=new User("Rahul", "rahul.krcusat@gmail.com", "9471672151");
        User raju=new User("Raju", "raju.gmail.com", "9876543210");
        User rohan=new User("Rohan", "rohan@gmail.com", "9876543210");
        User rishav=new User("Rishav", "rishav@gmail.com", "9876543210");
        
        
/*There will be 3 types of input:
Expense in the format: 
EXPENSE <user-id-of-person-who-paid> <no-of-users> <space-separated-list-of-users> <EQUAL/EXACT/PERCENT> 
                                                                                      <space-separated-values-in-case-of-non-equal>
Show balances for all: SHOW
Show balances for a single user: SHOW <user-id>*/
/*
        SplitWise splitWise=new SplitWise();
        splitWise.adduser(rahul);
        splitWise.adduser(raju);
        splitWise.adduser(rohan);
        splitWise.adduser(rishav);

        splitWise.show();
        splitWise.showforgivenuser(rahul);

        //Rahul performing Action
        // generating arraylist of user to whom rahul wants to split bill
        ArrayList<User>dividewith;ArrayList<Double>amountwith;
        dividewith.add(raju);dividewith.add(rohan);dividewith.add(rishav);
        rahul.paid_with_split(3000,dividewith.size(),dividewith,"Equal",amountwith);
        // generating arraylist of user to whom rahul wants to split bill
        dividewith.clear();amountwith.clear();
        dividewith.add(raju);dividewith.add(rohan);amountwith.add(1800.00);amountwith.add(1200.00);
        rahul.paid_with_split(3000,dividewith.size(),dividewith,"Exact",amountwith);

        show();
        


       //Rohan performing Action
       //generating arraylist of user to whom rohan wants to split bill
       dividewith.clear();amountwith.clear();
       dividewith.add(rishav);dividewith.add(raju);amountwith.add(70.00);amountwith.add(30.00);
       rohan.paid_with_split(5000,dividewith.size(),dividewith,"Percent",amountwith);

       show();
       showforgivenuser(rahul);



    }
}
*/