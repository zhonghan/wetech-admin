package tech.wetech.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tech.wetech.admin.modules.system.mapper.OrganizationMapper;
import tech.wetech.admin.modules.system.po.Organization;
import tech.wetech.admin.modules.system.po.User;
import tk.mybatis.mapper.mapperhelper.EntityHelper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WetechAdminApplicationTests {
	@Autowired
	private OrganizationMapper organizationMapper;
	@Test
	public void contextLoads() {
		EntityHelper.getOrderByClause(User.class);
	}

	@Test
	public void test() {
		organizationMapper.insertSelective(new Organization().setParentId(1L).setParentIds("1")
		.setName("技术").setPriority(6L).setLeaf(false).setAvailable(true));
	}

}
