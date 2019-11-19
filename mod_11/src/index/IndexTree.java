package index;

//package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IndexTree {

    private index.IndexNode root;

    public IndexTree() {
        this.root = null;
    }

    public IndexNode node() {
        return this.root;
    }

    public void add(String word, int lineNumber){
        this.root = add(this.root, word, lineNumber);
    }

    private IndexNode add(IndexNode root, String word, int lineNumber) {
        if (root == null) {
            return new IndexNode(word, lineNumber);
        }
        int comparison = word.compareTo(root.word);
        if (comparison == 0) {
            root.list.add(lineNumber);
            root.occurences += 1;
            return root;
        } else if (comparison < 0) {
            root.left = add(root.left, word, lineNumber);
            return root;
        } else {
            root.right = add(root.right, word, lineNumber);
            return root;
        }

    }

    private boolean contains(IndexNode root, String word) {
        if (root == null) {
            return false;
        }
        int compare = word.compareTo(root.word);

        if (compare == 0) {
            return true;
        } else if (compare < 0) {
            return contains(root.left, word);
        } else {
            return contains(root.right, word);
        }
    }

    public void delete(String word){
        this.root = delete(this.root, word);
    }

    private IndexNode delete(IndexNode root, String word) {
        if (root == null) {
            return null;
        }
        int compare = word.compareTo(root.word);

        if (compare < 0) {
            root.left = delete(root.left, word);
            return root;
        } else if(compare > 0){
            root.right = delete(root.right, word);
            return root;
        }else{
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.left == null && root.right != null) {
                return root.right;
            } else{
                IndexNode current = root.left;
                while(current.right != null){
                    current = current.right;
                }
                root.word = current.word;
                root.left = delete(root.left, root.word);
                return root;
            }
        }
    }



    // prints all the words in the index in inorder order
    // To successfully print it out
    // this should print out each word followed by the number of occurrences and the list of all occurrences
    // each word and its data gets its own line
    public void printIndex(){
        System.out.println("Printing Index");
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        preOrderTrav(root, 1, sb);
        return sb.toString();
    }

    private String toString(IndexNode root){
        if(root == null){
            return "";
        }
        String output = "";
        output += toString(root.left);
        output += root.word + " ";
        output += toString(root.right);
        return output;

    }

    private void preOrderTrav(IndexNode root, int occurence, StringBuilder sb){
        for (int i = 0; i < occurence; i++) {
            sb.append("  ");
        }
        if(root == null){
            sb.append("null\n");
        }else{
            sb.append(root.toString());
            sb.append("\n");
            preOrderTrav(root.left, occurence + 1, sb);
            preOrderTrav(root.right, occurence + 1, sb);
        }
    }

    public static void main(String[] args){
        IndexTree index = new IndexTree();
        int lineCount = 0;

        System.out.println("Starting process the input file");

        try {
            Scanner scanner = new Scanner(new File("Module 11 files/.idea/pg100.txt"));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                lineCount += 1;

                String[] words = line.split("\\s+");
                for(String word : words) {
                    word = word.replaceAll(":", "");
                    word = word.replaceAll("'", "");
                    word = word.replaceAll(",", "");
                    word = word.replaceAll("\\.", "");
                    word = word.replaceAll(" ", "");
                    word = word.replaceAll("}", "");
                    word = word.replaceAll("-", "");
                    word = word.replaceAll(";", "");
                    word = word.replaceAll("\\?", "");
                    word = word.replaceAll("!", "");
                    word = word.replaceAll("\"", "");
                    word = word.replaceAll(" ", "");
                    if(word.equals("")){
                        continue;
                    }
                    index.add(word, lineCount);
                }

            }
            scanner.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        System.out.println(index);
    }
}

