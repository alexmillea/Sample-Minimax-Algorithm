/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Millea - 13049189
 */
public class Main {

    public static void main(String[] args) {

		//root node
        Node parent = new Node(0);

		//child nodes 1,2,3
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        Node child3 = new Node(3);

		//gchild nodes / branches 4,5,6,1,2,3,5,6
        Node grandchild1 = new Node(4);
        Node grandchild2 = new Node(5);
        Node grandchild3 = new Node(6);

        Node grandchild4 = new Node(1);
        Node grandchild5 = new Node(2);


        Node grandchild6 = new Node(3);

        Node grandchild7 = new Node(5);
        Node grandchild8 = new Node(6);

		//ggchild 6,6,6  6,6,6  6,6
        Node greatgrandchild1 = new Node(6);
        Node greatgrandchild2 = new Node(6);
        Node greatgrandchild3 = new Node(6);

        Node greatgrandchild4 = new Node(6);
        Node greatgrandchild5 = new Node(6);
        Node greatgrandchild6 = new Node(6);

        Node greatgrandchild7 = new Node(6);
        Node greatgrandchild8 = new Node(6);

        parent.addChild(child1);
        parent.addChild(child2);
        parent.addChild(child3);

        child1.addChild(grandchild1);
        child1.addChild(grandchild2);
        child1.addChild(grandchild3);


        child2.addChild(grandchild4);
        child2.addChild(grandchild5);

        child2.addChild(grandchild6);

        child3.addChild(grandchild7);
        child3.addChild(grandchild8);

        grandchild1.addChild(greatgrandchild1);
        grandchild1.addChild(greatgrandchild2);
        grandchild1.addChild(greatgrandchild3);

        grandchild2.addChild(greatgrandchild4);
        grandchild2.addChild(greatgrandchild5);

        grandchild3.addChild(greatgrandchild6);

        grandchild7.addChild(greatgrandchild7);
        grandchild7.addChild(greatgrandchild8);

        Minimax minimax = new Minimax();

        int oneLevelDeepValue = minimax.minimax(parent, 1, true);
        System.out.println("The value of the search in the one level deep tree " + oneLevelDeepValue);


        int twoLevelsDeepValue = minimax.minimax(parent, 3, true);
        System.out.println("The value of the search in the two levels deep tree " + twoLevelsDeepValue);


    }
}


