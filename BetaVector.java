
public class BetaVector{
	ListPT items;
	public BetaVector(){
		items = new LinkedListPT();
	}
	
	public void add(int index, Object element){
		items.add(index,element);
	}
	
	public int size(){
		return items.size();
	}
	
	public Object elementAt(int index){
		return items.get(index);
	}
	public void removeAllElements(){
		items = new LinkedListPT();
	}
	public void addElement(Object item){
		add(items.size(),item);
	}
}