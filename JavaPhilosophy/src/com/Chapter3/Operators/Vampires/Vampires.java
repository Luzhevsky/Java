package com.Chapter3.Operators.Vampires;

public class Vampires {
    public static void main(String[] args) {
        int v1;
        int v2;
        int v3;
        int v4;

        for (int i = 1000; i < 9999; i++) {
            v1 = i % 10;
            v2 = i / 10 % 10;
            v3 = i / 100 % 10;
            v4 = i / 1000 % 10;
            int str = Integer.parseInt(v1 + "" + v2);
            int str2 = Integer.parseInt(v1 + "" + v3);
            int str3 = Integer.parseInt(v1 + "" + v4);

            int str_2 = Integer.parseInt(v2 + "" + v1);
            int str_2_2 = Integer.parseInt(v2 + "" + v3);
            int str_2_3 = Integer.parseInt(v2 + "" + v4);

            int str_3 = Integer.parseInt(v3 + "" + v1);
            int str_3_2 = Integer.parseInt(v3 + "" + v2);
            int str_3_3 = Integer.parseInt(v3 + "" + v4);

            int str_4 = Integer.parseInt(v4 + "" + v1);
            int str_4_2 = Integer.parseInt(v4 + "" + v2);
            int str_4_3 = Integer.parseInt(v4 + "" + v3);

            //str1 v1 v2
            if(v1 != 0 && v3 != 0){
                if(i == str * str_3_3){
                    System.out.println("Это число вампир = " + i);
                }
            }
            if(v1 != 0){
                if(i == str * str_4_3){
                    System.out.println("Это число вампир = " + i);
                }
            }

            //str2 v1 v3
            if(v1 != 0 && v2 != 0){
                if(i == str2 * str_2_3){
                    System.out.println("Это число вампир = " + i);
                }
            }
            if(v1 != 0){
                if(i == str2 * str_4_2){
                    System.out.println("Это число вампир = " + i);
                }
            }

            //str3 v1 v4
            if(v1 != 0 && v2 != 0){
                if(i == str3 * str_2_2){
                    System.out.println("Это число вампир = " + i);
                }
            }
            if(v1 != 0 && v3 != 0){
                if(i == str3 * str_3_2){
                    System.out.println("Это число вампир = " + i);
                }
            }

            //str_2
            if(v2 != 0 && v3 != 0){
                if(i == str_2 * str_3_3){
                    System.out.println("Это число вампир = " + i);
                }
            }
            if(v2 != 0){
                if(i == str_2 * str_4_3){
                    System.out.println("Это число вампир = " + i);
                }
            }

            //str_2_2 v2v3
//            if(v2 != 0 && v1 != 0){
//                if(i == str_2_2 * str3){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }
            if(v2 != 0){
                if(i == str_2_2 * str_4){
                    System.out.println("Это число вампир = " + i);
                }
            }

            //str_2_3 v2v4
//            if(v2 != 0 && v1 != 0){
//                if(i == str_2_3 * str2){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }
            if(v2 != 0 && v3 != 0){
                if(i == str_2_3 * str_3){
                    System.out.println("Это число вампир = " + i);
                }
            }

            //str_3 v3v1
//            if(v3 != 0 && v2 != 0){
//                if(i == str_3 * str_2_3){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }
            if(v3 != 0){
                if(i == str_3 * str_4_2){
                    System.out.println("Это число вампир = " + i);
                }
            }
            //str_3_2 v3v2
//            if(v3 != 0 && v1 != 0){
//                if(i == str_3_2 * str3){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }
            if(v3 != 0){
                if(i == str_3_2 * str_4){
                    System.out.println("Это число вампир = " + i);
                }
            }
            //str_3_3 v3v4

//            if(v3 != 0 && v1 != 0){
//                if(i == str_3_3 * str){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }

//            if(v3 != 0 && v2 != 0){
//                if(i == str_3_3 * str_2){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }

            //str_4 v4v1
//            if(v2 != 0){
//                if(i == str_4 * str_2_2){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }
//            if(v3 != 0){
//                if(i == str_4 * str_3_2){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }
            //str_4_2 v4v2
//            if(v1 != 0){
//                if(i == str_4_2 * str2){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }
//            if(v3 != 0){
//                if(i == str_4_2 * str_3){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }

            //str_4_3 v4v3
//            if(v1 != 0){
//                if(i == str_4_3 * str){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }

//            if(v2 != 0){
//                if(i == str_4_3 * str_2){
//                    System.out.println("Это число вампир = " + i);
//                }
//            }


        }
    }
}
