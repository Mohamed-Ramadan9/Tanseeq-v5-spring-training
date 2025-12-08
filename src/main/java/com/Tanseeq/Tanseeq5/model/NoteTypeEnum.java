package com.Tanseeq.Tanseeq5.model;

public enum NoteTypeEnum {
    WATER_PUMP(1, "ضغوط المياه"),
    WATER_QUALITY(2, "جودة المياه"),
    ELECTRIC_MAINTENANCE(3, "صيانة كهربائية"),
    CIVIL_MAINTENANCE(4, "الصيانة المدنية"),
    WASTEWATER_DISCHARGE(5, "تصريف مياه الصرف الصحي"),
    FIRE_FIGHTING_SYSTEM(6, "نظام مكافحة الحريق"),
    KITCHEN_WATER(7, "مياه المطابغ");

    private final Integer id;
    private final String displayName;

    NoteTypeEnum(Integer id, String displayName) {
        this.id = id;
        this.displayName = displayName;
    }

    public Integer getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    // Find by ID
    public static NoteTypeEnum fromId(Integer id) {
        for (NoteTypeEnum type : values()) {
            if (type.id.equals(id)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown NoteType ID: " + id);
    }

    // Find by name
    public static NoteTypeEnum fromName(String name) {
        try {
            return NoteTypeEnum.valueOf(name.toUpperCase().replace(" ", "_"));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unknown NoteType name: " + name);
        }
    }
}
