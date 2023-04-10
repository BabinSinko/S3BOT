package hr.mi.chess.player.ai;

import hr.mi.chess.algorithm.GameStateSearch;
import hr.mi.chess.algorithm.SearchEndCondition;
import hr.mi.chess.evaluation.SimplePlusEvaluationFunction;
import hr.mi.chess.models.BoardState;
import hr.mi.chess.models.Move;
import hr.mi.chess.movegen.LegalMoveGenerator;
import hr.mi.chess.player.Player;

import java.util.List;

public class PlayerAlan implements Player {

    private int depth;

    public PlayerAlan(int depth) {
        this.depth = depth;
    }

    @Override
    public Move requestMove(BoardState boardState) {
        SearchEndCondition searchEndCondition = new SearchEndCondition();
        searchEndCondition.setMaxDepth(7);
        return (new GameStateSearch(new SimplePlusEvaluationFunction())).getBestMove(boardState, searchEndCondition);
    }
}
