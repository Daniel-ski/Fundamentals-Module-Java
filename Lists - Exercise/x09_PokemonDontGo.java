package Lists_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class x09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemonDistances = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        int sumRemoveElements = 0;

        while (pokemonDistances.size() > 0) {
            int inputIndex = Integer.parseInt(scanner.nextLine());


            if (inputIndex <= pokemonDistances.size() - 1) {
                int currentElement = pokemonDistances.get(inputIndex);

                sumRemoveElements += pokemonDistances.get(inputIndex);

                pokemonDistances.remove(inputIndex);

                modifiedList(pokemonDistances, currentElement);
            } else if (inputIndex < 0) {

                int currentElement = pokemonDistances.get(0);
                sumRemoveElements += pokemonDistances.get(0);

                pokemonDistances.remove(0);
                pokemonDistances.add(0, pokemonDistances.get(pokemonDistances.size() - 1));

                modifiedList(pokemonDistances, currentElement);

            } else if (inputIndex > pokemonDistances.size() - 1) {
                int currentElement = pokemonDistances.get(pokemonDistances.size() - 1);

                sumRemoveElements += pokemonDistances.get(pokemonDistances.size() - 1);

                pokemonDistances.remove(pokemonDistances.size() - 1);
                pokemonDistances.add(pokemonDistances.get(0));

                modifiedList(pokemonDistances,currentElement);

            }
        }
        System.out.println(sumRemoveElements);
    }

    private static void modifiedList(List<Integer> pokemonDistances, int currentElement) {
        for (int i = 0; i < pokemonDistances.size(); i++) {
            if (currentElement >= pokemonDistances.get(i)) {
                pokemonDistances.set(i, pokemonDistances.get(i) + currentElement);
            }else {
                pokemonDistances.set(i, pokemonDistances.get(i) - currentElement);
            }
        }
    }
}






