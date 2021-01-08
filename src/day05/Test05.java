package day05;

import java.util.*;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        String str = "销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;" +
                "前端:green;前端:nick;程序:钱七;销售:alice";

        String[] split = str.split(";");
        List<Object> objects = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            objects.add(split[i].split(":")[0]);
        }
        System.out.println(objects);
        int saler = 0;
        int richer = 0;
        int coder = 0;
        int pic = 0;
        int qianduan  = 0;
       for (Object kind :objects) {
           if ("销售".equals(kind)) {
               saler += 1;
           } else if ("财务".equals(kind)) {
               richer += 1;
           } else if ("程序".equals(kind)) {
               coder += 1;
           } else if ("美工".equals(kind)) {
               pic += 1;
           } else if ("前端".equals(kind)) {
               qianduan += 1;
           }

          }
        HashMap<Object, Object> nu = new HashMap<>();
        nu.put("财务",saler);
        nu.put("程序", richer);
        nu.put("美工", pic);
        nu.put("前端", qianduan);
        System.out.println(nu);

        Set<Map.Entry<Object, Object>> entries = nu.entrySet();
        for (Map.Entry<Object, Object> key: entries) {
            System.out.println(key.getKey() + ":" + key.getValue());
        }

    }
	 
}
