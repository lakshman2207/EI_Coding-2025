public class SpaceMission {
    private String missionName;
    private String objective;
    private int crewSize;
    private int durationInDays;
    private String launchVehicle;

    private SpaceMission(MissionBuilder builder) {
        this.missionName = builder.missionName;
        this.objective = builder.objective;
        this.crewSize = builder.crewSize;
        this.durationInDays = builder.durationInDays;
        this.launchVehicle = builder.launchVehicle;
    }

    @Override
    public String toString() {
        return "Mission Name: " + missionName +
               "\nObjective: " + objective +
               "\nCrew Size: " + crewSize +
               "\nDuration (Days): " + durationInDays +
               "\nLaunch Vehicle: " + launchVehicle + "\n";
    }

    public static class MissionBuilder {
        private String missionName;
        private String objective;
        private int crewSize;
        private int durationInDays;
        private String launchVehicle;

        public MissionBuilder setMissionName(String missionName) {
            this.missionName = missionName;
            return this;
        }

        public MissionBuilder setObjective(String objective) {
            this.objective = objective;
            return this;
        }

        public MissionBuilder setCrewSize(int crewSize) {
            this.crewSize = crewSize;
            return this;
        }

        public MissionBuilder setDurationInDays(int durationInDays) {
            this.durationInDays = durationInDays;
            return this;
        }

        public MissionBuilder setLaunchVehicle(String launchVehicle) {
            this.launchVehicle = launchVehicle;
            return this;
        }

        public SpaceMission build() {
            return new SpaceMission(this);
        }
    }
}

