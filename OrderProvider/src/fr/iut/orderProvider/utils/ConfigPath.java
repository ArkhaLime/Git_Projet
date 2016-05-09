package fr.iut.orderProvider.utils;

/**
 * This class was made to simplify the configuration of the different paths used by Voce/Sphins4 and the Simplifier
 * @author Michel
 *
 */
public class ConfigPath {

	private String vocePath="./";
	private String configFileName="voce.config.xml";
	private String grammarPath;
	private String grammarName;
	private boolean removeWords=false;
	private String removablesWordsPath;
	
	
	/**
	 * Default constructor
	 */
	public ConfigPath() {

	}

	/**
	 * Get voce path
	 * @return voce path
	 */
	public String getVocePath() {
		return vocePath;
	}

	/**
	 * Set voce path</br>
	 * Default value is &quot;./&quot;
	 * 
	 * @param vocePath 
	 */
	public void setVocePath(String vocePath) {
		if(vocePath=="")vocePath="./";
		this.vocePath = vocePath;
	}

	/**
	 * Get then name of the used configuration file
	 * @return the name of the used configuration file
	 */
	public String getConfigFileName() {
		return configFileName;
	}

	/**
	 * Set the name of the configuration file which must be used</br>
	 * Default value is &quot;voce.config.xml&quot;
	 * 
	 * @param configFileName the name of the configuration file which must be used
	 */
	public void setConfigFileName(String configFileName) {
		if(configFileName=="")configFileName="voce.config.xml";
		this.configFileName = configFileName;
	}

	/**
	 * Get the path to the grammar file without the grammar file's name
	 * @return the path to the grammar file without the grammar file's name
	 */
	public String getGrammarPath() {
		return grammarPath;
	}
	
	/**
	 * Get the path to the grammar file 
	 * @return the path to the grammar file
	 */
	public String getFullGrammarPath() {
		return grammarPath+"/"+grammarName;
	}

	/**
	 * Set the path of the folder which contains the grammar file</br>
	 * If the &quot;removablesWordsPath&quot; has the same value then it will be set to the &quot;grammarPath&quot;
	 * @param grammarPath the path of the folder which contains the grammar file
	 */
	public void setGrammarPath(String grammarPath) {
		this.grammarPath = grammarPath;
	}

	/**
	 * Get the name of the used grammar file
	 * @return the name of the used grammar file
	 */
	public String getGrammarName() {
		return grammarName;
	}

	/**
	 * Set the name of the grammar file which must be used</br>
	 * The file is usually a .gram file which use the JSGF format
	 * @param grammarName
	 */
	public void setGrammarName(String grammarName) {
		this.grammarName = grammarName;
	}

	/**
	 * Get the value of the removeWords variable
	 * @return
	 */
	public boolean isRemoveWordsTrue() {
		return removeWords;
	}

	/**
	 * Set this to <code>true</code> to remove words
	 * @param removeWords
	 */
	public void setRemoveWords(boolean removeWords) {
		this.removeWords = removeWords;
	}

	/**
	 * Get the path where the !!!file!!! is
	 * @return 
	 */
	public String getRemovablesWordsPath() {
		return removablesWordsPath;
	}

	/**
	 * Set the path where the !!!file!!! is
	 * If the value is not equal &quot;&quot; then &quot;removeWords&quot; is set to <code>true</code>
	 * Default value is the &quot;grammarPath&quot; value
	 * @param removablesWordsPath
	 */
	public void setRemovablesWordsPath(String removablesWordsPath) {
		if(removablesWordsPath==""){
			removablesWordsPath=grammarPath;
			return;
		}
		this.removablesWordsPath = removablesWordsPath;
		this.removeWords=true;
	}
	
	

}
