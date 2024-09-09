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

    private boolean isHighPriority(int gravity){
        return gravity >= 5 && triage == TriageType.GRAVITY;
    }

    private boolean isRadiologyRequired(VisibleSymptom symptom){
        return symptom == VisibleSymptom.BROKEN_BONE || symptom == VisibleSymptom.SPRAIN;
    }


    public void triagePatient(String name, int gravity, VisibleSymptom symptom) {

        if (isHighPriority(gravity)){
            doctorPatients.addFirst(name);

            if (isRadiologyRequired(symptom)){
                radiologyPatients.addFirst(name);
            }
        }

        else{
            doctorPatients.add(name);

            if (isRadiologyRequired(symptom)){
                radiologyPatients.add(name);
            }
        }
    }
}