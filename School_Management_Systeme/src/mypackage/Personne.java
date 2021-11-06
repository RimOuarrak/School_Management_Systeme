package mypackage;

/**
 * Personne
 */
public class Personne {

    /***
	 * Persone id.
	 */
	private int id;
	/***
	 * Persone name.
	 */
	private String name;
	
	/***
	 * Persone image.
	 */
	private String image ;
    /***
     * Personne Adresse
     */
    private String Adresse;
	/***
	 * Persone email
	 */
	private String email;
	/***
	 * Persone phone number
	 */
	private int phoneNbr;
	/***
	 * 
	 * @return Persone id.
	 */
	public int getId() {
		return id;
	}
	/***
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/***
	 * 
	 * @return Persone name.
	 */
	public String getName() {
		return name;
	}
	/***
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/***
	 * 
	 * @return Persone image.
	 */
	public String getImage() {
		return image;
	}
	/***
	 * 
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/***
	 * 
	 * @return Persone email
	 */
	public String getEmail() {
		return email;
	}
	/***
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/***
	 * 
	 * @return phoneNbr
	 */
	public int getPhoneNbr() {
		return phoneNbr;
	}
	/***
	 * 
	 * @param phoneNbr
	 */
	public void setPhoneNbr(int phoneNbr) {
		this.phoneNbr = phoneNbr;
	}
	
/***
	 * 
	 * @return  Adresse
	 */
	public String getAddresse() {
		return Adresse;
	}
	/***
	 * 
	 * @param Adresse
	 */
	public void setAdresse(String Adresse) {
		this.Adresse = Adresse;
	}
	/***
	 * Persone constructor
	 * @param idInput
	 * @param nameInput
	 *
	 * @param imageInput
	 * @param emailInput
	 * @param phoneNbrInput
	 */
	public Personne(final int idInput, final String nameInput,
             final String imageInput,
            final String emailInput, final int phoneNbrInput,final String adresseInput ) {
		
		
		this.id = idInput;
        this.name = nameInput;
        this.Adresse=adresseInput;
        this.image = imageInput;
        this.email = emailInput;
        this.phoneNbr = phoneNbrInput;
	}
	
}