package BL;

import java.util.ArrayList;
import BO.Stafi;
import DAL.DALStafi;
public class BLStafi {

    public static void insert(Stafi stafi) throws Exception {
        DALStafi.insert(stafi);
    }

    public static void update(Stafi stafi) throws Exception {
        DALStafi.update(stafi);
    }

    public static void delete(int idStafi) throws Exception {
        DALStafi.delete(idStafi);
    }

    public static ArrayList<Stafi> selectAll() throws Exception {
        return DALStafi.selectAll();
    }

    public static Stafi select(int idStafi) throws Exception {
        return DALStafi.select(idStafi);
    }

    public static boolean stafiExist(int id)throws Exception {
        try {
            Stafi a = select(id);
            return a != null;
        } catch (Exception ex) {
            throw new Exception("BLStafi,stafiExist()"+ex);
        }
    }
}
