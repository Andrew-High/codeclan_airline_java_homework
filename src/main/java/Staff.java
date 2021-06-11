public abstract class Staff {
    private String name;
    private StaffRank rank;

    public Staff(String name, StaffRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StaffRank getRank() {
        return rank;
    }

    public void setRank(StaffRank rank) {
        this.rank = rank;
    }
}
