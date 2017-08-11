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

    public static boolean furnitoriExist(Furnitori f)throws Exception {
        try {
            ArrayList <Furnitori> a = selectAll();
            for(int i=0;i<a.size();i++)
            {
                if(a.get(i).equals(f))
                    return true;
            }
            return false;
        } catch (Exception ex) {
            throw new Exception("BLFurnitori,furnitoriExist()"+ex);
        }
    }
}
