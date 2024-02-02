package hanoi;

public class Hanoi {
    static int c = 0; // 이동 횟수를 카운트하기 위한 변수

    static void move(int n, char from, char to, char aux) { // 매개변수 - 디스크의 수: disk, 출발지 : source, 목적지 : dest, 보조 기둥 : aux
        if (n == 1) {
            c++; // 디스크를 한 번 이동할 때마다 이동 횟수 증가
            System.out.println(c + " 이동 : from " + from + " to " + to);
        } else {
            move(n - 1, from, aux, to);
            c++; // 디스크를 한 번 이동할 때마다 이동 횟수 증가
            System.out.println(c + " 이동 : from " + from + " to " + to);
            move(n - 1, aux, to, from);
        }
    }

    public static void main(String[] args) {
        move(4, 'A', 'B', 'C'); // move(4, 'A', 'B', 'C') 호출
    }
}
