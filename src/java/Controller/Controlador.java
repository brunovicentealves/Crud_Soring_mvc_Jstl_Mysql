
package Controller;

import Config.conexao;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 *
 * @author bruno.alves
 */

@Controller
public class Controlador {
    conexao con = new conexao();
    JdbcTemplate jdbctemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    
    @RequestMapping("index.htm")
    public ModelAndView listar(){
    String sql = "select * from pessoa";
    List dados = this.jdbctemplate.queryForList(sql);
    mav.addObject("lista", dados);
    mav.setViewName("index");
    
    return mav;
    }
    
    
}
