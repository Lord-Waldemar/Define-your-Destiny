import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("Итак, твоя судьба как на ладони...\nХоть ты и забыл кем являлся, по тебе видно что ты " + randomRace()  + ".");

        System.out.println("Сейчас уже сложно сказать, но твоя рука точно касалась одного из двух камней хранителей.\n" +
                "Это был или " + randomStones()[0] + ", или " + randomStones()[1] + ".");

        System.out.println("Однозначно, у тебя мастерски были развиты такие навыки как " + randomAbilities()[0] + " и "
                        + randomAbilities()[1] + ". Помимо этого, ты был экспертом в навыке под названием " + randomAbilities()[2]
                        + " и адептом в навыке " + randomAbilities()[3] + "."
                );
    }
    public static String randomRace() {
        String[] race = {"Бретонец", "Имперец", "Норд", "Редгард", "Альтмер", "Босмер", "Данмер", "Орк", "Аргонианин", "Каджит"};
        return race[(int) (Math.random()* race.length)];
    }

    public static String[] randomStones() {
        String[] stones = {"Воин", "Леди", "Лорд", "Башня", "Конь", "Вор", "Любовник", "Тень", "Змей", "Маг", "Ученик", "Атронах", "Ритуал"};
        String[] chosenStones = new String[2];
        chosenStones[0] = stones[(int) (Math.random()* stones.length)];
        chosenStones[1] = stones[(int) (Math.random()* stones.length)];
        while (chosenStones[0]==chosenStones[1]){
            chosenStones[1] = stones[(int) (Math.random()* stones.length)];
        }
        return chosenStones;
    }

    public static String[] randomAbilities() {
        String[] abilities = {"Кузнечное дело", "Тяжелая броня", "Блокирование", "Двуручное оружие", "Одноручное оружие", "Стрельба", "Уклонение", "Скрытность",
                "Искусство мошенника", "Кулачный бой", "Сила голоса", "Алхимия", "Иллюзия", "Колдовство", "Разрушение", "Восстановление", "Изменение", "Зачарование"};
        ArrayList abilitiesList = new ArrayList();
        Collections.addAll(abilitiesList, abilities);
        String[] chosenAbilities = new String[4];
        for (int i = 0; i < 4; i++){
            chosenAbilities[i] = abilitiesList.get((int) (Math.random() * abilitiesList.size())).toString();
            abilitiesList.remove(chosenAbilities[i]);
        }
        return chosenAbilities;
    }
}