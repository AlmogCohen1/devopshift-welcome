node {
//My first test pipeline
   stage('Initial stage')
       {
           echo 'Thanks John Bryce'
       }
   stage('Second stage')
       {
           def text = 'John'
           def text2 = 'Bryce'
           echo "${text} ${text2} has reached the second stage"
       }
   stage('Third stage')
       {
           println 'Thanks for your patience'
    