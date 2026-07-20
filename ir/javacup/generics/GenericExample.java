package ir.javacup.generics;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" + "key=" + key + ", value=" + value + '}';
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Pair<String, Integer> studentGrade = new Pair<>("Sara", 20);
        System.out.println(studentGrade);

        Pair<Integer, String> cityCode = new Pair<>(98, "Iran");
        System.out.println(cityCode);

        Pair<String, String> dictionary = new Pair<>("Java", "A programming language");
        System.out.println(dictionary);

        studentGrade.setValue(19);
        System.out.println("Updated: " + studentGrade);
    }
}