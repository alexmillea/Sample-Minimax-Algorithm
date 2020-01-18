/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class Minimax {

    public int minimax(Node node, int depth, boolean isComputer) {

        if(depth == 0 || node.getChildren().size() == 0) {
            // evaluation function
            return node.getValue();
        }
        if (isComputer) {
            Integer value = Integer.MIN_VALUE;
            for (Node child: node.getChildren()) {
                value = Math.max(value, minimax(child, depth-1, false));
            }
            return value;
        } else {
            Integer value = Integer.MAX_VALUE;
            for (Node child: node.getChildren()) {
                value = Math.min(value, minimax(child, depth-1, true));
            }
            return value;
        }

    }

}
