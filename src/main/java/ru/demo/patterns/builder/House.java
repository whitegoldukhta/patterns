package ru.demo.patterns.builder;

import lombok.Getter;

//Вообще заменяется аннотацией @Builder в lombok
@Getter
public class House {
    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", furnished=" + furnished +
                ", painted=" + painted +
                '}';
    }

    private String foundation;
    private String structure;
    private String roof;
    private boolean furnished;
    private boolean painted;

    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.furnished = builder.furnished;
        this.painted = builder.painted;
    }

    public static class HouseBuilder {
        private String foundation;
        private String structure;
        private String roof;
        private boolean furnished;
        private boolean painted;

        public HouseBuilder() {
            super();
        }

        public HouseBuilder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setFurnished(boolean furnished) {
            this.furnished = furnished;
            return this;
        }

        public HouseBuilder setPainted(boolean painted) {
            this.painted = painted;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}

