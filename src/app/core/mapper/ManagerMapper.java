package app.core.mapper;

import app.core.po.Manager;
import app.core.po.ManagerExample;
import app.core.po.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {
	
	/**
	 * ����Ա
	 * @return
	 */
	//��ȡ��Ӧ�Ĺ���Ա�б�
	public List<Manager> getAllManager();
	//���ݹ���ԭ�˺Ż�ȡ��Ӧ����Ա
	public Manager findManager(@Param("glyzh") String glyzh,@Param("id") Integer id);
	//�޸Ĺ���Ա����
	public void modifyManagerPassword(Manager manager);
	//���Ȩ�޹���Ա
	public void addManager(Manager manager);
	//�Ƴ���ʹ�õĹ���Ա
	public void removeManager(String glyzh);
	//����Ѿ��Ƴ��Ĺ���Ա
	public void setupManager(String glyzh);
	//�޸Ĺ���ԱȨ��
	public void updateManager(Manager manager);
	
    int countByExample(ManagerExample example);

    int deleteByExample(ManagerExample example);

    int deleteByPrimaryKey(String glyzh);

    int insert(Manager record);

    int insertSelective(Manager record);

    List<Manager> selectByExample(ManagerExample example);

    Manager selectByPrimaryKey(String glyzh);

    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
    
    Manager selectUser(User user);
    
    Manager selectManager(Manager manager);
}