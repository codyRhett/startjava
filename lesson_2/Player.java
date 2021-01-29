/*!
* \brief
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/

public class Player {
        private String name;
        private int number;
        private String state;

        public Player(String name) {
            this.name = name;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public String getName() {
            return name;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
}