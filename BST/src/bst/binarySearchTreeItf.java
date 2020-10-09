package bst;

public interface binarySearchTreeItf {
	public binarySearchTreeItf insert(int key);
	public int show();
	public binarySearchTreeItf prev();
	public binarySearchTreeItf next();
	public int size();
	public boolean search(int k);
	public int max();
	public int min();
    public void display(String[] s, int i);
}
