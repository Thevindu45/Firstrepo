object question5 {

    def main(args: Array[String])=
        {
            def easy(d:Int):Int = d*8
            def tempo(h:Int):Int = h*7

            def runtime(d:Int,h:Int) = easy(d) + tempo(h)

            println("total runtime = " + runtime(4,3))
        }
}