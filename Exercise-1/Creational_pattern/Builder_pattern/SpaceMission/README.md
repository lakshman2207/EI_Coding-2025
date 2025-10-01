# Space Mission Builder - Builder Pattern Demonstration

This application demonstrates the **Builder Design Pattern** through an interactive **Space Mission Configuration System**. Design and configure space missions ranging from Mars colonization to satellite deployments using an intuitive, space-themed interface.

## Project Overview

The Space Mission Builder allows users to create complex space missions by combining various components like rockets, payloads, crew configurations, and destinations. The Builder pattern elegantly handles the complexity of mission planning while providing a fluent, easy-to-use interface.

## Project Structure

```
├── Main.java                  # Main application entry point
├── SpaceMission.java          # Product class with nested Builder
├── MissionDirector.java       # Director class with predefined missions
└── README.md                  # This documentation file
```

## Builder Pattern Implementation

### 1. Product Class (`SpaceMission.java`)
The complex space mission object with multiple components:

```java
public class SpaceMission {
    private String missionName;
    private String rocketType;
    private String payloadType;
    private int crewSize;
    private String destination;
    private int missionDuration;
    private String missionObjective;
    private String launchSite;
    private String landingSite;
    private boolean hasReturnTrip;
    private double budget;
    private String riskLevel;
}
```

### 2. Builder Class (`SpaceMissionBuilder` - nested in SpaceMission)
Implements the building process with fluent interface:

```java
public static class SpaceMissionBuilder {
    public SpaceMissionBuilder setMissionName(String name) { ... }
    public SpaceMissionBuilder setRocketType(String type) { ... }
    public SpaceMissionBuilder setDestination(String dest) { ... }
    public SpaceMissionBuilder calculateBudget() { ... }
    public SpaceMissionBuilder assessRisk() { ... }
    public SpaceMission build() { ... }
}
```

### 3. Director Class (`MissionDirector.java`)
Provides predefined mission configurations:

- **Mars Colonization Mission** - Permanent settlement on Mars
- **Lunar Research Mission** - Scientific research on the Moon
- **ISS Resupply Mission** - Supply delivery to International Space Station
- **Deep Space Exploration** - Robotic missions to outer planets
- **Satellite Deployment** - Launching satellite constellations

### 4. Main Application (`Main.java`)
Interactive application entry point with:

- Space-themed menu system and user interface
- User input handling for custom missions
- Educational resources and pattern demonstrations
- Mission control center with 6 main options

## Features

### Interactive Mission Control Center
1. ** Build Predefined Mission** - Choose from 5 exciting mission types
2. ** Build Custom Mission** - Create your own space mission specification
3. ** Demonstrate Builder Pattern** - See the pattern in action
4. ** Explore Space Resources** - Learn about rockets and destinations
5. ** Learn About Builder Pattern** - Educational content about the pattern
6. ** Exit Mission Control** - Close the application

### Predefined Mission Types

#### Mars Colonization Mission
- **Destination**: Mars Surface
- **Crew**: 12 astronauts
- **Duration**: 500 days
- **Rocket**: Starship Heavy
- **Objective**: Establish permanent human settlement
- **Budget**: ~$8,500 million
- **Risk**: HIGH

#### Lunar Research Mission
- **Destination**: Moon South Pole
- **Crew**: 4 astronauts
- **Duration**: 30 days
- **Rocket**: SLS Block 1
- **Objective**: Scientific research and Mars preparation
- **Budget**: ~$4,200 million
- **Risk**: MEDIUM

#### ISS Resupply Mission
- **Destination**: International Space Station
- **Crew**: 0 (unmanned)
- **Duration**: 30 days
- **Rocket**: Falcon 9
- **Objective**: Deliver supplies and equipment
- **Budget**: ~$200 million
- **Risk**: LOW

#### Deep Space Exploration
- **Destination**: Jupiter's Moon Europa
- **Crew**: 0 (robotic mission)
- **Duration**: 5 years
- **Rocket**: Falcon Heavy
- **Objective**: Search for extraterrestrial life
- **Budget**: ~$4,800 million
- **Risk**: HIGH

#### Satellite Deployment
- **Destination**: Low Earth Orbit
- **Crew**: 0 (unmanned)
- **Duration**: 1 day
- **Rocket**: Falcon 9
- **Objective**: Deploy satellite constellation
- **Budget**: ~$180 million
- **Risk**: LOW

### Custom Mission Builder
Users can specify:
- **Required Components**: Mission Name, Rocket Type, Destination, Objective
- **Optional Components**: Crew Size, Duration, Payload Type, Launch Site, Return Trip
- **Automatic Calculations**: Budget estimation and risk assessment

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher

### Compilation and Execution
```bash
# Compile all Java files
javac *.java

# Launch Space Mission Builder
java Main
```

### Sample Mission Creation

#### Using Predefined Mission:
1. Run the application
2. Select "1. Build Predefined Mission"
3. Choose mission type (1-5)
4. View detailed mission configuration

#### Creating Custom Mission:
1. Select "2. Build Custom Mission"
2. Enter mission specifications:
   ```
   Mission Name: Europa Explorer
   Rocket Type: Falcon Heavy
   Destination: Jupiter's Moon Europa
   Objective: Search for life in subsurface ocean
   Crew Size: 0
   Duration: 1825
   Payload: Scientific Orbiter
   Launch Site: Kennedy Space Center
   Return Trip: No
   ```

## Builder Pattern Benefits Demonstrated

### 1. **Fluent Interface**
```java
SpaceMission mission = new SpaceMission.SpaceMissionBuilder()
    .setMissionName("Mars Colony Alpha")
    .setRocketType("Starship Heavy")
    .setPayloadType("Habitat Module")
    .setCrewSize(12)
    .setDestination("Mars")
    .setMissionDuration(500)
    .setMissionObjective("Establish permanent settlement")
    .setLaunchSite("Starbase, Texas")
    .setReturnTrip(false)
    .calculateBudget()
    .assessRisk()
    .build();
```

### 2. **Step-by-Step Construction**
- Components can be configured in any order
- Optional components can be omitted
- Intelligent defaults based on mission type
- Automatic validation ensures mission feasibility

### 3. **Automatic Calculations**
- **Budget Calculation**: Based on rocket type, payload, crew size, destination, and duration
- **Risk Assessment**: Automatically determined by budget and destination complexity
- **Mission Duration**: Smart defaults based on destination

### 4. **Validation and Defaults**
- Required components are validated
- Optional components get intelligent defaults
- Mission feasibility is automatically assessed

## Space Mission Components

### Rocket Types
- **Falcon 9**: $67M - Best for ISS missions, satellite deployment
- **Falcon Heavy**: $150M - Deep space missions, large satellites
- **Starship**: $200M - Mars missions, lunar bases
- **SLS Block 1**: $2,000M - Artemis lunar missions

### Destinations
- **Low Earth Orbit**: 160-2,000 km altitude
- **Moon**: 384,400 km distance
- **Mars**: 54.6 million km (closest approach)
- **Jupiter System**: 588 million km

### Payload Types
- **Rover**: Surface exploration vehicles
- **Satellite**: Communication and observation satellites
- **Lander**: Surface landing modules
- **Orbiter**: Planetary observation spacecraft
- **Habitat**: Living quarters for crew
- **Cargo**: Supplies and equipment

## Code Examples

### Basic Mission Creation
```java
// Create a simple lunar mission
SpaceMission lunarMission = new SpaceMission.SpaceMissionBuilder()
    .setMissionName("Artemis III")
    .setRocketType("SLS Block 1")
    .setDestination("Moon")
    .setMissionObjective("Return humans to the Moon")
    .setCrewSize(4)
    .setMissionDuration(7)
    .calculateBudget()
    .assessRisk()
    .build();
```

### Using Director for Predefined Missions
```java
MissionDirector director = new MissionDirector();
SpaceMission marsMission = director.buildMarsColonizationMission();
SpaceMission issMission = director.buildISSResupplyMission();
```

### Custom Mission with Validation
```java
try {
    SpaceMission customMission = new SpaceMission.SpaceMissionBuilder()
        .setMissionName("Custom Deep Space Mission")
        .setRocketType("Falcon Heavy")
        .setDestination("Saturn")
        .setMissionObjective("Explore Saturn's rings")
        .build(); // Will use intelligent defaults
} catch (IllegalStateException e) {
    System.out.println("Mission validation failed: " + e.getMessage());
}
```

## Learning Objectives

After exploring this application, you will understand:

1. **Builder Pattern Structure**: How construction is separated from representation
2. **Fluent Interface Design**: Creating readable, chainable method calls
3. **Complex Object Creation**: Managing objects with many optional parameters
4. **Validation Logic**: Ensuring required components are present
5. **Director Pattern**: Using a director to provide predefined configurations
6. **Real-world Application**: How the pattern solves complex planning problems

## Extensibility Features

The application is designed for easy extension:

- **Add New Rocket Types**: Update price calculation in `calculateBudget()`
- **Add New Destinations**: Extend destination-specific logic
- **Add New Payload Types**: Include in budget calculation
- **Add Mission Types**: Create new methods in `MissionDirector`
- **Enhance Validation**: Add new validation rules in `build()` method

## Expected Output

When you run the application, you'll see:

```
    WELCOME TO SPACE MISSION BUILDER
    Builder Pattern Demonstration

Design and configure space missions with ease!
Choose from predefined missions or create your own
Experience the power of the Builder design pattern

              MISSION CONTROL CENTER
1.  Build Predefined Mission
2.  Build Custom Mission
3.  Demonstrate Builder Pattern
4.  Explore Space Resources
5.  Learn About Builder Pattern
6.  Exit Mission Control
Enter your command (1-6):
```

## Pattern Advantages

- **Readable Code**: Fluent interface makes mission creation intuitive
-  **Flexible Construction**: Components can be configured in any order
-  **Validation**: Ensures all required mission components are present
-  **Reusability**: Same builder can create different mission types
-  **Maintainability**: Easy to modify and extend mission configurations
-  **Intelligent Defaults**: Smart defaults based on mission requirements
-  **Automatic Calculations**: Budget and risk assessment built-in
-  **No Telescoping Constructors**: Avoids constructor parameter explosion

## Unique Features

This Space Mission Builder stands out because it:

1. **Combines Education with Entertainment**: Learning design patterns while exploring space
2. **Real-world Relevance**: Based on actual space mission planning concepts
3. **Interactive Experience**: Menu-driven interface with space-themed visuals
4. **Comprehensive Validation**: Ensures mission feasibility and completeness
5. **Automatic Intelligence**: Smart defaults and calculations based on mission parameters
6. **Extensive Resources**: Educational content about rockets, destinations, and space exploration

This implementation provides a complete, engaging example of the Builder pattern that's both educational and entertaining, making it perfect for learning design patterns while exploring the fascinating world of space exploration!
