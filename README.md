# AdvancedProgramming1
The first assignment for the Advanced Programming course.
The whole folder was submitted to the repo, so it could be just downloaded and run. Three tasks (in the src/java...):
<h3> Task 1 </h3>
<p> <b>Never use switch.</b> In a separate package there is a replacement with polymorphism used instead and another example in the CharactersFactory where switch is replaced by the dictionary of methods. </p>
<p>
  <h3> Task 2 </h3>
<p> <b> Guess Game </b> To run - uncomment part of code in the main method. Each time you've guessed the number - it will output you your best score ever! </p>
 <h3> Task 3 </h3>
<b> Heroes game </b> 
<p> The default code in the main method - simulating the fight between two Characters
  Some tricky moments
  <ul>
    <li>What should goCry() method do for Hobbit? Currently it just printing some message. If two Hobbits should fight Game manager will stop the fight because it will never end. </li>
    <li>If two Elfs are suppose to fight, what should be done(they are equal in power)? Currently, GameManager will stop the game as well. </li>
    <li> How should be determined the power of king & knight in fight. Should they have dynamic or static power? Currently they have some static power in the range determined in the constructor. But in the fight they are kicking with power from MIN to that static value. </li>
    </ul>
    </p>
