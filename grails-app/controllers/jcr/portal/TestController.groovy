package jcr.portal

import com.pojo3.Image
import com.pojo3.Table
import org.apache.jackrabbit.ocm.manager.ObjectContentManager
import org.apache.jackrabbit.ocm.manager.impl.ObjectContentManagerImpl
import org.apache.jackrabbit.ocm.mapper.Mapper
import org.apache.jackrabbit.ocm.mapper.impl.annotation.AnnotationMapperImpl
import org.apache.jackrabbit.ocm.reflection.ReflectionUtils

import javax.jcr.*
import org.apache.jackrabbit.commons.JcrUtils

class TestController {
    static allowedMethods = [index: ['GET']]

    def index() {
        Repository repository = null;
//        try {


//            String host = "http://localhost:4502/crx/server"
              String host = "bur2-d1036236.eac.ad.ea.com:4502"
            repository = JcrUtils.getRepository(host);
//        } catch (Exception e) {
//            System.out.println(e.getMessage())
//        }

        //Workspace Login
        SimpleCredentials creds = new SimpleCredentials("admin", "admin".toCharArray());
        Session session = repository.login(creds, "crx.default");
        //List Children
        System.out.println("Workspace: " + session.getWorkspace().getName() + "\n");

        ReflectionUtils.setClassLoader(Thread.currentThread().getContextClassLoader());

        List<Class> classes = new ArrayList<Class>();
        classes.add(Image.class); // Call this method for each persistent class
        classes.add(Table.class)

        Mapper mapper = new AnnotationMapperImpl(classes);
        ObjectContentManager ocm =  new ObjectContentManagerImpl(session, mapper);


        Object o = ocm.getObject('/content/geometrixx/en/products/triangle/features/jcr:content/par/image')

        System.out.println("ta da")
//        listChildren( "", session.getRootNode().getNode('content/geometrixx/en/products/triangle/features') );
    }

    private static void listChildren(String indent, Node node ) throws RepositoryException {
        System.out.println(indent + node.getName() );
        NodeIterator ni = node.getNodes();
        while(ni.hasNext()) {
            listChildren(indent+"  ", ni.nextNode());
        }
    }
}
