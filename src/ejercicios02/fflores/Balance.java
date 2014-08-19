package ejercicios02.fflores;

/**
 *
 * @author ffloresj
 */
public class Balance {
    private double nCaja;
    private double nBanco;
    private double nCtasPorCobrar;
    private double nInventario; //
    private double nInvMaterial;
    private double nInvProdProceso;
    private double nInvProdTerminado;
    private double nActivoCorriente; //
    private double nInmueble;
    private double nOtros;
    private double nActivoFijo; //
    private double nTotalActivo; //
    private double nDeudaProveedor;
    private double nDeudaEntidadFinanciera;
    private double nDeudaCrediChavin;
    private double nPasivoCorriente;//
    private double nPasivoLargoPlazo;
    private double nDeudaCrediChavinLP;
    private double nOtrasCtasPorPagar;
    private double nTotalPasivo;//
    private double nPatrimonio;
    private double nPatrimonioPasivo; //
    private double nCapitalDeTrabajo;

    public Balance() {
    }

    public Balance(double nCaja, double nBanco, double nCtasPorCobrar, double nInventario, double nInvMaterial, double nInvProdProceso, double nInvProdTerminado, double nActivoCorriente, double nInmueble, double nOtros, double nActivoFijo, double nTotalActivo, double nDeudaProveedor, double nDeudaEntidadFinanciera, double nDeudaCrediChavin, double nPasivoCorriente, double nPasivoLargoPlazo, double nDeudaCrediChavinLP, double nOtrasCtasPorPagar, double nTotalPasivo, double nPatrimonio, double nPatrimonioPasivo, double nCapitalDeTrabajo) {
        this.nCaja = nCaja;
        this.nBanco = nBanco;
        this.nCtasPorCobrar = nCtasPorCobrar;
        this.nInventario = nInventario;
        this.nInvMaterial = nInvMaterial;
        this.nInvProdProceso = nInvProdProceso;
        this.nInvProdTerminado = nInvProdTerminado;
        this.nActivoCorriente = nActivoCorriente;
        this.nInmueble = nInmueble;
        this.nOtros = nOtros;
        this.nActivoFijo = nActivoFijo;
        this.nTotalActivo = nTotalActivo;
        this.nDeudaProveedor = nDeudaProveedor;
        this.nDeudaEntidadFinanciera = nDeudaEntidadFinanciera;
        this.nDeudaCrediChavin = nDeudaCrediChavin;
        this.nPasivoCorriente = nPasivoCorriente;
        this.nPasivoLargoPlazo = nPasivoLargoPlazo;
        this.nDeudaCrediChavinLP = nDeudaCrediChavinLP;
        this.nOtrasCtasPorPagar = nOtrasCtasPorPagar;
        this.nTotalPasivo = nTotalPasivo;
        
    }

    public Balance(double nCaja, double nBanco, double nCtasPorCobrar, double nInvMaterial, double nInvProdProceso, double nInvProdTerminado, double nInmueble, double nOtros, double nDeudaProveedor, double nDeudaEntidadFinanciera, double nDeudaCrediChavin, double nPasivoLargoPlazo, double nDeudaCrediChavinLP, double nOtrasCtasPorPagar) {
        this.nCaja = nCaja;
        this.nBanco = nBanco;
        this.nCtasPorCobrar = nCtasPorCobrar;
        this.nInvMaterial = nInvMaterial;
        this.nInvProdProceso = nInvProdProceso;
        this.nInvProdTerminado = nInvProdTerminado;
        this.nInmueble = nInmueble;
        this.nOtros = nOtros;
        this.nDeudaProveedor = nDeudaProveedor;
        this.nDeudaEntidadFinanciera = nDeudaEntidadFinanciera;
        this.nDeudaCrediChavin = nDeudaCrediChavin;
        this.nPasivoLargoPlazo = nPasivoLargoPlazo;
        this.nDeudaCrediChavinLP = nDeudaCrediChavinLP;
        this.nOtrasCtasPorPagar = nOtrasCtasPorPagar;
    }

    
    
    public double getnCaja() {
        return nCaja;
    }

    public void setnCaja(double nCaja) {
        this.nCaja = nCaja;
    }

    public double getnBanco() {
        return nBanco;
    }

    public void setnBanco(double nBanco) {
        this.nBanco = nBanco;
    }

    public double getnCtasPorCobrar() {
        return nCtasPorCobrar;
    }

    public void setnCtasPorCobrar(double nCtasPorCobrar) {
        this.nCtasPorCobrar = nCtasPorCobrar;
    }

    public double getnInvMaterial() {
        return nInvMaterial;
    }

    public void setnInvMaterial(double nInvMaterial) {
        this.nInvMaterial = nInvMaterial;
    }

    public double getnInvProdProceso() {
        return nInvProdProceso;
    }

    public void setnInvProdProceso(double nInvProdProceso) {
        this.nInvProdProceso = nInvProdProceso;
    }

    public double getnInvProdTerminado() {
        return nInvProdTerminado;
    }

    public void setnInvProdTerminado(double nInvProdTerminado) {
        this.nInvProdTerminado = nInvProdTerminado;
    }

    public double getnInmueble() {
        return nInmueble;
    }

    public void setnInmueble(double nInmueble) {
        this.nInmueble = nInmueble;
    }

    public double getnOtros() {
        return nOtros;
    }

    public void setnOtros(double nOtros) {
        this.nOtros = nOtros;
    }

    public double getnDeudaProveedor() {
        return nDeudaProveedor;
    }

    public void setnDeudaProveedor(double nDeudaProveedor) {
        this.nDeudaProveedor = nDeudaProveedor;
    }

    public double getnDeudaEntidadFinanciera() {
        return nDeudaEntidadFinanciera;
    }

    public void setnDeudaEntidadFinanciera(double nDeudaEntidadFinanciera) {
        this.nDeudaEntidadFinanciera = nDeudaEntidadFinanciera;
    }

    public double getnDeudaCrediChavin() {
        return nDeudaCrediChavin;
    }

    public void setnDeudaCrediChavin(double nDeudaCrediChavin) {
        this.nDeudaCrediChavin = nDeudaCrediChavin;
    }

    public double getnPasivoLargoPlazo() {
        return nPasivoLargoPlazo;
    }

    public void setnPasivoLargoPlazo(double nPasivoLargoPlazo) {
        this.nPasivoLargoPlazo = nPasivoLargoPlazo;
    }

    public double getnDeudaCrediChavinLP() {
        return nDeudaCrediChavinLP;
    }

    public void setnDeudaCrediChavinLP(double nDeudaCrediChavinLP) {
        this.nDeudaCrediChavinLP = nDeudaCrediChavinLP;
    }

    public double getnOtrasCtasPorPagar() {
        return nOtrasCtasPorPagar;
    }

    public void setnOtrasCtasPorPagar(double nOtrasCtasPorPagar) {
        this.nOtrasCtasPorPagar = nOtrasCtasPorPagar;
    }
//******************//
    public double getnInventario() {
        nInventario = nInvMaterial + nInvProdProceso + nInvProdTerminado;
        return nInventario;
    }

    public double getnActivoCorriente() {
        nActivoCorriente = this.getnInventario() + nCaja + nBanco + nCtasPorCobrar;
        return nActivoCorriente;
    }

    public double getnActivoFijo() {
        nActivoFijo = nInmueble + nOtros;
        return nActivoFijo;
    }

    public double getnTotalActivo() {
        nTotalActivo = this.getnActivoCorriente() + this.nActivoFijo;
        return nTotalActivo;
    }

    public double getnPasivoCorriente() {
        nPasivoCorriente = nDeudaProveedor + nDeudaEntidadFinanciera + nDeudaCrediChavin;
        return nPasivoCorriente;
    }

    public double getnTotalPasivo() {
        nTotalPasivo = this.getnPasivoCorriente() + nPasivoLargoPlazo + nDeudaCrediChavinLP + nOtrasCtasPorPagar;
        return nTotalPasivo;
    }
    
     public double calcularPatrimonio(){
         return this.getnTotalActivo() - this.getnTotalPasivo() ;
    }
    
    public double calcularPatrimonioPasivo(){
        double nTotalPasivos = this.getnTotalPasivo();
        return nTotalPasivos + this.calcularPatrimonio();
    }
    
    public double calcularCapitalDeTrabajo(){
        return this.getnActivoCorriente() - this.getnPasivoCorriente();
    }
    
    public static void main(String args[]){
       Balance b = new Balance(10.0, 11.0, 12.0, 10.0, 11.0, 12.0, 10.0, 11.0, 5.0, 6.0, 7.0, 5.0, 6.0, 7.0);
       System.out.println("------------------ACTIVOS----------------------");
       System.out.println("Inventarios:         " + b.getnInventario() );
       System.out.println("Activo Corriente:    " + b.getnActivoCorriente() );
       System.out.println("Activo Fijo:         " + b.getnActivoFijo() );
       System.out.println("___________________________");
       System.out.println("TOTAL ACTIVOS:       " + b.getnTotalActivo());
       System.out.println("");

       System.out.println("------------------PASIVOS----------------------");
       System.out.println("Pasivo Corriente:    " + b.getnPasivoCorriente());
       System.out.println("___________________________");
       System.out.println("TOTAL PASIVOS:       " + b.getnTotalPasivo());
       System.out.println("");
       
       System.out.println("-----------------PATRIMONIO--------------------");
       System.out.println("Patrimonio:          " + b.calcularPatrimonio());
       System.out.println("Patrimonio + Pasivo: " + b.calcularPatrimonioPasivo());
       System.out.println("");
       
       System.out.println("-------------CAPITAL DE TRABAJO----------------");
       System.out.println("Capital de Trabajo:  " + b.calcularCapitalDeTrabajo());
       
    }    
    
}
