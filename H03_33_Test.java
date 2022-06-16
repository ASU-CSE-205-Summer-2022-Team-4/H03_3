public class H03_33_Test {
    private H03_33 mCut;

    public static void main(String[] args) {
        new H03_33_Test().run();
    }
    private void run(){
        mCut = new H03_33();
        performTestCase(1,7.0, 3, 343.0);
        performTestCase(2,5.0, 2, 25.0);
        performTestCase(3,23.0, 6, 148035889.0);
        performTestCase(4,4.0, 5, 1024.0);
    }
    private void performTestCase(int pTestCaseNum, double pX, int pN, double pExpectedSum){
        printTestCaseInfo(pTestCaseNum, pX, pN, pExpectedSum);
        double actualSum = mCut.powerFaster(pX, pN);
        System.out.println("actual sum: " + actualSum);
        if(actualSum == pExpectedSum){
            System.out.println("passed\n");
        } else {
            System.out.println("failed\n");
        }
    }
    private void printTestCaseInfo(int pTestCaseNum, double pX, int pN, double pExpectedSum){
        System.out.println("test case number " + pTestCaseNum);
        System.out.println("x = " + pX + " n = " + pN + " expected sum = " + pExpectedSum + " ==> ");
    }
}
