public class Cachorro extends Animal {
	private Boolean correr;

	// getters
	public Boolean getCorrer() {
		return correr;
	}

	// setters
	public void setCorrer(Boolean estado) {
		this.correr = estado;
	}

	public void dogShowYourself() {
		System.out.println("esta correndo?:" + correr);
	}
}
