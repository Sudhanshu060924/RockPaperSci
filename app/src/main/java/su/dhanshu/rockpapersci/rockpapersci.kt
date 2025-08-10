package su.dhanshu.rockpapersci

fun main(){
    var computerChoice = ""
    val userChoice = ""

    println("enter your choice Rock , Paper , Scissors")
    userChoice = readln()

    while (userChoice !="Rock" && userChoice !=  "Paper" && userChoice !="Scissors"){
        println("the choice is invalid , please re-enter")
        userChoice = readln()


    }



    var randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println("The Computer choose:" + " " + computerChoice)
    val winner = when {
        userChoice == computerChoice  -> "Tie"
        userChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        userChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        userChoice == "Paper" && computerChoice == "Rock" -> "Player"
        else -> "Computer"

    }
    if (winner == "Tie"){
        println("Its a tie")


    }else {
        println("The winner is :"+ " " + winner)
    }


}