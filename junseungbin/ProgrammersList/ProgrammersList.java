import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if (n == 1) {
            answer = Arrays.copyOfRange(num_list, 0, b + 1);
        } else if (n == 2) {
            answer = Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            answer = Arrays.copyOfRange(num_list, a, b + 1);
        } else if (n == 4) {
            int size = (b - a) / c + 1;
            answer = new int[size];
            
            int index = 0;
            for (int i = a; i <= b; i += c) {
                answer[index++] = num_list[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.숫자열의 0번 인덱스부터 b번 인덱스까지");
        System.out.println("2.숫자열의 a번 인덱스부터 마지막 인덱스까지");
        System.out.println("3.숫자열의 a번 인덱스부터 b번 인덱스까지");
        System.out.println("4.숫자열의 0번 인덱스부터 b번 인덱스까지 c의 간격으로");
        System.out.print("번호 입력(1, 2, 3, 4): ");
        int n = sc.nextInt();
        
        System.out.print("시작 인덱스, 마지막 인덱스, 출력 인덱스간의 간격 순서대로 입력: ");
        int[] slicer = new int[3];
        slicer[0] = sc.nextInt();
        slicer[1] = sc.nextInt();
        slicer[2] = sc.nextInt();
        
        System.out.print("숫자열의 크기 입력: ");
        int numListSize = sc.nextInt();
        
        int[] num_list = new int[numListSize];
        System.out.print("숫자열의 숫자 입력: ");
        for (int i = 0; i < numListSize; i++) {
            num_list[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int[] result = sol.solution(n, slicer, num_list);
        
        System.out.println("결과: " + Arrays.toString(result));
        
        sc.close();
    }
}
