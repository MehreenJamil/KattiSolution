public class AlmostPerfect {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            
            try {
                int num = sc.nextInt();
                if (num >=0) {

                    int sum=0;
                    double DivLimit = Math.sqrt(num);
    
                  if ((int)DivLimit == DivLimit)
                      sum += (int)DivLimit;

                    //DivLimit = num / 2;

                   // sum = 1;
                    for (int i = 2; i < DivLimit; i++) {
                        if (num % i == 0) {
                            //sum += i;
            sum += i + (num / i);
                        }
                    }
                    sum +=1;
                    if (sum == num) {
                        System.out.println(num + " perfect");
                    } else if (Math.abs(sum - num) < 3) {
                        System.out.println(num + " almost perfect");
                    } else {
                        System.out.println(num + " not perfect");
                    }

                }
            } catch (NumberFormatException e) {
                System.exit(0);
              
            }

        }
        sc.close();

    }
    

}
