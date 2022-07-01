package us.icarenow.web.service;

import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class InsuredPatient implements Serializable {
    private byte insured;

    public byte insuredResponse(String response){
        if (response.contains("not_a")){
            insured = 0;
            System.out.println("Patient is not insured");
        }else if (response.contains("not_f")){
            System.out.println("Patient is not found");
            insured = 2;
        } else {
            insured =1;
            System.out.println("Patient is insured");
        }
        return insured;
    }

}
