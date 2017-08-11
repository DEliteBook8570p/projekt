package BL;

import java.util.ArrayList;
import BO.Furnitori;
import DAL.DALFurnitori;
public class BLFurnitori {

    public static void insert(Furnitori furnitori) throws Exception {
        DALFurnitori.insert(furnitori);
    }

    public static void update(Furnitori furnitori) throws Exception {
        DALFurnitori.update(furnitori);
    }

    public static void delete(int idFurnitori) throws Exception {
        DALFurnitori.delete(idFurnitori);
    }

    public static ArrayList<Furnitori> selectAll() throws Exception {
        return DALFurnitori.selectAll();
    }

    public static Furnitori select(int idFurnitori) throws Exception {
        return DALFurnitori.select(idFurnitori);
    }

    public static boolean furnitoriExist(int id)throws Exception {
        try {
            Furnitori a = select(id);
            return a != null;
        } catch (Exception ex) {
            throw new Exception("BLFurnitori,furnitoriExist()"+ex);
        }
    }
}
