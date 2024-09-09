package src;

import src.domain.Clinic;
import src.enums.TriageType;
import src.enums.VisibleSymptom;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        // Ceci n'est pas un test!! C'est un exemple d'utilisation.
        TriageType doctorTriageType = TriageType.FIFO;
        TriageType radiologyTriageType = TriageType.FIFO;

        Clinic clinic = new Clinic();
        clinic.triagePatient("bob", 2, VisibleSymptom.CHEST_PAIN);



        // Clinic clinic = new Clinic(doctorTriageType, radiologyTriageType /* , ... */)
        // clinic.triagePatient("John", 4, VisibleSymptom.MIGRAINE);
    }

}
