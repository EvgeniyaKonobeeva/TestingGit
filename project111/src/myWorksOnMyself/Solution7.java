package myWorksOnMyself;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Евгения on 24.07.2016.
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int n = scanner.nextInt();
        scanner.nextLine();
        int res[] = new int[n];
        for(int k = 0; k < n; k++){
            res[k] = 1;
        }
        for(int i = 0; i < n; i++) {
            String str1 = scanner.nextLine().toLowerCase();
            //System.out.println(str1);
            String str2 = scanner.nextLine().toLowerCase();
            str1 = str1.replaceAll("[[^а-я]&&\\W+]|\\s+","");
            str2 = str2.replaceAll("[[^а-я]&&\\W+]|\\s+","");

            System.out.println("first : " + str1 + " " + str1.length());
            System.out.println("second : " + str2 + " " + str2.length());

            char[] chs1 = str1.toCharArray();
            char[] chs2 = str2.toCharArray();
            LinkedList<Character> chAr1 = new LinkedList<>();
            ArrayList<Character> chAr2 = new ArrayList<>();
            for(int k = 0; k < chs1.length; k++){
                chAr1.add(chs1[k]);
            }
            for(int k = 0; k < chs2.length; k++){
                chAr2.add(chs2[k]);
            }

            if(chAr1.size() != chAr2.size()){
                res[i] = 0;

            }else {
                for(int k = 0; k< chAr1.size(); k++){
                    if(!chAr2.contains(chAr1.get(k))){
                        res[i] = 0;
                        break;
                    }else {
                        for (int j = 0; j < chAr2.size(); j++) {
                            if (chAr1.get(k) == chAr2.get(j)) {
                                chAr2.remove(j);
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("answer : ");
        System.out.println(Arrays.toString(res));


    }
}
