

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Mapper{
    String nickName;
    int maps;
    int years;

    public Mapper(String nickName, int maps, int years) {
        this.nickName = nickName;
        this.maps = maps;
        this.years = years;
    }

   
}

public class StreamHW {
    public static void main(String[] args) {
        Mapper[] mapper = new Mapper[10];
        String[] nicknames = {"Sotarks", "RLC", "val", "Azer", "Skystar", "eyph0ria", "pishifat", "Bearzim", "Xexyz" , "_idke"};
        int[] years = {5, 7, 8, 6, 5, 2, 9, 4, 1, 7};
        int[] maps = {273, 59, 150, 63, 237, 3, 402, 27, 7, 83};
        for (int i = 0; i < 10; i++){
            mapper[i] = new Mapper(nicknames[i], maps[i], years[i]);
        }

        Stream.of(mapper).filter(element -> element.maps >= 50)
                            .map(element ->  element.nickName)
                            .sorted(Comparator.naturalOrder())
                            .collect(Collectors.toList())
                            .forEach(System.out::println);


    }
}