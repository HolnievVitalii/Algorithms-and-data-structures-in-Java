package lessonSix;


/**
 * @author holnievvitalii@outlook.com
 * @version dated Oct 23, 2019
 */
public class App {


    public static void main(String[] args) {
        int countOfTrees = 20;
        int balanced = 0;
        for (int i = 0; i < countOfTrees; i++) {
            Tree tree = new Tree();
            fillTree(tree);
            if (tree.isBalanced()) {
                balanced++;
            }

        }
        System.out.println(((balanced * 100) / countOfTrees) + " % of Trees is not balanced");
    }

    private static void fillTree(Tree customTree) {
            customTree.insert(new Person(randomNum()));

    }

    public static int randomNum(){
        int a = (int) (Math.random()*(200+1)) - 100;
        return a;
    }
}
