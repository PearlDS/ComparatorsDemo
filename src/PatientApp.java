import java.util.*;

public class PatientApp {
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

        System.out.println(patient.equals(patient8));
        System.out.println(patient.hashCode());
        System.out.println(patient8.hashCode());


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

        patientList.sort(new PatientAgeSorter().thenComparing(new PatientNameSorter()));
        patientList.add(patient);


        for (Patient p: patientList){
            System.out.println(p);
        }


        System.out.println("-------");


        Set<Patient> patientSet = new TreeSet<>(new PatientNameSorter().thenComparing(new PatientAgeSorter()));
       // Set<Patient> patientSet = new TreeSet<>((p1, p2) -> p1.getAge()-p2.getAge());
       // Set<Patient> patientSet = new TreeSet<>(Comparator.comparing(Patient::getAge).thenComparing(Patient::isInfected));
        patientSet.addAll(patientList);


        for (Patient p: patientSet){
            System.out.println(p);
        }

        System.out.println("-------");

        Patient patient13 = new Patient("Pearl", 453, false);
        patientSet.add(patient13);

        for (Patient p: patientSet){
            System.out.println(p);
        }

        System.out.println("-------");



        Queue <Patient> patientQueue = new PriorityQueue<>();
        patientQueue.addAll(patientList);





        //patientQueue.forEach(System.out::println);



//        while (patientQueue.size()>0){
//
//            System.out.println("Next patient is:"+ patientQueue.peek());
//            System.out.println("Handling patient:"+ patientQueue.poll());
//
//        }
//
//
//        Map<String, Patient> rijksregisterNummersPerPatient = new HashMap<>();
//        rijksregisterNummersPerPatient.put("45678-545.77", patient);
//
//        for (String RNR: rijksregisterNummersPerPatient.keySet()){
//            System.out.println(RNR + " belongs to: "+ rijksregisterNummersPerPatient.get(RNR));
//        }


    }
}
