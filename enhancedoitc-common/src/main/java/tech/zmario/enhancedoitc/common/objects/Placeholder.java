package tech.zmario.enhancedoitc.common.objects;

import lombok.Getter;

@Getter
public class Placeholder {

    private final String placeholder;
    private final String value;

    public Placeholder(String placeholder, String value) {
        this.placeholder = "%" + placeholder + "%";
        this.value = value;
    }
}
