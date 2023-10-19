
public class Classes {
	
	/**
	 *Pizza, moto, país, animais, oceano, aviao
	 */
	public class Pizza{
		public String sabor;
		public String preco;
		
	public Pizza(String sabor, String preco) {
		
		this.sabor = sabor;
		this.preco = preco;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preço) {
		this.preco = preco;
	}
	
		
		
		}
	
	public class Moto {
		
		public String marca;
		public Double potencia;

	public Moto(String marca, double potencia) {
		
		this.marca = marca;
		this.potencia = potencia;
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}}
	
	
	public class Pais{
		
		public Integer habitantes;
		public String nome;
		public Pais(Integer habitantes, String nome) {
			
			this.habitantes = habitantes;
			this.nome = nome;
		}
		public Integer getHabitantes() {
			return habitantes;
		}
		public void setHabitantes(Integer habitantes) {
			this.habitantes = habitantes;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}}
	
	public class animais{
		
		public String reino;
		public String nome;
		public animais(String reino, String nome) {
			
			this.reino = reino;
			this.nome = nome;
		}
		public String getReino() {
			return reino;
		}
		public void setReino(String reino) {
			this.reino = reino;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
	}
	
	public class oceano{
		public String tipo;
		public Double tamanho;
		public oceano(String tipo, Double tamanho) {
			
			this.tipo = tipo;
			this.tamanho = tamanho;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public Double getTamanho() {
			return tamanho;
		}
		public void setTamanho(Double tamanho) {
			this.tamanho = tamanho;
		}		
	}
	
	
	public class aviao{
		public String fabricante;
		public Integer passageiros;
		public aviao(String fabricante, Integer passageiros) {
			this.fabricante = fabricante;
			this.passageiros = passageiros;
		}
		public String getFabricante() {
			return fabricante;
		}
		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		public Integer getPassageiros() {
			return passageiros;
		}
		public void setPassageiros(Integer passageiros) {
			this.passageiros = passageiros;
		}
		
		}
	}
	
