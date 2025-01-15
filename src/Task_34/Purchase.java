package Task_34;

class Purchase {
    private String name;
    private int money;
    private int namber;

    public Purchase(String name, int money, Integer namber) {
        this.name = name;
        this.money = money;
        this.namber = namber;
    }

    @Override
    public String toString() {
        return name + ';' + money + ';' + namber;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = true;
        Purchase another = (Purchase) o;
        if (!(this.name.equals(another.name) && this.money == another.money)) {
            result = false;
        }
        return result;
    }

    @Override
    public int hashCode() {
        int c = Integer.hashCode(money);
        return 31 * c;
    }
}
