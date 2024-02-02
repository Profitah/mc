package hanoi;

public class hanoitower {
	//매개변수 - 디스크의 수: disk, 출발지 : source,  목적지 : dest, 보조 기둥 : aux
	public static void move(int disk, char source, char dest, char aux) {
	    if (disk == 1) {
	        System.out.println("이동 : Disk 1을 " + source + "에서 " + dest + "로 이동"); 
	    } else {
	    	//함수 move는 매개변수를 받아 디스크를 이동시킴.
	        move(disk - 1, source, aux, dest);
	        System.out.println("이동 : Disk " + disk + "을 " + source + "에서 " + dest + "로 이동");
	        move(disk - 1, aux, dest, source);
	    }
	}

	public static void main(String[] args) {
	    int numberOfDisks = 3; // 이동할 디스크의 수
	    move(numberOfDisks, 'A', 'B', 'C'); // A 기둥에서 C 기둥으로 이동
	}


}
