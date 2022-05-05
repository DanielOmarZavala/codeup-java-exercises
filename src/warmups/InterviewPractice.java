package warmups;

public class InterviewPractice {

    public static void main(String[] args) {


                String[] toppings = {"pepperoni", "sausage", "mushrooms", "pineapple", "olives"};

                List<String> toppingList = new ArrayList<>();

                Random random = new Random();

                for (int i = 0; i < 40; i++) {
                    toppingList.add(toppings[random.nextInt(toppings.length)]);
                }


                HashMap<String, Integer> toppingsMap = new HashMap<>();

                for (String topping : toppingList) {
                    if (toppingsMap.containsKey(topping)) {
                        toppingsMap.replace(topping, toppingsMap.get(topping) + 1);
                    } else {
                        toppingsMap.putIfAbsent(topping, 1);
                    }
                }

                System.out.println(toppingsMap.get("pepperoni"));
                System.out.println(toppingsMap.get("sausage"));
                System.out.println(toppingsMap.get("mushrooms"));
                System.out.println(toppingsMap.get("pineapple"));
                System.out.println(toppingsMap.get("olives"));

    }
}
