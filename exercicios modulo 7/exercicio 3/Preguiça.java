public class Preguiça extends Animal {
	private Boolean subirEmArvore;

	public Boolean getSubindoArvore() {
		return subirEmArvore;
	}

	public void setSubirEmArvire(Boolean estado) {
		this.subirEmArvore = estado;
	}

	public String toString() {
		return super.toString() + "\nesta subindo em arvore?:" + this.subirEmArvore;
	}
}
