import java.util.Comparator;
import java.util.Locale;

class SpacePersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getExperience()!=o2.getExperience()){
            return -Integer.compare(o1.getExperience(),o2.getExperience());

        }
        int counter1=countS(o1);
        int counter2=countS(o2);
if(counter1!=counter2){
    return -Integer.compare(counter1,counter2);
}
return Integer.compare(o1.getName().length(),o2.getName().length());

    }
    private int countS(Person p) {
        int counter=0;
        for (char letter : p.getName().toLowerCase().toCharArray()) {
            if (letter=='s'){
                counter++;
            }
        }
        return counter;
    }
}
