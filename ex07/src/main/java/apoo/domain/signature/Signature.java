package apoo.domain.signature;

import apoo.domain.signature.level.SignatureLevel;

public class Signature {
    private Double value;
    private SignatureLevel level;

    public Signature(SignatureLevel level) {
        setValue(level);
        this.level = level;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(SignatureLevel level) {
        if (level == SignatureLevel.BASIC) this.value = 110.0;
        if (level == SignatureLevel.MEDIUM) this.value = 120.0;
        this.value = 150.0;
    }

    public SignatureLevel getLevel() {
        return level;
    }

    public void setLevel(SignatureLevel level) {
        this.level = level;
    }
}
