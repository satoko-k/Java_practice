class For {
    public static void main(String[] args) {
    //    for(int i=0; i<=4; i++){
    //        if(i==3){
    //            break;
    //        }
    //        System.out.println(i);
    //    } 


        // for(int i=0; i<=4; i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // for文のネスト　for文の中にfor文
        // for(int i=0; i<=2; i++){
        //     for(int j=0; j<=2; j++){
        //         System.out.println( i + "-" + j );;

        //     }
        // }

        int arr[]={2,4,6,8,10};
        int sum =0;

        for(int i=0; i<=4; i++){
            sum += arr[i];
        }
        System.out.println(sum);




    }
    
}
