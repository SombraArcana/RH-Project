public class CalcularBeneficios {

    public static int RetornaCalculoNoturno(int valorDaHora) {
        return (int) (valorDaHora * 1.2);
    }

    public static int RetornaCalculoHoraExtra(int valorDaHora) {
        return (int) (valorDaHora * 1.5);
    }

    public static int CalcularBeneficiosHorista(int valorDaHora) {
        int adicionalNoturno = RetornaCalculoNoturno(valorDaHora);
        int horaExtra = RetornaCalculoHoraExtra(valorDaHora);
        return adicionalNoturno + horaExtra;
    }

    public static int CalcularBeneficiosMensalista(int valorDaHora) {

        return RetornaCalculoHoraExtra(valorDaHora);
    }

}
