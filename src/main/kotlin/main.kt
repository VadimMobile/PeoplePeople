fun main() {
    var likes = 1
    var people = "людям"
    while (likes !=123) {
        if (likes % 10 == 1 && likes % 100 != 11) {people = "человеку" }
        else {people = "людям"}
        println("Понравилось " + likes + " " + people)
        likes ++
    }
}