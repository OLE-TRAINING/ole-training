public class Cachorro extends Animal {
	private Boolean correr;

	public Boolean getCorrer() {
		return correr;
	}

	public void setCorrer(Boolean estado) {
		this.correr = estado;
	}

	public String toString() {
		return super.toString() + "\nesta correndo?:" + this.correr;
	}
}
