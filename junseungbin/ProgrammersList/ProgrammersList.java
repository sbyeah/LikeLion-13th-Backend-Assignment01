package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProgrammersList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.숫자열의 0번 인덱스부터 b번 인덱스까지");
        System.out.println("2.숫자열의 a번 인덱스부터 마지막 인덱스까지");
        System.out.println("3.숫자열의 a번 인덱스부터 b번 인덱스까지");
        System.out.println("4.숫자열의 0번 인덱스부터 b번 인덱스까지 c의 간격으로");
        System.out.print("숫자 입력: ");

        int n = sc.nextInt();

        List<String> num_list = new ArrayList<String>();
        System.out.print("\n전체 숫자의 갯수 입력: ");
        int count = sc.nextInt();

        List<String> slicer = new ArrayList<String>();
        System.out.print("\n시작 인덱스 순서 입력(마지막 인덱스 순서 이하, 0개 이상): ");
        int a = sc.nextInt();
        System.out.print("\n마지막 인덱스 순서 입력(전체 갯수 이하, 시작 인덱스 순서 이상): ");
        int b = sc.nextInt();
        System.out.print("\n인덱스 간격 입력(1이상 3이하): ");
        int c = sc.nextInt();


        for(int i = 0 ; i < count ; i++){
            System.out.print("숫자들 순서대로 입력: ");
            num_list.add(sc.next());
        }

        if(n == 1) {
            System.out.print("\n" + num_list + "에서 1번 인덱스부터 " + b + "번 인덱스까지 자른 리스트는 [");
            for (int m = 0; m < b; m++) {
                System.out.print(num_list.get(m));
                if(m<b-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]입니다.");
        }

        if(n == 2){
            System.out.print("\n" + num_list + "에서 "+ a +"번 인덱스부터 마지막 인덱스까지 자른 리스트는 [");
            for (int m = a-1; m < count; m++) {
                System.out.print(num_list.get(m));
                if(m<count-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]입니다.");
        }

        if(n == 3){
            System.out.print("\n" + num_list + "에서 "+ a +"번 인덱스부터 " + b + "번 인덱스까지 자른 리스트는 [");
            for (int m = a-1; m < b; m++) {
                System.out.print(num_list.get(m));
                if(m<b-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]입니다.");
        }

        if(n == 4){
            System.out.print("\n" + num_list + "에서 " + a + "번 인덱스부터 " + b + "번 인덱스까지 " + c + "개 간격으로 자른 리스트는 [");
            for (int m = a-1; m < b; m=m+c) {
                System.out.print(num_list.get(m));
                if(m<b-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]입니다.");

        }
    }
}
