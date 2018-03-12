package linkedLists;
/**
 * Singly linked list with references to its first and its
 * last node. 
 * 
 * @author pirvos
 *
 */

import java.util.NoSuchElementException;

import linkedLists.LinkedList;
import linkedLists.AbstractSLList.SNode;

public class SLFLList<E> extends SLList<E>
{
	private SNode<E> first, last;   // reference to the first node and to the last node
	int length; 
	
	public SLFLList() {       // to create an empty list instance
		first = last = null; 
		length = 0; 
	}
	
	
	public void addFirstNode(Node<E> nuevo) {
		((SNode<E>) nuevo).setNext(first); 
		first = (SNode<E>) nuevo; 
		length++; 
	}

	public void addNodeAfter(Node<E> target, Node<E> nuevo) {
		((SNode<E>) nuevo).setNext(((SNode<E>) target).getNext()); 
		((SNode<E>) target).setNext((SNode<E>) nuevo); 
		length++; 
	}

	public void addNodeBefore(Node<E> target, Node<E> nuevo) {
		
		
	}

	public Node<E> getFirstNode() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node<E> getLastNode() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node<E> getNodeAfter(Node<E> target) throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node<E> getNodeBefore(Node<E> target)
			throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void removeNode(Node<E> target) {
		// TODO Auto-generated method stub
		
	}
	
	public Node<E> createNewNode() {
		return new SNode<E>();
	}

}
