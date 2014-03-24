package groovy

class  Displays{
    def getDisplay(String print){
        def lst =[]
        print.eachLine{
           println "$it"
           lst << it
        }
        toDisplay(*lst)
    }
    def toDisplay(line0, line1, line2){
        new Display(line0, line1, line2)
    }
}
