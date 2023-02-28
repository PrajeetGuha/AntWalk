# Assignment 12

## Objective
Add a new Model valentine ( with 3 attributes date, gift, location), in the existing app.
Add a form to accept values for these attributes-
date - single value
gift - multiple value
location - single value

## Cause of Delay
- facing issues with running mapper and jdbctemplate in personal computer
- time crunch due to demo project

## Implementation
- Created a form.jsp to show a basic form where users can input data
- The data collected from the form is posted into another url where it is mapped to a object and pushed as a row into the table using JPA
- the page output is the data that is entered at that moment

## Output

**The form**
![Screenshot (6)](https://user-images.githubusercontent.com/58776463/221751923-9c63c323-1383-4ec3-903a-14935dd89f15.png)

**The output**
![Screenshot (7)](https://user-images.githubusercontent.com/58776463/221752001-29939c8a-3e5d-4e23-8d2e-e51ecac32c28.png)

**Database state**
![Screenshot (8)](https://user-images.githubusercontent.com/58776463/221752032-5d94f627-9deb-461b-a477-1b0fe7bf21df.png)

Atlast. Sorry for the delay.
