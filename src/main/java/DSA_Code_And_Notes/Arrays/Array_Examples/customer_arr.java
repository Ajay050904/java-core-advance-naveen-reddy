package DSA_Code_And_Notes.Arrays.Array_Examples;

public class customer_arr {

    int cid;
    String cname;

    customer_arr[] getCustomerDetails() {
        customer_arr[] cA = new customer_arr[2];
        cA[0] = new customer_arr();
        cA[1] = new customer_arr();
        cA[0].cid = 111;
        cA[0].cname = "Ajay";
        cA[1].cid = 222;
        cA[1].cname = "Vijay";
        return cA;
    }

    public static void main(String[] args) {
        customer_arr C1 = new customer_arr();

        customer_arr[] a = C1.getCustomerDetails();

        // Loop through the array to print cid and cname for each customer
        for (customer_arr customer : a) {
            System.out.println("CID = " + customer.cid + " CNAME = " + customer.cname);
        }

        // System.out.println(a);

    }
}
