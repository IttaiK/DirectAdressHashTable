public class Tester{
    public static void main(String[] args) {

        int TestCases = 0;
        int TestCasesPassed = 0;
        
        //test initialization
        TestCases++;
        DAHashTable HT1 = new DAHashTable(20);
        TestCasesPassed++;

        //test search with empty table
        TestCases++;
        if(HT1.search(8) == null){
            TestCasesPassed++;
        }

        //test insert into table
        TestCases++;
        HT1.insert(12);
        if(HT1.search(12) == 12){
            TestCasesPassed++;
        }

        //test insert into table at start
        TestCases++;
        HT1.insert(0);
        if(HT1.search(0) == 0){
            TestCasesPassed++;
        }

        //test insert into table at end
        TestCases++;
        HT1.insert(20);
        if(HT1.search(20) == 20){
            TestCasesPassed++;
        }

        //test insert overflow
        TestCases++;
        try{  
            HT1.insert(21);
        }catch(Exception RuntimeException){
            TestCasesPassed++;
        }

        //test insert underflow
        TestCases++;
        try{  
            HT1.insert(-1);
        }catch(Exception RuntimeException){
            TestCasesPassed++;
        }

        //test delete with empty table
        TestCases++;
        HT1.delete(8);
        if(HT1.search(8) == null){
            TestCasesPassed++;
        }

        //test insert into table
        TestCases++;
        HT1.delete(12);
        if(HT1.search(12) == null){
            TestCasesPassed++;
        }

        //test insert into table at start
        TestCases++;
        HT1.delete(0);
        if(HT1.search(0) == null){
            TestCasesPassed++;
        }

        //test insert into table at end
        TestCases++;
        HT1.delete(20);
        if(HT1.search(20) == null){
            TestCasesPassed++;
        }

        //test insert overflow
        TestCases++;
        try{  
            HT1.delete(21);
        }catch(Exception RuntimeException){
            TestCasesPassed++;
        }

        //test insert underflow
        TestCases++;
        try{  
            HT1.delete(-1);
        }catch(Exception RuntimeException){
            TestCasesPassed++;
        }

        System.out.println("Passed: " + TestCases + "/" + TestCasesPassed + " test cases");

    }
}