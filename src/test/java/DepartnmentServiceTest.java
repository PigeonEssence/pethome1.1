import cn.itsources.pethome.ApplicationStart;
import cn.itsources.pethome.org.service.IDepartmentService;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationStart.class)
public class DepartnmentServiceTest {
    @Autowired
    private IDepartmentService departmentService;

}
