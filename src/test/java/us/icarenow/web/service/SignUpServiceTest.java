package us.icarenow.web.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import us.icarenow.web.controller.form.SignUpPatientForm;
import us.icarenow.web.model.entity.User;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SignUpServiceTest {

    private static final Long DUMMY_ID = 1L;
    @Mock
    private UserService userServiceMock;

    @Mock
    private PatientService patientServiceMock;

    @Mock
    private User userMock;

    @InjectMocks
    private SignUpService victim;

    @Test
    public void test_signUp_happyCase() {
        // mocking - input preparation
        SignUpPatientForm form = new SignUpPatientForm();
        form.setCnp("1827");

        when(userServiceMock.createPatientUser(form)).thenReturn(userMock);
        when(userMock.getId()).thenReturn(DUMMY_ID);

        // Real call
        victim.signUp(form);

        // assetions - chekcs on output
        // for void - this is missing

        // verify
        InOrder inOrder = Mockito.inOrder(userServiceMock, patientServiceMock);
        inOrder.verify(userServiceMock).createPatientUser(form);
        inOrder.verify(patientServiceMock).createPatient(form, DUMMY_ID);
        inOrder.verify(patientServiceMock).sendEmail();
    }


}
