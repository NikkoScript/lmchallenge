package bst;

public class node implements binarySearchTreeItf{
	private binarySearchTreeItf root;
	private binarySearchTreeItf prev;
	private binarySearchTreeItf next;
	private int key;
	
	public node(binarySearchTreeItf n,int k) {
		this.root=n;
		this.prev=null;
		this.next=null;
		this.key=k;
	}
	
	public node() {
		this.root=null;this.prev=null;this.next=null;
		this.key=-1;
	}
	
	//task 1 : insert
	@Override
	public binarySearchTreeItf insert(int k) {
		if (root==null) {
			this.key=k;
			this.root=this;
		}
		else
		{
			if(k<this.key) {
				if(this.prev==null) this.prev= new node(this.root,k);
					else this.prev.insert(k);
			}
			else{
				if(this.next==null) this.next= new node(this.root,k);
					else this.next.insert(k);
			}
		}
		return this.root;
	}
	
	//task 1 : display basic information
	@Override
	public int show() {
		
		return this.key;
	}
	
	@Override
	public binarySearchTreeItf next() {
		return this.next;
	}
	
	@Override
	public binarySearchTreeItf prev() {
		return this.prev;
	}
	
	//task 2
	@Override
	public int size() {
		if (this.key==-1)return 0;
		else {
		if (this.next==null && this.prev==null) return 1;
		else if (this.next==null) return 1+this.prev.size();
		else if (this.prev==null) return 1+this.next.size();
		else return 1+this.prev.size()+this.next.size();
		}
	}

		//task 3
	@Override
	public boolean search(int k) {
		if (this.key==k) return true;
		else if (this.key>k) {
			if(this.prev==null) return false;
			else return this.prev.search(k);
		}
		else {
			if(this.next==null) return false;
			else return this.next.search(k);
		}
	}

		//task 4
	@Override
	public int max() {
		if(this.next==null) return this.key;
		else return this.next.max();
	}

	@Override
	public int min() {
		if(this.prev==null) return this.key;
		else return this.prev.min();
	}
	
	
	//bonus 
	
	public void display(String[] prm,int n ) {
		prm[n]=prm[n].concat(" " + String.valueOf(this.key));
		if (this.prev!=null) this.prev.display(prm,n+1);
		if (this.next!=null) this.next.display(prm,n+1);
		
	}
	

}
