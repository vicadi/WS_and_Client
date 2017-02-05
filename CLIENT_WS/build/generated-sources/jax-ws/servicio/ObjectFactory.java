
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListPersons_QNAME = new QName("http://Servicio/", "ListPersons");
    private final static QName _ListPersonsResponse_QNAME = new QName("http://Servicio/", "ListPersonsResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://Servicio/", "deletePerson");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://Servicio/", "deletePersonResponse");
    private final static QName _InsertPerson_QNAME = new QName("http://Servicio/", "insertPerson");
    private final static QName _InsertPersonResponse_QNAME = new QName("http://Servicio/", "insertPersonResponse");
    private final static QName _ReadPerson_QNAME = new QName("http://Servicio/", "readPerson");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://Servicio/", "readPersonResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://Servicio/", "updatePerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://Servicio/", "updatePersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListPersons }
     * 
     */
    public ListPersons createListPersons() {
        return new ListPersons();
    }

    /**
     * Create an instance of {@link ListPersonsResponse }
     * 
     */
    public ListPersonsResponse createListPersonsResponse() {
        return new ListPersonsResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link InsertPerson }
     * 
     */
    public InsertPerson createInsertPerson() {
        return new InsertPerson();
    }

    /**
     * Create an instance of {@link InsertPersonResponse }
     * 
     */
    public InsertPersonResponse createInsertPersonResponse() {
        return new InsertPersonResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPersons }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ListPersons")
    public JAXBElement<ListPersons> createListPersons(ListPersons value) {
        return new JAXBElement<ListPersons>(_ListPersons_QNAME, ListPersons.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPersonsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "ListPersonsResponse")
    public JAXBElement<ListPersonsResponse> createListPersonsResponse(ListPersonsResponse value) {
        return new JAXBElement<ListPersonsResponse>(_ListPersonsResponse_QNAME, ListPersonsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "insertPerson")
    public JAXBElement<InsertPerson> createInsertPerson(InsertPerson value) {
        return new JAXBElement<InsertPerson>(_InsertPerson_QNAME, InsertPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "insertPersonResponse")
    public JAXBElement<InsertPersonResponse> createInsertPersonResponse(InsertPersonResponse value) {
        return new JAXBElement<InsertPersonResponse>(_InsertPersonResponse_QNAME, InsertPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

}
