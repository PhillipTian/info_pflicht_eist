package de.tum.in.ase.eist;

import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.List;

import static org.easymock.EasyMock.*;
import static org.easymock.EasyMock.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(EasyMockExtension.class)
class UserAccountTest {
    @TestSubject
    private UserAccount userAccount = new UserAccount("TEST");

    @Mock
    private ChargingMethod first_chargingMethod;

    @Mock
    private ChargingMethod second_chargingMethod;

    @Mock
    private ChargingMethod third_chargingMethod;

    @Mock
    private Claim claim;


    @Test
    void test() {
        expect(first_chargingMethod.charge(claim)).andReturn(false);
        expect(second_chargingMethod.charge(claim)).andReturn(true);

        List<ChargingMethod> chargingMethods =new ArrayList<>();
        chargingMethods.add(first_chargingMethod);
        chargingMethods.add(second_chargingMethod);
        chargingMethods.add(third_chargingMethod);
        userAccount.setChargingMethods(chargingMethods);

        replay(first_chargingMethod,second_chargingMethod,third_chargingMethod,claim);

        assertTrue(userAccount.chargeFor(claim));

        verify(third_chargingMethod);
    }
}
