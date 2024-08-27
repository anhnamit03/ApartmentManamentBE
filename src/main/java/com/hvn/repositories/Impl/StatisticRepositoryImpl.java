
import com.hvn.repositories.StatisticRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StatisticRepositoryImpl implements StatisticRepository {

    @Autowired
    private LocalSessionFactoryBean factory;
    
    @Override
    public List<Object[]> getStatisticByMonthAndYear(int month, int year) {
        Session session = factory.getObject().getCurrentSession();
        String queryString = "SELECT f.name AS fee_name, COALESCE(SUM(f.price), 0) AS total_paid "
                + "FROM fee f "
                + "LEFT JOIN payment p ON f.id = p.fee_id "
                + "WHERE MONTH(p.date_of_payment) = :input_month "
                + "  AND YEAR(p.date_of_payment) = :input_year "
                + "GROUP BY f.name";

      return   session.createNativeQuery(queryString).setParameter("input_month", month).setParameter("input_year", year).getResultList();

    }

    
}
