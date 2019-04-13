package edu.hunau.cxb.reverse.test;

import edu.hunau.cxb.wf.pojo.utils.SqlSessionUtils;
import edu.hunau.cxb.wf.pojo.mapper.ProductMapper;
import edu.hunau.cxb.wf.pojo.pojo.Product;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestProductMapper {

    @Test
    public void insertProduct(){
        SqlSession sqlSession=null;
        try {
            sqlSession= SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            System.out.println(productMapper);

            Product u=new Product();
            u.setId(0122);
            u.setPname("yanyuxuan");
            u.setMarketPrice(3120.00);
            u.setShopPrice(4228.88);
            u.setPimage("pig");
            u.setIsHot("0");
            u.setPdesc("14英寸笔记本电脑 （i5-4200H 4G 1TB GT940M 2G独显 蓝牙4.0 D刻 Win8.1 黑色");
            u.setPflag("0");
            u.setCid(2);

            productMapper.insert(u);

            //System.out.println(sqlSession.getConnection());
            sqlSession.commit();//成功提交
        }catch(Exception e){
            e.printStackTrace();
            if(sqlSession!=null)
                sqlSession.rollback();
        }finally{
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }


    @Test
    public void deleteById(){//删除操作
        SqlSession sqlSession=null;
        try {
            sqlSession= SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            System.out.println(productMapper.getClass());

            productMapper.deleteByPrimaryKey(10);
            //System.out.println(sqlSession.getConnection());
            sqlSession.commit();//成功提交
        }catch(Exception e){
            e.printStackTrace();
            if(sqlSession!=null)
                sqlSession.rollback();
        }finally{
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Test
    public void updateById(){//更新操作
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            System.out.println(productMapper.getClass());

            Product u = new Product();
            u.setId(9);
            u.setPname("Fffffff");
            productMapper.updateByPrimaryKey(u);

            //System.out.println(sqlSession.getConnection());
            sqlSession.commit();//成功提交
        }catch(Exception e){
            e.printStackTrace();
            if(sqlSession!=null)
                sqlSession.rollback();
        }finally{
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

    @Test
    public void selectById(){//查询操作
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            System.out.println(productMapper.getClass());

            Product  product = productMapper.selectByPrimaryKey(4);
            System.out.println(product);

            //System.out.println(sqlSession.getConnection());
            sqlSession.commit();//成功提交
        }catch(Exception e){
            e.printStackTrace();
            if(sqlSession!=null)
                sqlSession.rollback();
        }finally{
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }

}
