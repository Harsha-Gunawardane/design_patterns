package org.example.singleton;

public class President {

    // vulnarable to multi threads

//    private static President president = null;
//
//    private President(){}
//
//    public static President getPresident(){
//        if (president == null) president = new President();
//        return president;
//    }

    // issue with the storage
//    private static final President president = new President();
//
//    private President(){}
//    public static President getPresident(){ return president; }

    private static President president = null;

    private President(){}

    public static President getPresident(){
        if(president == null){
            synchronized (President.class){
                if(president == null) {
                    president = new President();
                }
            }
        }
        return president;
    }
}
