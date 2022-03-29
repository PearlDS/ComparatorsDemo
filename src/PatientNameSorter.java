import java.util.Comparator;

public class PatientNameSorter implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
