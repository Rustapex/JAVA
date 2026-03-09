package array;

public class Array3D {
    public static void main(String[] args) {
        String [][][] teamProj = {
                {
                        {"손영석" , "황스일",  "장해든",  "이현겸"  },
                        {"이용찬", "박세인", "김태준", "고지연"},
                        {"정철진" ,"엄진희"  ,"김민경", "여도현"},
                        {"이정하" ,"나해수", "조아진", "장윤성"  },
                        {"송주창", "김민정", "김재민",  "김건희" }

                },

                {
                        {"손영석" , "나해수",  "김민경",  "장윤성"  },
                        {"이용찬", "박세인", "김태준", "고지연"},
                        {"정철진" ,"엄진희"  ,"장해든", "여도현"},
                        {"이정하" ,"황스일", "조아진", "이현겸"  },
                        {"송주창", "김민정", "김재민",  "김건희" }

                }
        };

        for(int x=0; x<teamProj.length; x++){
            for(int y=0 ; y<teamProj[x].length; y++){
                for(int z=0; z< teamProj[x][y].length; z++){
                    System.out.printf("%d면 , %d열, %d행 : %s%n",x,y,z,teamProj[x][y][z]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
