package jp_morgan;

/*
    * You are given a state represented in bits. You are given a list of operations that need to be applied on the state.
 */

public class StateOperations {

    public static String applyOperation(int [] state, String [] operations) {
        for(int i = 0; i < operations.length; i++) {
            String operation = operations[i];

            if(operation.equals("L")) {
                state[i] = 1;
            } else if(operation.startsWith("C")) {
                int index = Integer.parseInt(operation.substring(1));
                state[index] = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int bit : state) {
            sb.append(bit);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int [] state = {0,0,0,0,0,0,0,0,0,0,};
        String [] operations = {"L","L","C0","L","C3"};
        String result = applyOperation(state, operations);
        System.out.println(result);

        // Test case 1: No operations
        int[] state1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String[] operations1 = {};
        System.out.println(applyOperation(state1, operations1)); // Expected: "0000000000"

        // Test case 2: All 'L' operations
        int[] state2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String[] operations2 = {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L"};
        System.out.println(applyOperation(state2, operations2)); // Expected: "1111111111"

        // Test case 3: All 'C' operations
        int[] state3 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        String[] operations3 = {"C0", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9"};
        System.out.println(applyOperation(state3, operations3)); // Expected: "0000000000"

    }
}
