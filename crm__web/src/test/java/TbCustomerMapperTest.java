import com.itcast.domain.TbCustomer;
import com.itcast.mapper.TbCustomerMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 用户类的Dao层接口的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext.xml")
public class TbCustomerMapperTest {


    //    @Autowired  //注入接口
    @Resource
    private TbCustomerMapper tbCustomerMapper;


    //加载ApplicationContext
    private  ApplicationContext applicationContext;

    @Before
    public  void init(){

        //加载文件
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    }


    @Test  //测试保存到方法
    public void saveCustomer() {

        TbCustomer customer = new TbCustomer();
        customer.setAge(22);
        customer.setGender("男");
        customer.setId(30405110);
        customer.setName("炎帝ABC");

        //调用方法 ， 进行保存
        tbCustomerMapper.insert(customer);

    }

}
