object question4 {

    def main( args: Array[String])=
        {
            def buyingprice(n:Int):Double = n*24.95
            def discount(n:Int):Double = n*24.95*0.4

            def discountedprice(n:Int):Double = buyingprice(n) - discount(n)

            def shippingcost(n:Int):Double = {
                if ( n > 50)
                    3*50 + (n-50)*0.75
                else
                    3*n
            }

            def wholesalecost(n:Int):Double = discountedprice(n) + shippingcost(n)

            println(wholesalecost(60))
        }
}