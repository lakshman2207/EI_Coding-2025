public class MissionDirector {

    public SpaceMission createMarsExplorationMission() {
        return new SpaceMission.MissionBuilder()
                .setMissionName("Mars Exploration Mission")
                .setObjective("Study Martian surface and search for signs of life")
                .setCrewSize(4)
                .setDurationInDays(180)
                .setLaunchVehicle("Falcon Heavy")
                .build();
    }

    public SpaceMission createSatelliteDeploymentMission() {
        return new SpaceMission.MissionBuilder()
                .setMissionName("Satellite Deployment Mission")
                .setObjective("Deploy communication satellite in low Earth orbit")
                .setCrewSize(2)
                .setDurationInDays(30)
                .setLaunchVehicle("Ariane 5")
                .build();
    }

    public SpaceMission createLunarResearchMission() {
        return new SpaceMission.MissionBuilder()
                .setMissionName("Lunar Research Mission")
                .setObjective("Conduct research on the Moon's surface and resources")
                .setCrewSize(3)
                .setDurationInDays(60)
                .setLaunchVehicle("SLS Artemis")
                .build();
    }
}

