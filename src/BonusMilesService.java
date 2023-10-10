public class BonusMilesService {
    public int calculate() {

        int price = 15_000;
        int bonus = 20;
        int miles = price / bonus;

        return miles;
    }
}
