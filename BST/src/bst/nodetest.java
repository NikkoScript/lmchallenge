package bst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class nodetest {
	node n = new node();

	@Test
	void testinsert() {				
		assertEquals(-1,n.show());
		n.insert(7);
		assertEquals(7,n.show());
		n.insert(10);
		assertEquals(10,n.next().show());
		n.insert(4);
		assertEquals(4,n.prev().show());
		n.insert(3);
		assertEquals(3,n.prev().prev().show());
		n.insert(5);
		assertEquals(5,n.prev().next().show());
		n.insert(14);
		assertEquals(14,n.next().next().show());
	}
	
	@Test
	void testsize() {
		assertEquals(0,n.size());
		n.insert(7);
		assertEquals(1,n.size());
		n.insert(8);
		assertEquals(2,n.size());
		n.insert(6);
		assertEquals(3,n.size());
		n.insert(5);
		assertEquals(4,n.size());
	}
	
	@Test
	void testsearch() {
		n.insert(7);
		n.insert(10);
		n.insert(4);
		n.insert(3);
		n.insert(5);
		assertEquals(true,n.search(7));
		assertEquals(false,n.search(11));
		assertEquals(true,n.search(4));
		assertEquals(true,n.search(5));
		assertEquals(false,n.search(2));
	}
	
	@Test
	void testminmax() {
		n.insert(7);
		n.insert(10);
		n.insert(4);
		n.insert(3);
		n.insert(5);
		assertEquals(3,n.min());
		assertEquals(10,n.max());
	}
	

}
