package cz.alisma.alej.houska.L23;

import org.junit.Test;

public class MySynonymsTest {
	@Test
	public static void onlyOne() {
		Synonyms<String> syn = new MySynonyms<String>();
		syn.set("one", "jedna", "uno");
		
		assert.equals({"one" "jedna" "uno"}, syn.get("jedna"));
		//syn.getAll();
		
	}
	
}
