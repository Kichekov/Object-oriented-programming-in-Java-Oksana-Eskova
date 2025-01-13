package Task_30;

public class Dog {
    private String nickname;//Кличка
    private String breed;//Порода
    private Collar collar;//Ошейник

    public Dog(String nickname, String breed, String color, double size) {
        this.nickname = nickname;
        this.breed = breed;
        this.collar = new Collar(color, size);;
    }

    public int compareTo(Dog o){
        int result = 0;
        if (collar.getSize() > o.collar.getSize()){
            result = 1;
        }
        if (collar.getSize() < o.collar.getSize()){
            result = -1;
        }
        return result;
    }

    private class Collar {// Класс ошейник
        private String color;//цвет
        private Double size;// Размер

        public Collar(String color, Double size) {
            this.color = color;
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public Double getSize() {
            return size;
        }
    }
}
