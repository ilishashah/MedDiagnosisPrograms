import java.util.*;
public class Medical_Diagnosis {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select what part of the body is affected");
        System.out.println("Enter 1 for heart");
        System.out.println("Enter 2 for brain");
        System.out.println("Enter 3 for stomach");
        System.out.println("Enter 4 for sense organs");
        System.out.println("Enter 5 for teeth");
        int ch=sc.nextInt();
        switch(ch) {
        case 1:
            System.out.println("Select 2 symptoms out of these:Enter 1 for Chest pain,2 for fainting,3 for breathing difficulty,4 for sweating");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==1&&b==2||b==1&&a==2) {
                System.out.println("Sickness:Arrhythmia");
                System.out.println("Treatment:Beta blockers such as atenolol, bisoprolol and metoprolol should be taken");
            } else if(a==1&&b==3||b==1&&a==3) {
                System.out.println("Sickness:Valve Disease");
                System.out.println("Treatment: A procedure called transcatheter aortic valve replacement (TAVR) should be done");
            } else if(a==2&&b==3||b==2&&a==3) {
                System.out.println("Sickness:Heart Failure");
                System.out.println("Treatment:Angiotensin-converting enzyme (ACE) inhibitors");
            } else if(a==4&&b==1||b==4&&a==1) {
                System.out.println("Sickness:Unstable Angina");
                System.out.println("Treatment:Aspirin and Nitroglycerin should be taken");
            } else if(a==2&&b==4||b==2&&a==4) {
                System.out.println("Sickness:High Blood Pressure");
                System.out.println("Treatment:Reduce stress and alcohol, and introduce more sodium(salt) in diet");
            } else {
                System.out.println("Sickness:Pulmonary Embolism");
                System.out.println("Treatment:Anticoagulants also called blood thinners should be used");
            }
            break;
        case 2:
            System.out.println("Select 2 symptoms out of these: 1 for memory loss, 2 for confusion, 3 for incoordination, 4 for seizure");
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(c==1&&d==2||d==1&&c==2) {
                System.out.println("Sickness:Alzheimer's disease");
                System.out.println("Treatment:Galantamine, rivastigmine, and donepezil are inhibitors that are prescribed to cure Alzheimer's disease");
            } else if(c==3&&d==1||d==3&&c==1) {
                System.out.println("Sickness:Brain tumor");
                System.out.println("Treatment:Chemotherapy and radiation therapy help to cure brain tumor");
            } else if(c==3&&d==4||d==3&&c==4) {
                System.out.println("Sickness:Ataxia");
                System.out.println("Treatment:Take acetazolamide and avoid triggers such as stress, alcohol and caffeine");
            } else if(c==2&&d==4||d==2&&c==4) {
                System.out.println("Sickness:Cerebral Aneurysm");
                System.out.println("Treatment:Surgical Clipping can be performed or Endovascular Embolization Procedure");
            } else if(c==1&&d==4||d==1&&c==4) {
                System.out.println("Sickness:Dementia");
                System.out.println("Treatment:Inhibitors like donepezil, rivastigmine, galantamine and memantine should be used");
            } else {
                System.out.println("Sickness:Epilepsy");
                System.out.println("Treatment:Medicines called anti-epileptic drugs (AEDs) should be taken");
            }
            break;
        case 3:
            System.out.println("Select symptoms out of these:Enter 1 for vomiting, 2 for nausea,3 for loose bowels,4 for stomach pain");
            int e=sc.nextInt();
            int f=sc.nextInt();
            if(e==1&&f==2||f==1&&e==2) {
                System.out.println("Sickness:Gastritis");
                System.out.println("Treatment:Medications that neutralize stomach acid, like proton pump inhibitors (PPIs) or Pepto Bismol");
            } else if(e==2&&f==3||e==3&&f==2) {
                System.out.println("Sickness:Diarrhea");
                System.out.println("Treatment:Eating apples and drinking plenty of liquids, including water, broths and juices");
            } else if(e==1&&f==4||f==1&&e==4) {
                System.out.println("Sickness:Food poisoning");
                System.out.println("Treatment:Oral Rehydration Solution(ORS) should be taken");
            } else if(e==2&&f==4||f==2&&e==4) {
                System.out.println("Sickness:Gallstones");
                System.out.println("Treatment:Oral Dissolution Therapy should be taken");
            } else if(e==3&&f==4||f==3&&e==4) {
                System.out.println("Sickness:Stomach flu");
                System.out.println("Treatment:Drinking soda or noncaffeinated sports drinks. In some cases you can try oral rehydration solutions too");
            } else {
                System.out.println("Sickness:Viral Gastroenteritis");
                System.out.println("Treatment:Drink fluids and take paracetamol to fasten the curing");
            }
            break;
        case 4:
            System.out.println("Enter which sense organ is being affected");
            String s=sc.next();
            if(s.equalsIgnoreCase("ear")||s.equalsIgnoreCase("ears")) {
                System.out.println("Choose which part of the ear is affected:outer,middle or inner");
                String s1=sc.next();
                if(s1.equalsIgnoreCase("inner")) {
                    System.out.println("Your infection may be Labyrinthitis. Treatment:Corticosteroid medicine");
                } else if(s1.equalsIgnoreCase("middle")) {
                    System.out.println("Your infection may be otitis media. Treatment:Painkillers such as paracetamol and ibuprofen");
                } else if(s1.equalsIgnoreCase("outer")) {
                    System.out.println("Your infection may be swimmer's ear. Treatment:Thorough cleaning and steroid based ear drops");
                } else
                    System.out.println("Wrong choice entered");
            } else if(s.equalsIgnoreCase("eye")||s.equalsIgnoreCase("eyes")) {
                System.out.println("Select 2 symptoms out of these:Enter 1 for redness,2 for itchiness,3 for sensitivity to light");
                int g=sc.nextInt();
                int h=sc.nextInt();
                if(g==1&&h==2||h==1&&g==2) {
                    System.out.println("Your infection may be Conjunctivitis. Treatment:Antibiotic eye drops");
                } else if(g==2&&h==3||h==2&&g==3) {
                    System.out.println("Your infection may be Cataract. Treatment:Surgery to replace the defective lens");
                } else {
                    System.out.println("Your infection may be Corneal Ulcer. Treatment:Antimicrobial eye drops");
                }
            } else if(s.equalsIgnoreCase("nose")) {
                System.out.println("Select 2 symptoms out of these:Enter 1 for running nose, 2 for sneezing, 3 for nose bleeding");
                int i=sc.nextInt();
                int j=sc.nextInt();
                if(i==1&&j==2||i==2&&j==1) {
                    System.out.println("Your infection may be Sinusitis. Treatment:Steam therapy and penicillin should be taken");
                } else if(i==2&&j==3||j==2&&i==3) {
                    System.out.println("Your infection may be Epistaxis. Treatment:Apply petroleum jelly on the nostrils and sit upright");
                } else {
                    System.out.println("Your infection may be an allergic reaction. Treatment:Usage of EpiPens");
                }
            } else if(s.equalsIgnoreCase("tongue")) {
                System.out.println("Select 2 symptoms out of these:Enter 1 for swelling, 2 for redness, 3 for blisters");
                int k=sc.nextInt();
                int l=sc.nextInt();
                if(k==1&&l==2||k==2&&l==1) {
                    System.out.println("Your infection may be Cold Sore.Treatment:Apply ice and use medicines that contin menthol and phenol");
                } else if(k==1&&l==3||k==3&&l==1) {
                    System.out.println("Your infection may be Thrush.Treatment:Use antifungals (like nystatin) for 10-14 days");
                } else {
                    System.out.println("Your infection may be Transient lingual papillitis.Treatment:Warm salt water rinses and pain medications");
                }
            } else if(s.equalsIgnoreCase("skin")) {
                System.out.println("Select 2 symptoms out of these:Enter 1 for rashes, 2 for redness, 3 for blisters");
                int m=sc.nextInt();
                int n=sc.nextInt();
                if(m==1&&n==2||m==2&&n==1) {
                    System.out.println("Your infection may be Ringworm.Treatment:Antifungal creams or powders to be applied on the skin for 2 to 4 weeks");
                } else if(m==1&&n==3||m==3&&n==1) {
                    System.out.println("Your infection may be Impetigo.Treatment:Antibiotic creams and oral antibiotics should be taken");
                } else {
                    System.out.println("Your infection may be Chickenpox.Treatment:Calamine lotion and a cool bath added with baking soda");
                }
            } else {
                System.out.println("Wrong choice entered");
            }
            break;
        case 5:
            System.out.println("Select 2 symptoms out of these:Enter 1 for toothache, 2 for tooth sensitivity, 3 for swollen gums");
            int o=sc.nextInt();
            int p=sc.nextInt();
            if(o==1&&p==3||p==1&&o==3) {
                System.out.println("Infection:Cavity.Treatment:Dental fillings or crowns");
            } else if(o==2&&p==3||o==3&&p==2) {
                System.out.println("Infection:Gingivitis.Treatment:Using a softer toothbrush and flossing regularly");
            } else {
                System.out.println("Infection:Worn Tooth Enamel.Treatment:Tooth bonding or covering of the tooth with a crown or veneer");
            }
            break;
        default:
            System.out.println("Invalid Choice Entered");
        }
    }
}