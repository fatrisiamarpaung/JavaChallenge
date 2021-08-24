import java.util.Scanner;

public class Piramida {

    public static void main(String[] args) {
        int i, j, k, max;
        int x = 1;

        //max untuk nyimpan nilai dari looping untuk dapat hasil yg sesuai (+-)
        // loop i sbg main loop
        //loop j utk bikin spasi
        //x sebenernya cuma variabel yang akan menentukan posisi dari loop j & k dan penentu berapa kali akan dilakukan looping agar dapat mencapai nilai tengah maksimal


        for (i=1; i<=5; i++){
            max=i;

            for (j=5; j>i; j--){
                System.out.print("  ");
            }

            System.out.print(" "+i+" "); //print nilai i sebagai angka awal segitiga yaitu 1 2 3 4 5

            while (i>1){ //i harus >1 karena dimulai dari pinggir segitiga
                for (j=0; j<x; j++){ //j=0 lebih kecil dari x=1, fungsi loop ini utk +1 ke max agar max mengalami peningkatan nilai pd setiap iterasi, mis 3 jadi 4
                    max++;
                    System.out.print(max+" ");
                }
                x+=1;

                for (k=0; k<x-1;k++){ //loop k isinya segitiga ke 2 yg nilainya akan berkurang -1 di setiap iterasi
                    max--;
                    System.out.print(max+" ");
                }
                break;
            }
            System.out.println();
        }



    }

}
