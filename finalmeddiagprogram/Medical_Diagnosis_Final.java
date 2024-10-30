import java.util.Scanner;

public class Medical_Diagnosis_Final
 {
    public static void main() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Medical Diagnosis Program:");
        System.out.println("Reply saying 'yes' or 'no' in lowercase to the questions I ask below to identify your illness");


        System.out.println("Respiratory Symptoms");
        boolean cough = method1("Do you have a cough?", scanner);
        boolean sorethroat = method1("Do you have a sore throat?", scanner);
        boolean chestpain = method1("Do you have chest pain?", scanner);
        boolean breath = method1("Do you have shortness of breath?", scanner);
        boolean wheezing = method1("Do you experience wheezing?", scanner);

  
        System.out.println("Digestive Symptoms");
        boolean stomachPain = method1("Do you have stomach pain?",scanner);
        boolean nausea = method1("Are you nauseous?",scanner);
        boolean vomiting = method1("Have you vomitted?",scanner);
        boolean diarrhea = method1("Do you have diarrhea?",scanner);
        boolean bloating = method1("Are you experiencing bloating?",scanner);

        
        System.out.println("Muscle Related Symptoms");
        boolean jointPain = method1("Do you have some joint pain?",scanner);
        boolean muscleWeakness = method1("Do you feel muscle weakness?",scanner);
        boolean stiffness = method1("Do you feel stiffness in your joints/muscles?",scanner);

        
        System.out.println("Neurological Symptoms");
        boolean headache = method1("Do you have a headache?",scanner);
        boolean dizziness = method1("Do you experience dizziness?",scanner);
        boolean confusion = method1("Do you feel confused or disoriented?",scanner);

        
        System.out.println("Skin-Related Symptoms");
        boolean rash = method1("Do you have any skin rashes?", scanner);
        boolean itching = method1("Do you feel itching?", scanner);
        boolean redness = method1("Is there any redness?", scanner);

        
        System.out.println("General Symptoms");
        boolean f1 = method1("Do you have a fever?", scanner);
        boolean f2 = method1("Do you feel tired?", scanner);

        diagnose(cough, sorethroat, chestpain, breath, wheezing, 
            stomachPain, nausea, vomiting, diarrhea, bloating,         
            jointPain, muscleWeakness, stiffness,                      
            headache, dizziness, confusion,                            
            rash, itching, redness,                                    
            f1, f2);

        scanner.close();
    }

    public static boolean method1(String question, Scanner scanner) 
    {
        System.out.print(question + " ");
        return scanner.next().equalsIgnoreCase("yes");
    }

    public static void diagnose(boolean cough, boolean sorethroat, boolean chestpain, boolean breath, boolean wheezing,
                                boolean stomachPain, boolean nausea, boolean vomiting, boolean diarrhea, boolean bloating,
                                boolean jointPain, boolean muscleWeakness, boolean stiffness,
                                boolean headache, boolean dizziness, boolean confusion,
                                boolean rash, boolean itching, boolean redness,
                                boolean f1, boolean f2) {

        System.out.println("Diagnosis and Suggested Treatment:");

        
        if (cough && sorethroat && f1 && breath) {
            System.out.println("Possible Condition: COVID or Viral Pneumonia");
            System.out.println("Treatment: Seek medical testing for accurate diagnosis. Rest, hydration, and isolation are recommended.");
        } else if (cough && sorethroat && f1 && wheezing) {
            System.out.println("Possible Condition: Bronchitis");
            System.out.println("Treatment: Rest, plenty of fluids, and consider cough medicine. Meet your doctor if symptoms get worse");
        } else if (chestpain && breath && dizziness) {
            System.out.println("Possible Condition: Heart Condition");
            System.out.println("Treatment: Go to a doctor immediately");
        }

        
        else if (stomachPain && nausea && vomiting && diarrhea) 
        {
            System.out.println("Possible Condition: Gastroenteritis (Stomach Flu)");
            System.out.println("Treatment: Stay hydrated, rest, avoid solid food until symptoms improve.");
        } else if (stomachPain && bloating && f2) 
        {
            System.out.println("Possible Condition: Irritable Bowel Syndrome (IBS)");
            System.out.println("Treatment: Manage stress, eat a balanced diet, and avoid trigger foods.");
        }

        
        else if (jointPain && stiffness && f2) 
        {
            System.out.println("Possible Condition: Arthritis");
            System.out.println("Treatment: Exercise regularly, manage weight, and take anti-inflammatory medications");
        } else if (muscleWeakness && jointPain && f2) 
        {
            System.out.println("Possible Condition: Fibromyalgia");
            System.out.println("Treatment: Exercise, stress management, and consult a physician for pain management.");
        }

        
        else if (headache && dizziness && confusion) {
            System.out.println("Possible Condition: Migraine or maybe Mild Concussion");
            System.out.println("Treatment: Rest in a dark room, and consult a doctor if symptoms get worse");
        } else if (dizziness && nausea && vomiting) {
            System.out.println("Possible Condition: Vertigo or Inner Ear Disorder");
            System.out.println("Treatment: Avoid sudden movements, rest, and consult an ENT specialist if needed.");
        }

        
        else if (rash && itching && redness)
        
        {
            System.out.println("Plausible Condition: Allergic Reaction or Dermatitis");
            System.out.println("Treatment: Use good skin lotions or creams, avoid known allergens, and consult a dermatologist if it gets worse.");
        } else if (f1 && rash && jointPain) {
            System.out.println("Possible Condition: Dengue Fever or Viral Infection");
            System.out.println("Treatment: See a doctor immediately, and avoid anti-inflammatory drugs");
        }

        
        else if (f2 && f1 && muscleWeakness) {
            System.out.println("Possible Condition: Mononucleosis (Mono) or Chronic Fatigue Syndrome");
            System.out.println("Treatment: Rest, hydration, and manage stress.");
        }

        
        else 
        
        {
            System.out.println("Diagnosis: Not able to diagnose condition based on symptoms given");
            System.out.println("Recommendation: Consult a doctor");
        }
    }
}
