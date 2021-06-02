package com.kodilla.good.patterns.Food2Door;

import java.math.BigDecimal;
import java.util.Objects;

public class Supplier {
    private String nameOfSupplier;
    private String ownersName;
    private String ownersSurname;
    private BigDecimal nip;

    public Supplier(String nameOfSupplier, String ownersName, String ownersSurname, BigDecimal nip) {
        this.nameOfSupplier = nameOfSupplier;
        this.ownersName = ownersName;
        this.ownersSurname = ownersSurname;
        this.nip = nip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return nip == supplier.nip && Objects.equals(nameOfSupplier, supplier.nameOfSupplier) && Objects.equals(ownersName, supplier.ownersName) && Objects.equals(ownersSurname, supplier.ownersSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSupplier, ownersName, ownersSurname, nip);
    }
}
