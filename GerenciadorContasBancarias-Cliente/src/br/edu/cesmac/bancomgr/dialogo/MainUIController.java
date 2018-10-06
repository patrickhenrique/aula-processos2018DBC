package br.edu.cesmac.bancomgr.dialogo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.cesmac.bancomgr.conectores.ContaBusConn;
import br.edu.cesmac.bancomgr.conectores.MovBusConn;
import br.edu.cesmac.bancomgr.conectores.RendBusConn;
import br.edu.cesmac.bancomgr.ihc.UIAtivarContaUtil;
import br.edu.cesmac.bancomgr.ihc.UIConsultarSaldoUtil;
import br.edu.cesmac.bancomgr.ihc.UICriarCorrenteUtil;
import br.edu.cesmac.bancomgr.ihc.UICriarPoupancaUtil;
import br.edu.cesmac.bancomgr.ihc.UIDepositarUtil;
import br.edu.cesmac.bancomgr.ihc.UIDesativarContaUtil;
import br.edu.cesmac.bancomgr.ihc.UIObterExtratoGeralUtil;
import br.edu.cesmac.bancomgr.ihc.UIObterExtratoPeriodoUtil;
import br.edu.cesmac.bancomgr.ihc.UISacarUtil;
import br.edu.cesmac.bancomgr.ihc.UITransferirUtil;
import br.edu.cesmac.bancomgr.sharedmodel.Conta;
import br.edu.cesmac.bancomgr.sharedmodel.Transacao;
import br.edu.cesmac.bancomgr.sistema.operacoesConsulta.IConsultaOps;
import br.edu.cesmac.bancomgr.sistema.operacoesConta.ContasController;
import br.edu.cesmac.bancomgr.sistema.operacoesConta.IContaOps;
import br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao.IMovimentacaoOps;
import br.edu.cesmac.bancomgr.sistema.operacoesMovimentacao.MovimentacaoController;
import br.edu.cesmac.bancomgr.sistema.operacoesRendimento.IRendimentoOps;
import br.edu.cesmac.bancomgr.sistema.operacoesRendimento.RendimentoController;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainUIController {

	@SuppressWarnings("rawtypes")
	@FXML
	TableView tvContas;
	
	@SuppressWarnings("rawtypes")
	@FXML
	TableView tvTransacoes;
	
	
	private UICriarPoupancaUtil criarPoupUI;
	private UICriarCorrenteUtil criarCorUI;
	private UIDesativarContaUtil desativarContaUI;
	private UIAtivarContaUtil ativarContaUI;
	private UIConsultarSaldoUtil consultarSaldoUI;
	private UIObterExtratoPeriodoUtil obterExtratoPeriodoUI;
	private UIObterExtratoGeralUtil obterExtratoGeralUI;
	
	private UISacarUtil sacarUI;
	private UIDepositarUtil depositarUI;
	private UITransferirUtil transferirUI;
	
	
	private IContaOps contaOps;
	private IMovimentacaoOps movimentacaoOps;
	private IRendimentoOps rendimentoOps;
	
	
	
	
	public MainUIController() {
		this.criarPoupUI = new UICriarPoupancaUtil();
		this.criarCorUI = new UICriarCorrenteUtil();
		this.desativarContaUI = new UIDesativarContaUtil();
		this.ativarContaUI = new UIAtivarContaUtil();
		this.consultarSaldoUI = new UIConsultarSaldoUtil();
		this.obterExtratoPeriodoUI = new UIObterExtratoPeriodoUtil();
		this.obterExtratoGeralUI = new UIObterExtratoGeralUtil();
		
		this.sacarUI = new UISacarUtil();
		this.depositarUI = new UIDepositarUtil();
		this.transferirUI = new UITransferirUtil();
		
		this.contaOps = new ContasController(new ContaBusConn());
		this.movimentacaoOps = new MovimentacaoController(new MovBusConn());
		this.rendimentoOps = new RendimentoController(new RendBusConn());
	}
	
	
	
	
	
	
	
	@FXML
	public void reloadData() {
		//atualizar dados das contas
		List<Conta> contasCadastradas = this.contaOps.obterContas();
		this.updateTvContasData(contasCadastradas, 
				Arrays.asList("Número","Saldo", "Tipo", "Status"),
				Arrays.asList("numero", "saldo", "tipo", "status"),
				Arrays.asList(75d,75d,75d,75d));
		
		//atualizar dados das transacoes
		List<Transacao> transacoesCadastradas = this.movimentacaoOps.obterTransacoes();
		this.updateTvTransacoesData(transacoesCadastradas, 
				Arrays.asList("Origem","Destino", "Nome", "Valor"),
				Arrays.asList("numeroOrigem", "numeroDestino", "nome", "valor"),
				Arrays.asList(75d,75d,150d,75d));
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void updateTvContasData(List itens, List<String> columNames, List<String> attributeNames, List<Double> widths){
		
		List<TableColumn> columns = new ArrayList<>();
		for(String name : columNames){
			columns.add(new TableColumn<>(name));
		}
		
		for(int x = 0; x< columns.size(); x++){
			columns.get(x).setCellValueFactory(new PropertyValueFactory<>(attributeNames.get(x)));
			columns.get(x).setPrefWidth(widths.get(x));
		}
				
		tvContas.setItems(FXCollections.observableArrayList(itens));
		tvContas.getColumns().clear();
		tvContas.getColumns().addAll(columns);
	}
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void updateTvTransacoesData(List itens, List<String> columNames, List<String> attributeNames, List<Double> widths){
		
		List<TableColumn> columns = new ArrayList<>();
		for(String name : columNames){
			columns.add(new TableColumn<>(name));
		}
		
		for(int x = 0; x< columns.size(); x++){
			columns.get(x).setCellValueFactory(new PropertyValueFactory<>(attributeNames.get(x)));
			columns.get(x).setPrefWidth(widths.get(x));
		}
				
		tvTransacoes.setItems(FXCollections.observableArrayList(itens));
		tvTransacoes.getColumns().clear();
		tvTransacoes.getColumns().addAll(columns);
	}
	
	
	
	@FXML
	public void criarContaPoup() {
		this.criarPoupUI.showWindow();
	}
	
	@FXML
	public void criarContaCor() {
		this.criarCorUI.showWindow();
	}
	
	@FXML
	public void desativarConta() {
		this.desativarContaUI.showWindow();
	}
	
	@FXML
	public void ativarConta() {
		this.ativarContaUI.showWindow();
	}
	
	@FXML
	public void consultarSaldo() {
		this.consultarSaldoUI.showWindow();
	}
	
	@FXML
	public void obterExtratoPeriodo() {
		this.obterExtratoPeriodoUI.showWindow();
	}
	
	@FXML
	public void obterExtratoGeral() {
		this.obterExtratoGeralUI.showWindow();
	}
	
	
	
	
	@FXML
	public void sacar() {
		this.sacarUI.showWindow();
	}
	
	@FXML
	public void depositar() {
		this.depositarUI.showWindow();
	}
	
	@FXML
	public void transferir() {
		this.transferirUI.showWindow();
	}
	
	
	
	@FXML
	public void aplicarRendimento() {
		this.rendimentoOps.aplicarRendimento();
		this.reloadData();
	}
	
	@FXML
	public void cobrarJuros() {
		this.rendimentoOps.cobrarJuros();
		this.reloadData();
	}

}
