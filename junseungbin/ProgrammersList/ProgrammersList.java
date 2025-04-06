package assignment;

import java.util.Scanner;

class ProgrammersList {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int[] answer = {};

        if (n == 1) {
            answer = new int[b]; 
            System.arraycopy(num_list, 0, answer, 0, b); 
        } else if (n == 2) {
            int length = num_list.length - (a - 1); 
            answer = new int[length];
            System.arraycopy(num_list, a - 1, answer, 0, length);
        } else if (n == 3) {
            int length = b - a+1;
            answer = new int[length];
            System.arraycopy(num_list, a-1, answer, 0, length);
        } else if (n == 4) {
            int length = ((b - a) / c + 1);
            answer = new int[length];
            for (int i = 0; i < length; i++) {
                answer[i] = num_list[a + i * c - 1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProgrammersList solution = new ProgrammersList();

        System.out.print("1.숫자열의 0번 인덱스부터 b번 인덱스까지");
        System.out.print("\n2.숫자열의 a번 인덱스부터 마지막 인덱스까지");
        System.out.print("\n3.숫자열의 a번 인덱스부터 b번 인덱스까지");
        System.out.print("\n4.숫자열의 0번 인덱스부터 b번 인덱스까지 c의 간격으로");
        System.out.print("\n번호 입력(1, 2, 3, 4): ");
        int n = sc.nextInt();

        System.out.print("시작인덱스, 마지막 인덱스, 출력 간격을 순서대로 입력(a, b, c): ");
        int[] slicer = new int[3];
        for (int i = 0; i < 3; i++) {
            slicer[i] = sc.nextInt();
        }

        System.out.print("숫자열의 크기와 요소들을 하나씩 순서대로 입력하세요: ");
        int size = sc.nextInt();
        int[] num_list = new int[size];
        for (int i = 0; i < size; i++) {
            num_list[i] = sc.nextInt();
        }

        int[] result = solution.solution(n, slicer, num_list);

        System.out.print("결과: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
