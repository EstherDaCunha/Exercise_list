import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Planos\n2.Sólidos ");
        int esc = sc.nextInt();

        if (esc == 1){
            System.out.println("1.Círculo\n2.Triângulo\n3.Quadrado\n4.Retângulo");
            int forma_plana = sc.nextInt();

            switch (forma_plana){
                case 1:
                    System.out.println("Insira o valor do raio: ");
                    double raio = sc.nextInt();
                    double parte_1 = raio * raio;
                    double area_cir = 3.14 * parte_1;
                    System.out.println("O valor da área é: "+area_cir);
                    break;
                case 2:
                    System.out.println("Insira o valor da base: ");
                    double base_tri = sc.nextInt();
                    System.out.println("Insira o valor da altura: ");
                    double altura = sc.nextInt();
                    double area_tri = base_tri*altura/2;
                    System.out.println("O valor da área é: "+area_tri);
                    break;
                case 3:
                    System.out.println("Insira o valor do lado: ");
                    double lado = sc.nextInt();
                    double area_quad = lado*lado;
                    System.out.println("O valor da área é: "+area_quad);
                    break;
                case 4:
                    System.out.println("Insira o valor da base: ");
                    double base_ret = sc.nextInt();
                    System.out.println("Insira o valor da altura: ");
                    double altura_ret = sc.nextInt();
                    double area_ret = base_ret*altura_ret;
                    System.out.println("O valor da area é: "+area_ret);
                    break;
            }

        } else if (esc == 2){
            System.out.println("1.Prismas\n2.Cilindro\n3.Cubo");
            int solido = sc.nextInt();

            switch (solido){
                case 1:
                    System.out.println("1.Triangular\n2.Quadrangular\n3.Pentagonal\n4.Hexagonal");
                    int tipo_pri = sc.nextInt();

                    switch (tipo_pri){
                        case 1:
                            System.out.println("Insira o valor da altura da base: ");
                            double altura_pri = sc.nextInt();
                            double Ab_tri = altura_pri*altura_pri/2;
                            System.out.println("O valor da área da base é: "+Ab_tri);
                            System.out.println("Insira a altura do prisma: ");
                            double altura_lat = sc.nextInt();
                            double area_lat = altura_pri*altura_lat;
                            System.out.println("O valor da área lateral é: "+area_lat);
                            double area_total = area_lat*3+Ab_tri;
                            System.out.println("O valor da área total é: "+area_total);
                            break;
                        case 2:
                            System.out.println("Insira o valor do lado: ");
                            double lado_pri = sc.nextInt();
                            double Ab_qua = lado_pri*lado_pri;
                            System.out.println("O valor da área da base é: "+Ab_qua);
                            System.out.println("Insira o valor da altura total do prisma: ");
                            double altura_qua = sc.nextInt();
                            double At = altura_qua*lado_pri*3;
                            System.out.println("O valor da área total é: "+At);
                            break;
                        case 3:
                            System.out.println("Insira o valor do lado: ");
                            double lado_pen = sc.nextInt();
                            System.out.println("Insira o valor da altura: ");
                            double altura_pen = sc.nextInt();
                            double area_pen = lado_pen*5*altura_pen;
                            System.out.println("O valor da área é: "+area_pen);
                            break;
                        case 4:
                            System.out.println("Insira o valor do lado: ");
                            double lado_hex = sc.nextInt();
                            System.out.println("Insira o valor da altura: ");
                            double altura_hex = sc.nextInt();
                            double area_hex = lado_hex*6*altura_hex;
                            System.out.println("A área total é: "+area_hex);
                            break;
                    }
                case 2:
                    System.out.println();
            }

        }else{
            System.out.println("INSIRA 1 OU 2");
        }

    }
}
