package cn.mejhwu.chapter10;

import com.sun.org.apache.bcel.internal.generic.CHECKCAST;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-1
 * Time: 下午8:56.
 */

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private Checkers() {}
    private  int moves = 0;
    private static final int MOVES = 3;
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game {
    private Chess() {}
    private int moves = 0;
    private static final int MOVES = 4;
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move());
    }
    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}
