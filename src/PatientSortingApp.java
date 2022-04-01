import java.util.*;

public class PatientSortingApp {
    public static void main(String[] args) {



        Patient patient = new Patient("Yana", 3, false);
        Patient patient1 = new Patient("Dilshad", 11, true);
        Patient patient2 = new Patient("Aviva", 113, false);
        Patient patient3 = new Patient("Jeremy", 100, true);
        Patient patient4 = new Patient("Priyanka", 63, false);
        Patient patient5 = new Patient("Yohana", 80, true);
        Patient patient6 = new Patient("Mehmet", 23, false);
        Patient patient7 = new Patient("Nadira", 23, true);
        Patient patient8 = patient;
        Patient patient9 = new Patient("Aviva", 113, false);
        Patient patient10 = new Patient("Kubra", 23, false);
        Patient patient11 = new Patient("Irina", 13, true);
        Patient patient12 = new Patient("Nihat", 23, false);




        List<Patient> patientList = new ArrayList<>();
        patientList.add(patient);
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);
        patientList.add(patient6);
        patientList.add(patient7);
        patientList.add(patient8);
        patientList.add(patient9);
        patientList.add(patient10);
        patientList.add(patient11);
        patientList.add(patient12);

        patientList.sort(Comparator.naturalOrder());

        for (Patient p: patientList){
            System.out.println(p);
        }

        patientList.sort(Comparator.comparingInt(Patient::getAge));
        System.out.println("--------");

        for (Patient p: patientList){
            System.out.println(p);
        }





    }
}
