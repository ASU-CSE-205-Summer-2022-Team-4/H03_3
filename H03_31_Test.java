public class H03_31_Test {
    private H03_31 mCut;

    public static void main(String[] args) {
        new H03_31_Test().run();
    }
    private void run(){
        mCut = new H03_31();
        performTestCase(1,1,1);
        performTestCase(2,2,3);
        performTestCase(3,10,55);
    }
    private void performTestCase(int pTestCaseNum, int pN, int pExpectedSum){
        printTestCaseInfo(pTestCaseNum, pN, pExpectedSum);
        int actualSum = mCut.sum1toN(pN);
        if(actualSum == pExpectedSum){
            System.out.println("passed\n");
        } else {
            System.out.println("failed\n");
        }
    }
    private void printTestCaseInfo(int pTestCaseNum, int pN, int pExpectedSum){
        System.out.println("test case number " + pTestCaseNum);
        System.out.println("n = " + pN + " expected sum = " + pExpectedSum + " ==> ");
    }
}
