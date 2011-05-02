/**
 * Descreve uma arena para combate entre agentes. A arena contém uma lista com agentes
 * vivos e uma lista com os pontos de energia. Em cada iteração, todos os agentes vivos
 * são processados.
 * 
 * Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;
import java.util.ArrayList;

class Constants
{
	// Constantes para controle da tela (tamanho, resolução, etc).
	public static final int LARGURA_TELA 						= 800;
	public static final int ALTURA_TELA 						= 600;	
	public static final int LARGURA_MAPA						= 700;	
	public static final int ALTURA_MAPA							= 500;	
	
	// Define de quanto em quanto tempo a arena irá atualizar
	// todos os agentes
	public static final long INTERVALO_UPDATE 					= 100;
	
	// Informações sobre entidade
	public static final int ENTIDADE_ENERGIA_INICIAL 			= 100;	
	public static final int ENTIDADE_ENERGIA_GASTO_ANDAR 		= 2;
	public static final int ENTIDADE_ENERGIA_GASTO_VIVER 		= 1;
	public static final int ENTIDADE_ENERGIA_GASTO_DIVIDIR 		= 20;
	public static final int ENTIDADE_COMBATE_DANO 				= 5;
	public static final int ENTIDADE_COMBATE_RECOMPENSA			= 15;
	public static final int ENTIDADE_VELOCIDADE 				= 10;
	
	// Informações sobre os pontos de energia
	public static final int PONTO_ENERGIA_SUPRIMENTO_INICIAL		= 1000;
	public static final int PONTO_ENERGIA_REGENERA_TURNO			= 0;
	public static final int PONTO_ENERGIA_ENTREGA_TURNO				= ENTIDADE_ENERGIA_GASTO_VIVER + ENTIDADE_ENERGIA_GASTO_ANDAR + 1;
	public static final double PONTO_ENERGIA_AREA					= 10;
}
