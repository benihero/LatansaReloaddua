package com.c.dompetabata.Respon;

import com.c.dompetabata.Model.MSubPLN;
import com.c.dompetabata.Model.ModelProvinsi;

import java.util.List;

public class ResponSubP {
    String code ;
    String error;
    List<MSubPLN> data;

    public String getCode() {
        return code;
    }

    public String getError() {
        return error;
    }

    public List<MSubPLN> getData() {
        return data;
    }
}
