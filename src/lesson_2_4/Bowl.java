package lesson_2_4;

public class Bowl {
    public int food;
    public Bowl(int food) {
        if (food < 0) {
            this.food = 0;
        } else {
            this.food = food;
        }
    }
    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }
    public int getFood() {
        return food;
    }
    public boolean takeFood(int amount) {
        if (amount > 0 && food >= amount) {
            food = food - amount;
            return true;
        }else {
        return false;
        }
    }

}
