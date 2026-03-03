public class ContinuStatment {

        public static void main(String[] args) {

            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    continue;            //Sirf 3 skip hua, loop continue hua.
                }
                System.out.println(i);
            }
        }
    }

