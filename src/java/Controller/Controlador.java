package Controller;

import Config.conexao;
import Entidade.Pessoa;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    int id;

    @RequestMapping("index.htm")
    public ModelAndView listar() {
        String sql = "select * from pessoa";
        List dados = this.jdbctemplate.queryForList(sql);
        mav.addObject("lista", dados);
        mav.setViewName("index");

        return mav;
    }
    
    @RequestMapping(value = "cadastrar.htm", method = RequestMethod.GET)
    public ModelAndView cadastrar() {
        mav.addObject(new Pessoa());
        mav.setViewName("cadastrar");

        return mav;
    }
    @RequestMapping(value ="cadastrar.htm", method = RequestMethod.POST)
    public ModelAndView cadastrar(Pessoa p){
        String sql ="insert into pessoa(nome,nacionalidade) values(?,?)";
        this.jdbctemplate.update(sql,p.getNome(),p.getNacionalidade());
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView editar(HttpServletRequest request){
    id = Integer.parseInt(request.getParameter("id"));
    String sql = "select * from pessoa where id="+id;
    List dados = this.jdbctemplate.queryForList(sql);
    mav.addObject("lista", dados);
   mav.setViewName("editar");
    return mav;
    }
    @RequestMapping(value = "editar.htm", method = RequestMethod.POST)
    public ModelAndView editar (Pessoa p ){
    String sql = "update pessoa set nome=?,nacionalidade=? where id ="+id;
    this.jdbctemplate.update(sql,p.getNome(),p.getNacionalidade());
    return new ModelAndView("redirect:/index.htm");
    
    
    }
    
    @RequestMapping("deletar.htm")
    public ModelAndView deletar(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from pessoa where id="+id;
        this.jdbctemplate.update(sql);
        
        return new ModelAndView("redirect:/index.htm");
        
    
    }

}
