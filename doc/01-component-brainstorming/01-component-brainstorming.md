# Portfolio Part 1: Component Brainstorming

- **Name**: Kaiden Stewart
- **Dot Number**: stewart.2292
- **Due Date**: 2/16 11:59 PM

## Assignment Overview

The overall goal of the portfolio project is to have you design and implement
your own OSU component. There are no limits to what you choose to design and
implement, but your component must fit within the constraints of our software
sequence discipline. In other words, the component must extend from Standard and
must include both a kernel and a secondary interface.

Because this is a daunting project, we will be providing you with a series of
activities to aid in your design decisions. For example, the point of this
assignment is to help you brainstorm a few possible components and get some
feedback. For each of these components, you will need to specify the high-level
design in terms of the software sequence discipline. In other words, you will
describe a component, select a few kernel methods for your component, and select
a few secondary methods to layer on top of your kernel methods.

You are not required to specify contracts at this time. However, you are welcome
to be as detailed as you'd like. More detail means you will be able to get more
detailed feedback, which may help you decide which component to ultimately
implement.

## Assignment Checklist

Because these documents are long and full of text, you will be supplied with
a quick overview of what you need to do to get the assignment done as follows:

### Getting Started Tasks

- [ ] I have added my name to the top of this document
- [ ] I have added my dot number to the top of this document
- [ ] I have added the due date to the top of this document
- [ ] I have read the assignment overview in the "Assignment Overview" section
- [ ] I have read the assignment learning objectives in the "Assignment Learning Objectives" section
- [ ] I have read the assignment rubric in the "Assignment Rubric" section
- [ ] I have read this checklist

### Ongoing Tasks

- [ ] I have shared my interests in the "Pre-Assignment" section
- [ ] I have drafted my first component idea in the "Component Designs" section
- [ ] I have drafted my second component idea in the "Component Designs" section
- [ ] I have dradted my third component idea in the "Component Designs" section

### Submission Tasks

- [ ] I have shared assignment feedback in the "Assignment Feedback" section
- [ ] I have converted this document to a PDF
- [ ] I am prepared to submit the PDF on Carmen
- [ ] I am prepared to give my peers feedback on their ideas

## Assignment Learning Objectives

Without learning objectives, there really is no clear reason why a particular
assessment or activity exists. Therefore, to be completely transparent, here is
what we're hoping you will learn through this particular aspect of the portfolio
project. Specifically, students should be able to:

1. Integrate their areas of interest in their personal lives and/or careers with
   their knowledge of software design
2. Determine the achievablility of a software design given time constraints
3. Design high-level software components following the software sequence
   discipline

## Assignment Rubric: 10 Points

Again, to be completely transparent, most of the portfolio project, except the
final submission, is designed as a formative assessment. Formative assessments
are meant to provide ongoing feedback in the learning process. Therefore,
the rubric is designed to assess the learning objectives *directly* in a way
that is low stakes—meaning you shouldn't have to worry about the grade. Just
do good work.

1. (3 points) Each design must align with your personal values and long-term
   goals. Because the goal of this project is to help your build out a
   portfolio, you really ought to care about what you're designing. We'll give
   you a chance to share your personal values, interests, and long-term goals
   below.
2. (3 points) Each design must be achievable over the course of a single
   semester. Don't be afraid to design something very small. There is no shame
   in keeping it simple.
3. (4 points) Each design must fit within the software sequence discipline. In
   other words, your design should expect to inherit from Standard, and it
   should contain both kernel and secondary methods. Also, null and aliasing
   must be avoided, when possible. The methods themselves must also be in
   justifiable locations, such as kernel or secondary.

## Pre-Assignment

> Before you jump in, we want you to take a moment to share your interests
> below. Use this space to talk about your career goals as well as your personal
> hobbies. These will help you clarify your values before you start
> brainstorming. Plus it helps us get to know you better! Feel free to share
> images in this section.

In terms of career goals, I am still deciding whether I want to go down the software engineering route or the data analytics route. In terms of hobbies, I like watching sports, with my favorite being baseball and college football, but I also I like to watch NFL, college basketball, and have got into soccer a little bit more recently. I also like to travel and my favorite places I have been are Madrid, Barcelona, Rome, and Hawaii. I also like trying new foods and eating good food in general. I also like going to theme parks and amusement parks.

## Assignment

As previously stated, you are tasked with brainstorming 3 possible components.
To aid you in this process, we have provided some example components that may
help you in your brainstorming. These components are organized by CSE
specializations.

- Artificial Intelligence
  - Artificial Neuron
  - Activation Function
  - Graphs
  - Search
- Computer Graphics and Game Design
  - Pixel
  - Polygon
  - Geometry
  - Pathing
- Database Systems and Data Analytics
  - Object Relational Mapping (ORM)
  - Any Data Model
  - Scraping
  - Data Mining
- Information and Computation Assurance
  - Password Hashing
- Computer Networking
  - Packet
  - MAC Address
  - IP Address
- Computer Systems
  - Complex Logic Gate
  - Semiconductor
- Software Engineering
  - Unit Testing
  - Performance Testing
- Individualized Option (e.g., X + CS)
  - Mathematical Matrix
  - Music Playlist

There is no requirement that you make use of any of the subdisciplines above.
If you want to model something from the real-world, go for it! Very common early
object projects usually attempt to model real-world systems like banks, cars,
etc. Make of this whatever seems interesting to you, and keep in mind that
you're just brainstorming right now. You do not have to commit to anything.

### Example Component

With all that in mind, here's an example component you can use for reference.
Feel free to use this example as the groundwork for your own components below.

- Example Component: `Point3D`
  - **Description**: The purpose of this component is to model a 3-dimensional point.
    Our intent with this design was to keep a simple kernel that provides getters and
    setters for the three underyling coordinates. Then, we provide more complex
    mathematical operations in the secondary interface. It might be possible to
    create an immutable version of the class by removing the setters and instead
    having all secondary methods return new points. However, this design seems more
    inline with NaturalNumber.
  - **Kernel Methods**:
    - `double getX()`: gets the x-coordinate of `this`
    - `double getY()`: gets the y-coordinate of `this`
    - `double getZ()`: gets the z-coordinate of `this`
    - `double setX(double x)`: sets the x-coordinate of `this`
    - `double setY(double y)`: sets the y-coordinate of `this`
    - `double setZ(double z)`: sets the z-coordinate of `this`
  - **Secondary Methods**:
    - `void translate(double x, double y, double z)`: moves `this` by translating
      each coordinate by `x`, `y`, and `z`, respectively
    - `void translate(Point3D p)`: moves `this` by treating `p` as a vector
    - `void move(double x, double y, double z)`: moves `this` by overwriting each
      coordinate with `x`, `y`, and `z`, respectively
    - `void move(Point3D p)`: moves `this` to `p`
    - `double distance(Point3D p)`: gives the distance between `this` and `p`
    - `Point3D vectorTo(Point3D p)`: gives the vector from `this` to `p`
    - `boolean isOrigin()`: returns `true` if all three coordinates are zero

Keep in mind that the general idea when putting together these layered designs
is to put the minimal implementation in the kernel. In this case, the kernel is
only responsible for giving back the coordinates of the point. The secondary
methods use these getters and setters to perform more complex operations like
translating the point or computing the distance between two points.

Also, keep in mind that we don't know the underlying implementation. It would be
completely reasonable to create a `Point3D1L` class which layers the kernel on
top of the existing `Point` class in Java. It would also be reasonable to
implement `Point3D2` on top of three doubles and `Point3D3` on top of an array.
Do not worry about your implementations at this time.

On top of everything above, there is no expectation that you have a perfect
design. Part of the goal of this project is to have you actually use your
component once it's implemented to do something interesting. At which point, you
will likely refine your design to make your implementation easier to use.

### Component Designs

> Please use this section to share your designs.

- Component Design #1: Random Baseball Player Generator
  - **Description**: This component will generate MLB baseball players to be used in a guessing game.
  The Kernel Methods will be getters and setters that will be able to get and set the player names as well as certain stats and characterstics that will be used to generate the players as well as help the user narrow down who the player they are trying to guess is.
  The secondary methods will include methods that will make the game functional and simplier to create if they were not there.
  - **Kernel Methods**:
  - `String getPlayerName()` - gets the current player's name
  - `String getTeams()` - gets the current player's teams
  - `String getPosition()` - gets the current player's position
  - `String getAge()` - gets the current Player's age
  - `String getAllStarApearances()` - gets the current player's number of All Star apperances()
  - `int getRemaingingGuesses()` - sets the number of remaining guesses.
  - `String setPlayerName(String name)` - sets the current player's name
  - `String setTeams(String teams)` - sets the current player's teams
  - `String setPosition(String position)` - sets the current player's position
  - `String setAge(String age)` - sets the current Player's age
  - `String setAllStarApearances(String asApearances)` - sets the current player's number of All Star apperances()
  - `int setRemaingingGuesses(int guessesRemaining)` - sets the number of remaining guesses.
  - `int nextCharactaristicToGuess()` - prompts the user the select which characterist they would like to guess and returns an int for the index in the array containing the player's information.
  - **Secondary Methods**:
  - `String[][] generatePlayerInformation(input File)` - genenerates all the possible players for the game. (Possibly could be the constructor instead)
  - `String[] getRandomPlayerInformaiton(String[][] allPlayers)` - gets a random player from the two-dimensional array containing the arrays of each player's information.
  -  `boolean guessPlayer(String guess)` - method for the user to guess the player.
  -  `boolean guessTeams(String guess)` - method for the user to guess the player's team.
  -  `boolean guessPosition(String guess)` - method for the user to guess the player's position.
  -  `boolean guessAge(String guess)` - method for the user to guess the player's age.
  -  `boolean guessAllStarAppearances(String gues)` - method for the user to guess the player's number of all star appearances.


- Component Design #2: Baseball Power Rankings Generator
  - **Description**: This component will be able to be used to create baseball power rankings and more specifically, MLB power rankings.
  Kernel methods will include methods to get and set the necessary values to calculate the strength ratings of the teams as well as to get the team name.
  Secondary Methods will contain more advanced methods such as calculating the strength ratings for each team and ordering the teams by their strength ratings.
  - **Kernel Methods**:
  - `String getStat(int teamIndex, int statIndex)` - gets the stat given the team index and stat index.
  - `String setStat(int teamIndex, int statIndex, String stat)` - sets the desired stat given the teamIndex, statIndex, and stat.
  - `void switchTeamIndexes(int indexTeam1, int indexTeam2)` - switches team arrays for given indexes.

  - `int getLowestPointDifferential()` - gets the lowest point differential for all teams.
  - `int getHighestPointDifferential()` - gets the heightest point differential for all teams.
  - `int setLowestPointDifferential(int pointDifferential)` - sets the lowest point differential for all teams.
  - `int setHighestPointDifferential(int pointDifferential)` - sets the highest point differential for all teams.

  - `int baseballPowerRankingsGeneratorSize()`
  - `int baseballPowerRankingsTeamSize()`


  - **Secondary Methods**:
  - `String getTeamName(int index)` - this method gets the team name
  - `String getTeamWins(int index)` - this method get the number of wins the team has.
  - `String getTeamLosses(int index)` - this method get the number of losses the team has.
  - `String getDivisionWins(int index)` - this method gets the number of wins the all teams in the current team's division has.
  - `String getDivisionLosses(int index)` - this method gets the number of losses the all teams in the current team's division has.
  - `String getTeamWinsLast10(int index)` - this method get the number of wins the team has in the last 10 games.
  - `String getTeamLosesLast10(int index)` - this method get the number of wins the team has in the last 10 games.
  - `String getPointDifferential(int index)` - this method gets the point differential of the team.
  - `String getStrengthRating(int index)` - this method gets the strength rating of the team.
  - `String setStrengthRating(int index, double rating)` - this method sets the strength rating of the team.

  - `void findAndSetLowestAndHighestPointDifferential()` - this method finds and sets the lowest and highest point differentials.
  - `void calculateAndSetStrengthRatings()` - this method will take in the values, convert them to doubles, calculate the strength rating, and set the strength rating for each team.
  - `void orderTeamsByStrengthRating()` - this method will order the teams from least to greatest based on their strength rating.
  - `void printResultsToFile(String fileName)` - this method will print the results to a file.


- Component Design #3: Table creator
  - **Description**:
  This design will be able to make a table with different data types.
  The Kernel Methods would be getters and setters to access rows and columns as well as add rows and columns.
  The secondary methods will be able to preform computations as well as make smaller data tables given the columns that the user wants.
  - **Kernel Methods**:
  - `Sequence<T> addRow(Sequence<T> row)` - this method will add a row
  - `Sequence<T> removeRow(int rowIndex)` - this method will remove a row
  - `Sequence<T> addColumn(Sequence<T> column)` - this method will add a column
  - `Sequence<T> removeColumn(int columnIndex)` - this method will remove a column
  - `T getElement(int rowIndex, int columnIndex)` - this method will get an element
  - `T setElement(int rowIndex, int columnIndex, T element)` - this method will set an element.
  - **Secondary Methods**:
  - `int sumColumn(int columnIndex)` - this method will sum the column given by the user.
  - `int averageColumn(int columnIndex)` - this method will average the column given by the user.
  - `Table newTableGivenColumns(int args...)` - this method will create a new table given column numbers.
  - `Table newTableGivenRows(int args...)` - this method will create a new table given row numbers.


## Post-Assignment

The following sections detail everything that you should do once you've
completed the assignment.

### Submission

If you have completed the assignment using this template, we recommend that
you convert it to a PDF before submission. If you're not sure how, check out
this [Markdown to PDF guide][markdown-to-pdf-guide]. However, PDFs should be
created for you automatically every time you save, so just double check that
all your work is there before submitting.

### Peer Review

Following the completion of this assignment, you will be assigned three
students' component brainstorming assignments for review. Your job during the
peer review process is to help your peers flesh out their designs. Specifically,
you should be helping them determine which of their designs would be most
practical to complete this semester. When reviewing your peers' assignments,
please treat them with respect. Note also that we can see your comments, which
could help your case if you're looking to become a grader. Ultimately, we
recommend using the following feedback rubric to ensure that your feedback is
both helpful and respectful (you may want to render the markdown as HTML or a
PDF to read this rubric as a table).

| Criteria of Constructive Feedback | Missing                                                                                                                           | Developing                                                                                                                                                                                                                                | Meeting                                                                                                                                                               |
| --------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Specific                          | All feedback is general (not specific)                                                                                            | Some (but not all) feedback is specific and some examples may be provided.                                                                                                                                                                | All feedback is specific, with examples provided where possible                                                                                                       |
| Actionable                        | None of the feedback provides actionable items or suggestions for improvement                                                     | Some feedback provides suggestions for improvement, while some do not                                                                                                                                                                     | All (or nearly all) feedback is actionable; most criticisms are followed by suggestions for improvement                                                               |
| Prioritized                       | Feedback provides only major or minor concerns, but not both. Major and minar concerns are not labeled or feedback is unorganized | Feedback provides both major and minor concerns, but it is not clear which is which and/or the feedback is not as well organized as it could be                                                                                           | Feedback clearly labels major and minor concerns. Feedback is organized in a way that allows the reader to easily understand which points to prioritize in a revision |
| Balanced                          | Feedback describes either strengths or areas of improvement, but not both                                                         | Feedback describes both strengths and areas for improvement, but it is more heavily weighted towards one or the other, and/or descusses both but does not clearly identify which part of the feedback is a strength/area for improvement  | Feedback provides balanced discussion of the document's strengths and areas for improvement. It is clear which piece of feedback is which                             |
| Tactful                           | Overall tone and language are not appropriate (e.g., not considerate, could be interpreted as personal criticism or attack)       | Overall feedback tone and language are general positive, tactul, and non-threatening, but one or more feedback comments could be interpretted as not tactful and/or feedback leans toward personal criticism, not focused on the document | Feedback tone and language are positive, tactful, and non-threatening. Feedback addesses the document, not the writer                                                 |

### Assignment Feedback

> Now that you've had a chance to complete the assignment, is there anything you
> would like to say about the assignment? For example, are there any resources
> that could help you complete this assignment? Feel free to use the feedback
> rubric above when reviewing this assignment.

<!-- TODO: share your feedback here -->

[markdown-to-pdf-guide]: https://therenegadecoder.com/blog/how-to-convert-markdown-to-a-pdf-3-quick-solutions/
