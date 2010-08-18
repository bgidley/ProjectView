package uk.co.gidley.projectView.pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA. User: ben Date: Aug 18, 2010 Time: 5:40:44 PM
 */
public class Loopy {

	private static final Logger logger = LoggerFactory.getLogger(Loopy.class);

	private List<String> items;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	private String item;

	public void onPrepare(){
		if( items == null){
			items= new ArrayList<String>();
			for (int i = 0; i < 2; i++){
				items.add("sometext");
			}
		}
	}

	public void onSuccessFromItemsForm(){

		logger.debug("Data was {}", items);
	}

	public List<String> getItems() {
		return items;
	}

}
