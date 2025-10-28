import java.util.*;

class My_BAS {
    static class BOp {
        String type;  
        int val;
        int cur_status;  

        BOp(String t, int v) {
            this.type = t;
            this.val = v;
            this.cur_status = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int init_Balance = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();  

        int bal = init_Balance;

        List<BOp> transactions = new ArrayList<>();
        List<Integer> commits = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split(" ");

            String op = parts[0];

            switch (op) {
                case "read":
                    System.out.println(bal);
                    break;

                case "credit":
                    int creditVal = Integer.parseInt(parts[1]);
                    bal += creditVal;
                    transactions.add(new BOp("credit", creditVal));
                    break;

                case "debit":
                    int debitVal = Integer.parseInt(parts[1]);
                    bal -= debitVal;
                    transactions.add(new BOp("debit", debitVal));
                    break;

                case "abort":
                    int abIndex = Integer.parseInt(parts[1]) - 1; 
                    if (abIndex >= 0 && abIndex < transactions.size() &&
                        transactions.get(abIndex).cur_status == 0) {
                        BOp t = transactions.get(abIndex);
                        if (t.type.equals("credit")) {
                            bal -= t.val;
                        } else {
                            bal += t.val;
                        }
                        t.cur_status = -1; 
                    }
                    break;

                case "commit":
                    for (BOp t : transactions) {
                        if (t.cur_status == 0) {
                            t.cur_status = 1;  
                        }
                    }
                    commits.add(bal); 
                    break;

                case "rollback":
                    int rbIndex = Integer.parseInt(parts[1]) - 1; 
                    if (rbIndex >= 0 && rbIndex < commits.size()) {
                        bal = commits.get(rbIndex);
                    }
                    break;
            }
        }
        sc.close();
    }
}