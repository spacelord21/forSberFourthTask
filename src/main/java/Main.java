import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<City> cities = CityUtils.parse();
        findCountCitiesInRegion(cities);
    }

    private static void findCountCitiesInRegion(List<City> cities) {
        Map<String, Long> solutionMap = cities.stream().collect(Collectors.groupingBy(City::getRegion,Collectors.counting()));
        for(String s : solutionMap.keySet()) {
            System.out.println(s + " - " + solutionMap.get(s));
        }
    }

}
