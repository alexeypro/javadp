public class Demo {
    public static void main(String[] args) {
        // we will be playing with smart machine which accepts
        // quarters and does not play without them
        // and we (client) cannot choose state -- gambling, you know :-)

        GameMachine game = new GameMachineImpl();

        game.insertQuarter();
        game.play();

        game.insertQuarter();
        game.play();

        game.insertQuarter();
        game.play();

        game.insertQuarter();
        game.play();
    }
}
