package de.komoot.search.tests.green;

import de.komoot.search.SolrTestTemplate;

/*
 * Richard: Fehlschlag nicht reproduzierbar.
 * Ich hab alle ergebnisse, die vor bad griesbach zurückgegeben werden, ins xml gepackt. jedoch wird korrektes bad griesbach gefunden.
 */

public class SolrBadGriesbachTest extends SolrTestTemplate {
	public SolrBadGriesbachTest() {
		super("badGriesbach");
	}
}