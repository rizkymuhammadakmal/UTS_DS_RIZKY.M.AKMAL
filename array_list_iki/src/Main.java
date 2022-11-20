import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new mahasiswa(2255201, "uwa amin", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255202, "popol", "TIFRM22B", 181122));
        mahasiswaList.add(new mahasiswa(2255203, "ucup", "TIFK22A", 181122));
        mahasiswaList.add(new mahasiswa(2255204, "asep kinderjoy", "TIFK22B", 181122));
        mahasiswaList.add(new mahasiswa(2255205, "pipin", "TIFRM22C", 181122));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        mahasiswaList.remove(0);

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
    }
}