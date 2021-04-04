package lesson5_1;

    public class Numbers {
        private String number;
        private String number1;
        private String number2;

        public Numbers(String number, String number1, String number2) {
            this.number = number;
            this.number1 = number1;
            this.number2 = number2;
        }

        @Override
        public String toString() {
            return  number + ";" + number1 + ";" + number2 ;
        }
    }