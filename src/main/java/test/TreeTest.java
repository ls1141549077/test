package test;

import java.util.*;

/**
 * @Discription
 */

class Tree{
    private String id ;

    private String pid ;

    private List<Tree> child;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public List<Tree> getChild() {
        return child;
    }

    public void setChild(List<Tree> child) {
        this.child = child;
    }

    public Tree(String id, String pid) {
        this.id = id;
        this.pid = pid;
        this.child = new ArrayList<>();
    }
}


public class TreeTest {


    public static void main(String[] args) {
        Tree node1 = new Tree("1","0");
        Tree node2 = new Tree("2","0");
        Tree node3 = new Tree("3","1");
        Tree node4 = new Tree("4","1");
        Tree node5 = new Tree("5","2");
        Tree node6 = new Tree("6","4");

        List<Tree> trees = new ArrayList<>();
        trees.add( node1);
        trees.add( node2);
        trees.add( node3);
        trees.add( node4);
        trees.add( node5);
        trees.add( node6);

        List<Tree> result = new ArrayList<>();
        Map<String,Tree> map = new HashMap<>();

        for(Tree t :trees){
            map.put(t.getId(),t);
            if(t.getId().equals("1")){
                result.add(t);
            }
        }
        for (Tree tree : trees) {
            if(!tree.getPid().equals("0")){
                Tree tree1 = map.get(tree.getPid());
                tree1.getChild().add(tree);
            }
        }

        System.out.println(result);
        List<Tree> result1 = new ArrayList<>();
        LinkedList<Tree> queue = new LinkedList<>();
        for (Tree tree : result) {
            queue.add(tree);
        }
        while(!queue.isEmpty()){
            Tree tree = queue.pop();
            result1.add(tree);
            List<Tree> child = tree.getChild();
            for (Tree tree1 : child) {
                queue.add(tree1);
            }
        }

        System.out.println(result1);


    }



}
