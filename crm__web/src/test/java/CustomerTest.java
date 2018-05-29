import com.itcast.domain.Customer;
import com.itcast.mapper.CustomerMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * 用户类的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "applicationContext.xml")
public class CustomerTest {

        //注入Dao接口
    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public  void saveTest(){

        //创建用户类
        Customer customer = new Customer();
        customer.setId("10121314");
        customer.setCity("蚌埠");
        customer.setGender("男");
        customer.setHeight(185);
        customer.setNickname("遮天战纪");
        customer.setName("13955241305");
        customer.setBirthday(new Date());
        customer.setPassword("1234");
        customer.setWeight(Double.longBitsToDouble(90));
        //调用方法
        customerMapper.insertSelective(customer);

        }

}
