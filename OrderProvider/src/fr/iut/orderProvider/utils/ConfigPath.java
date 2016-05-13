package fr.iut.orderProvider.utils;

/**
 * This class was made to simplify the configuration of the different paths used
 * by Voce/Sphinx4 and the OrderProvider
 *
 * @author Michel
 *
 */
public class ConfigPath {

	private String vocePath = "./";
	private String configFileName = "voce.config.xml";
	private String grammarPath = "./grammar/";
	private String grammarName = "digits";
	private String keyWordsPath = "./grammar/";

	/**
	 * Default constructor
	 */
	public ConfigPath() {

	}

	/**
	 * Get voce path
	 *
	 * @return voce path
	 */
	public String getVocePath() {
		return this.vocePath;
	}

	/**
	 * Set voce path</br>
	 * Default value is &quot;./&quot;
	 *
	 * @param vocePath
	 */
	public void setVocePath(String vocePath) {
		if (vocePath == "")
			vocePath = "./";
		this.vocePath = vocePath;
	}

	/**
	 * Get then name of the used configuration file
	 *
	 * @return the name of the used configuration file
	 */
	public String getConfigFileName() {
		return this.configFileName;
	}

	/**
	 * Set the name of the configuration file that must be used</br>
	 * Default value is &quot;voce.config.xml&quot;
	 *
	 * @param configFileName
	 *            the name of the configuration file to use
	 */
	public void setConfigFileName(String configFileName) {
		if (configFileName == "")
			configFileName = "voce.config.xml";
		this.configFileName = configFileName;
	}

	/**
	 * Get the path to the grammar file without the grammar file's name
	 *
	 * @return the path to the grammar file without the grammar file's name
	 */
	public String getGrammarPath() {
		return this.grammarPath;
	}

	/**
	 * Get the path to the grammar file
	 *
	 * @return the path to the grammar file
	 */
	public String getFullGrammarPath() {
		return this.grammarPath + "/" + this.grammarName;
	}

	/**
	 * Set the path of the folder that contains the grammar file</br>
	 * Default value is &quot;./grammar/&quot;
	 *
	 * @param grammarPath
	 *            the path of the folder that contains the grammar file
	 */
	public void setGrammarPath(String grammarPath) {
		if (grammarPath.equalsIgnoreCase("")) {
			this.grammarPath = "./";
			return;
		}
		this.grammarPath = grammarPath;
	}

	/**
	 * Get the name of the used grammar file
	 *
	 * @return the name of the used grammar file
	 */
	public String getGrammarName() {
		return this.grammarName;
	}

	/**
	 * Set the name of the grammar file to use without the &quot;.gram&quot;
	 * extension</br>
	 * The file must be a .gram file which use the JSGF format
	 *
	 * @see <a href=
	 *      "http://cmusphinx.sourceforge.net/doc/sphinx4/edu/cmu/sphinx/jsgf/JSGFGrammar.html"
	 *      target="blank">JSGF Grammar (Sphinx4)</a>
	 * @see <a href="https://www.w3.org/TR/jsgf/" target="blank">JSGF Grammar
	 *      (W3C)</a>
	 *
	 * @param grammarName
	 */
	public void setGrammarName(String grammarName) {
		if (grammarName.equalsIgnoreCase("")) {
			this.grammarName = "digits";
			return;
		}
		this.grammarName = grammarName;
	}

	/**
	 * Get the key words file path that
	 * 
	 * @return
	 */
	public String getKeyWordsPath() {
		return this.keyWordsPath;
	}

	/**
	 * Set the the key words file path</br>
	 * Default value is &quot:./grammar/&quot;
	 * 
	 * @param keyWordsPath
	 */
	public void setKeyWordsPath(String keyWordsPath) {
		this.keyWordsPath = keyWordsPath;
	}

	// /**
	// * Get the value of the removeWords variable
	// *
	// * @return
	// */
	// public boolean isRemoveWordsTrue() {
	// return removeWords;
	// }
	//
	// /**
	// * Set this to <code>true</code> to remove words
	// *
	// * @param removeWords
	// */
	// public void setRemoveWords(boolean removeWords) {
	// this.removeWords = removeWords;
	// }
	//
	// /**
	// * Get the path where the !!!file!!! is
	// *
	// * @return
	// */
	// public String getRemovablesWordsPath() {
	// return removablesWordsPath;
	// }
	//
	// /**
	// * Set the path where the !!!file!!! is If the value is not equal
	// * &quot;&quot; then &quot;removeWords&quot; is set to <code>true</code>
	// * Default value is the &quot;grammarPath&quot; value
	// *
	// * @param removablesWordsPath
	// */
	// public void setRemovablesWordsPath(String removablesWordsPath) {
	// if (removablesWordsPath == "") {
	// removablesWordsPath = this.grammarPath;
	// return;
	// }
	// this.removablesWordsPath = removablesWordsPath;
	// this.removeWords = true;
	// }

}
