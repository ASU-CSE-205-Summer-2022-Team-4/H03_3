public class H03_35_Test {
    private H03_35 mCut;
    public static void main(String[] args) {
        new H03_35_Test().run();
    }
    private void run(){
        mCut = new H03_35();
        performTestCase(1,"hello world", "dlrow olleh");
    }

    private void performTestCase(int pTestCaseNum, String pS, String pExpectedString){
        printTestCaseInfo(pTestCaseNum, pS, pExpectedString);
        String actualString = mCut.reverse(pS);
        System.out.println("actual string: " + actualString);
        if(actualString.equals(pExpectedString)){
            System.out.println("passed\n");
        } else {
            System.out.println("failed\n");
        }
    }
    private void printTestCaseInfo(int pTestCaseNum, String pS, String pExpectedString){
        System.out.println("test case number " + pTestCaseNum);
        System.out.println("s = " + pS + ", " + " expected string: " + pExpectedString + " ==> ");
    }
}
