// import necessary packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CTAn_Reader {
    public double getDouble(List<char[]> L, int row, int column){
        StringBuilder str = new StringBuilder();
        while (L.get(row)[column] != ',' && L.get(row)[column] != ' ' && L.get(row)[column] != ')'){
            str.append(L.get(row)[column]);
            column++;
        }
        return Double.parseDouble(str.toString());
    }
    // to handle exceptions include throws
    public static void main(String[] args)
            throws IOException
    {
        // list that holds strings of a file
        List<String> listOfStrings = new ArrayList<>();

        // load data from file
        BufferedReader bf = new BufferedReader(new FileReader("s182671l_four_3d.txt"));

        // read entire line as string
        String line = bf.readLine();

        // checking for end of file
        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }

        // closing buffered reader object
        bf.close();

        // storing the data in arraylist to array
        String[] array = listOfStrings.toArray(new String[0]);

        List<char[]> L = new ArrayList<>();
        for (String str : array){
            L.add(str.toCharArray());
        }

        double pixel = 0.02;
        int row;
        int column;

        CTAn_Reader reader = new CTAn_Reader();

        //tissue volume, TV
        row = 17;
        column = 17;
        double TV = reader.getDouble(L, row, column) * Math.pow(pixel, 3);
        System.out.println(TV);
        //System.out.printf("tissue volume, TV = %.5f mm^3 %n", TV);

        //bone volume, BV
        row = 18;
        column = 15;
        double BV = reader.getDouble(L, row, column) * Math.pow(pixel, 3);
        System.out.println(BV);
        //System.out.printf("bone volume, BV = %.5f mm^3 %n", BV);

        //percent bone volume, BV_TV
        row = 19;
        double BV_TV = BV / TV * 100;
        System.out.println(BV_TV);
        //System.out.printf("percent bone volume, BV_TV = %.5f", BV_TV);
        //System.out.println("%");

        //tissue surface, TS
        row = 20;
        column = 18;
        double TS = reader.getDouble(L, row, column) * Math.pow(pixel, 2);
        System.out.println(TS);
        //System.out.printf("tissue surface, TS = %.5f mm^2 %n", TS);

        //bone surface, BS
        row = 21;
        column =   16;
        double BS = reader.getDouble(L, row, column) * Math.pow(pixel, 2);
        System.out.println(BS);
        //System.out.printf("bone surface, BS = %.5f mm^2 %n", BS);

        //intersection surface, iS
        row = 22;
        column = 25;
        double iS = reader.getDouble(L, row, column) * Math.pow(pixel, 2);
        System.out.println(iS);
        //System.out.printf("intersection surface, iS = %.5f mm^2 %n", iS);

        //bone surface/volume ratio, BS_BV
        row = 23;
        double BS_BV = BS / BV;
        System.out.println(BS_BV);
        //System.out.printf("bone surface/volume ratio, BS_BV = %.5f %n", BS_BV);

        //bone surface density, BS_TV
        row = 24;
        double BS_TV = BS / TV;
        System.out.println(BS_TV);
        //System.out.printf("bone surface density, BS_TV = %.5f /mm %n", BS_TV);

        //trabecular pattern factor, Tb_Pf
        row = 25;
        column = 32;
        double Tb_Pf = reader.getDouble(L, row, column) / pixel;
        System.out.println(Tb_Pf);
        //System.out.printf("trabecular pattern factor, Tb_Pf = %.5f /mm %n", Tb_Pf);

        //structure model index, SMI
        row = 42;
        column = 26;
        double SMI = reader.getDouble(L, row, column);
        System.out.println(SMI);
        //System.out.printf("structure model index, SMI = %.5f %n", SMI);

        //trabecular thickness, Tb_Th
        row = 43;
        column = 27;
        double Tb_Th = reader.getDouble(L, row, column) * pixel;
        System.out.println(Tb_Th);
        //System.out.printf("trabecular thickness, Tb_Th = %.5f mm %n", Tb_Th);

        //trabecular number, Tb_N
        row = 44;
        column = 23;
        double Tb_N = reader.getDouble(L, row, column) / pixel;
        System.out.println(Tb_N);
        //System.out.printf("trabecular number, Tb_N = %.5f /mm %n", Tb_N);

        //trabecular separation, Tb_Sp
        row = 45;
        column = 28;
        double Tb_Sp = reader.getDouble(L, row, column) * pixel;
        System.out.println(Tb_Sp);
        //System.out.printf("trabecular separation, Tb_Sp = %.5f mm %n", Tb_Sp);

        //fractal dimension, FD
        row = 46;
        column = 21;
        double FD = reader.getDouble(L, row, column);
        System.out.println(FD);
        //System.out.printf("fractal dimension, FD = %.5f %n", FD);

        //number of closed pores, Po_N_Cl
        row = 48;
        column = 32;
        double Po_N_Cl = reader.getDouble(L, row, column);
        System.out.println(Po_N_Cl);
        //System.out.printf("number of closed pores, Po_N_Cl = %.0f %n", Po_N_Cl);

        //volume of closed pores, Po_V_Cl
        row = 49;
        column = 32;
        double Po_V_Cl = reader.getDouble(L, row, column) * Math.pow(pixel, 3);
        System.out.println(Po_V_Cl);
        //System.out.printf("volume of closed pores, Po_V_Cl = %.5f mm^3 %n", Po_V_Cl);

        //surface of closed pores, Po_S_Cl
        row = 50;
        column = 33;
        double Po_S_Cl = reader.getDouble(L, row, column) * Math.pow(pixel, 2);
        System.out.println(Po_S_Cl);
        //System.out.printf("surface of closed pores, Po_S_Cl = %.5f mm %n", Po_S_Cl);

        //percent closed porosity, Po_Cl
        row = 51;
        column = 33;
        double Po_Cl = reader.getDouble(L, row, column);
        System.out.println(Po_Cl);
        //System.out.printf("percent closed porosity, Po_Cl = %.5f", Po_Cl);
        //System.out.println(" %");

        //volume of open pore space, Po_V_Op
        row = 52;
        column = 35;
        double Po_V_Op = reader.getDouble(L, row, column) * Math.pow(pixel, 3);
        System.out.println(Po_V_Op);
        //System.out.printf("volume of open pore space, Po_V_Op = %.5f mm^3 %n", Po_V_Op);

        //percent open porosity, Po_Op
        row = 53;
        column = 31;
        double Po_Op = reader.getDouble(L, row, column);
        System.out.println(Po_Op);
        //System.out.printf("percent open porosity, Po_Op = %.5f", Po_Op);
        //System.out.println(" %");

        //total volume of pore space, Po_V_Tot
        row = 54;
        column = 37;
        double Po_V_Tot = reader.getDouble(L, row, column) * Math.pow(pixel, 3);
        System.out.println(Po_V_Tot);
        //System.out.printf("total volume of pore space, Po_V_Tot = %.5f mm^3 %n", Po_V_Tot);

        //total porosity percent, Po_Tot
        row = 55;
        column = 33;
        double Po_Tot = reader.getDouble(L, row, column);
        System.out.println(Po_Tot);
        //System.out.printf("total porosity percent, Po_Tot = %.5f", Po_Tot);
        //System.out.println(" %");

        //Euler number, Eu_N
        row = 56;
        column = 18;
        double Eu_N = reader.getDouble(L, row, column);
        System.out.println(Eu_N);
        //System.out.printf("Euler number, Eu_N = %.0f %n", Eu_N);

        //connectivity, Conn
        row = 57;
        column = 18;
        double Conn = reader.getDouble(L, row, column);
        System.out.println(Conn);
        //System.out.printf("connectivity, Conn = %.0f %n", Conn);

        //connectivity density, Conn_Dn
        row = 58;
        column = 29;
        double Conn_Dn = reader.getDouble(L, row, column) / Math.pow(pixel, 3);
        System.out.println(Conn_Dn);
        //System.out.printf("connectivity density, Conn_Dn = %.5f /mm^3 %n", Conn_Dn);

        //degree of anisotropy 1, DA_1
        row = 59;
        column = 24;
        double DA_1 = reader.getDouble(L, row, column);
        System.out.println(DA_1);

        //degree of anisotropy 2, DA_2
        column = 33;
        double DA_2 = reader.getDouble(L, row, column);
        System.out.println(DA_2);
        //System.out.printf("degree of anisotropy, DA = %.5f (%.5f) %n", DA_1, DA_2);

    }
}