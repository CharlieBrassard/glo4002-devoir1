package src.domain;
import java.util.LinkedList;
import java.util.List;

import src.enums.TriageType;
import src.enums.VisibleSymptom;

public class Clinic {
    private LinkedList<String> doctorPatients;
    private LinkedList<String> radiologyPatients;
    private TriageType triage;

    public Clinic(TriageType triage) {
        this.triage = triage;
        this.doctorPatients = new LinkedList<String>();
        this.radiologyPatients = new LinkedList<String>();
    }


    public void triagePatient(String name, int gravity, VisibleSymptom visibleSymptom) {

        if (gravity >= 5 && triage == TriageType.GRAVITY){
            doctorPatients.addFirst(name);
        }
        else{
            doctorPatients.add(name);
        }

        if (visibleSymptom == VisibleSymptom.BROKEN_BONE || visibleSymptom == VisibleSymptom.SPRAIN ){
            radiologyPatients.add(name);
        }
    }
}