public class Stringproblems {

    static void calculate_total_cost(String s){
        int qtyBooks = 0, qtyPens = 0, qtyPencils = 0;
        int costBook = 0, costPen = 0, costPencil = 0;

        String words[] = s.split(" ");







    // reading from a long string and calculating cost 

        for(int i = 0; i < words.length; i++){
            try {
                int num = Integer.parseInt(words[i]);  // check if word is a number
                if(i+1 < words.length){   // look at next word
                    String item = words[i+1].toLowerCase();

                    if(item.contains("book")) {
                        if(i > 0 && words[i-1].equalsIgnoreCase("each"))
                            costBook = num;
                        else
                            qtyBooks = num;
                    }
                    
                    else if(item.contains("pen")) {
                        if(i > 0 && words[i-1].equalsIgnoreCase("each"))
                            costPen = num;
                        else
                            qtyPens = num;
                    }
                    else if(item.contains("pencil")) {
                        if(i > 0 && words[i-1].equalsIgnoreCase("each"))
                            costPencil = num;
                        else
                            qtyPencils = num;
                    }
                }
            } catch(NumberFormatException e){
                // ignore non-numbers
            }
        }

        int total = qtyBooks * costBook + qtyPens * costPen + qtyPencils * costPencil;
        System.out.println("Total Cost = " + total);
    }

    public static void main(String[] args) {
        String input = "A person bought 2 books 3 pens 4 pencils and each book 10 pen 5 pencil 2 cost is given";
        calculate_total_cost(input);

        // You can change statement order too:
        String input2 = "He got 5 pens 2 books each book 20 each pen 3 4 pencils each pencil 2";
        calculate_total_cost(input2);
    }
}
