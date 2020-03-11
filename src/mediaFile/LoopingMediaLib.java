package mediaFile;
public class LoopingMediaLib {
    public static void main(String[] args){

        String s = MediaFile.readString();
//        while(s != null){
//            System.out.println("from file: " + s);
//            s = MediaFile.readString();
//        }

//        while(s != null){
//            String title = s.substring(0, s.indexOf("|"));
//            String rating = s.substring((s.indexOf("|") + 1 ));
//
//            System.out.println("title: " + title);
//            System.out.println("rating: " + rating + "\n");
//            s = MediaFile.readString();
//        }

        while(s != null)
        {
            String title = s.substring(0, s.indexOf("|"));
            String rating = s.substring((s.indexOf("|") + 1 ));
            if(Integer.parseInt(rating) >= 9 ) {
                System.out.println("title: " + title);
                System.out.println("rating: " + rating + "\n");
            }
            s = MediaFile.readString();
        }


    }
}
