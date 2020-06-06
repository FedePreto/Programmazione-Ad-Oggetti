package com.univpm.ProgettoOOP.Model;

/** 
 * Rappresenta la classe che modella un tweet.
 * @author Ricciardi Nicola
 * @author Rendina Michele Pio
*/
public class Tweet 
{
	/**
	 * Id del tweet.
	 */
	protected String ID_Tweet;
	/**
	 * Testo del tweet.
	 */
	protected String Text;
	/**
	 * Lingua del tweet.
	 */
	protected String Lang;
	/**
	 * Nazione del tweet.
	 */
	protected String Nazione_Tweet;
	
	/**
	 * Data creazione tweet.
	 */
	protected String Data;
	
	/**
	 * Nome dell'utente che ha creato il tweet.
	 */
	protected String Nome_Utente;
	
	/**
	 * ID dell'utente che ha creato il tweet.
	 */
	protected String ID_Utente;
	
	/**
	 * Locazione dell'utente.
	 */
	protected String Location_Utente;

	/**
	 * Citta' del tweet.
	 */
	protected String Citta;
	
	/**
	 * Costruttore della classe Tweet che inizializza un'istanza.
	 * @param iD_Tweet ID del tweet.
	 * @param data Data di creazione del tweet.
	 * @param text Testo del tweet.
	 * @param lang Lingua del tweet.
	 * @param nazione_Tweet Nazione del tweet.
	 * @param nome_Utente Nome dell'utente.
	 * @param iD_Utente ID dell'utente.
	 * @param location_Utente Locazione dell'utente.
	 * @param citta Citta' del tweet.
	 */
	public Tweet(String iD_Tweet, String data, 
				String text, String lang, 
				String nazione_Tweet, String nome_Utente, 
				String iD_Utente, String location_Utente, 
				String citta) 
	{
		super(); // Richiamo del costruttore della classe superiore java.util
		ID_Tweet = iD_Tweet;
		Data = data;
		Text = text;
		Lang = lang;
		Nazione_Tweet = nazione_Tweet;
		Nome_Utente = nome_Utente;
		ID_Utente = iD_Utente;
		Location_Utente = location_Utente;
		Citta = citta;
	}
	
	/**
	 * Getter della data del tweet.
	 * @return Data Ritorna l'ID del tweet.
	 */
	public String getData() 
	{
		return Data;
	}

	/**
	 * Setter della data del tweet.
	 * @param data Data passata dal chiamante. 
	 */
	public void setData(String data) 
	{
		Data = data;
	}

	/**
	 * Getter dell'ID tweet.
	 * @return ID_Tweet Ritorna l'ID del tweet.
	 */
	public String getID_Tweet() 
	{
		return ID_Tweet;
	}

	/**
	 * Setter dell'ID tweet.
	 * @param iD_Tweet ID passato dal chiamante. 
	 */
	public void setID_Tweet(String iD_Tweet) 
	{
		ID_Tweet = iD_Tweet;
	}

	/**
	 * Getter del testo del  tweet.
	 * @return Text Ritorna il testo del tweet.
	 */
	public String getText()
	{
		return Text;
	}

	/**
	 * Setter del testo del tweet.
	 * @param text Testo passato dal chiamante.
	 */
	public void setText(String text)
	{
		Text = text;
	}

	/**
	 * Getter della lingua del tweet.
	 * @return Lang Ritorna la lingua del tweet.
	 */
	public String getLang() 
	{
		return Lang;
	}

	/**
	 * Setter della lingua del tweet.
	 * @param lang Lingua passata dal chiamante.
	 */
	public void setLang(String lang)
	{
		Lang = lang;
	}

	/**
	 * Getter della locazione del tweet.
	 * @return Location_Tweet Ritorna la nazione del tweet.
	 */
	public String getNazione_Tweet() 
	{
		return Nazione_Tweet;
	}

	/**
	 * Setter della locazione del tweet.
	 * @param location_Tweet Locazione passata dal chiamante.
	 */
	public void setNazione_Tweet(String nazione_Tweet)
	{
		Nazione_Tweet = nazione_Tweet;
	}

	
	/**
	 * Getter del Nome dell'utente.
	 * @return Nome_Utente Ritorna il nome dell'utente.
	 */
	public String getNome_Utente() 
	{
		return Nome_Utente;
	}

	/**
	 * Setter del Nome dell'utente.
	 * @param nome_Utente Nome dell'utente passato come parametro.
	 */
	public void setNome_Utente(String nome_Utente) 
	{
		Nome_Utente = nome_Utente;
	}

	/**
	 * Getter dell'ID dell'utente.
	 * @return ID_Utente Ritorna l'ID dell'utente.
	 */
	public String getID_Utente() 
	{
		return ID_Utente;
	}

	/**
	 * Setter dell'ID dell'utente.
	 * @param iD_Utente ID dell'utente passato dal chiamante.
	 */
	public void setID_Utente(String iD_Utente) 
	{
		ID_Utente = iD_Utente;
	}

	/**
	 * Gettere della locazione dell'utente.
	 * @return Location_Utente Ritorna la locazione dell'utente.
	 */
	public String getLocation_Utente() 
	{
		return Location_Utente;
	}

	/**
	 * Setter della locazione dell'utente.
	 * @param location_Utente Locazione dell'utente passata dal chiamante.
	 */
	public void setLocation_Utente(String location_Utente)
	{
		Location_Utente = location_Utente;
	}

	/**
	 * Getter della citta' del tweet.
	 * @return Citta Citta' del tweet.
	 */
	public String getCitta() 
	{
		return Citta;
	}

	/**
	 * Setter della citta' del tweet.
	 * @param citta Ritorna la citta' del tweet passata dal chiamante.
	 */
	public void setCitta(String citta)
	{
		Citta = citta;
	}
	
	
}
