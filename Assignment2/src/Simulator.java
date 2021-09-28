public class Simulator {
    public static void main(String[] args) {
        MapleTree mapleTree = new MapleTree();
        Tulip tulip = new Tulip();
        Rose rose = new Rose();

        for(int i = 0; i < 3; i++){
            mapleTree.doSpring();
            tulip.doSpring();
            rose.doSpring();

            mapleTree.doSummer();
            tulip.doSummer();
            rose.doSummer();

            mapleTree.doFall();
            tulip.doFall();
            rose.doFall();
            
            mapleTree.doWinter();
            tulip.doWinter();
            rose.doWinter();
        }
    }
}
