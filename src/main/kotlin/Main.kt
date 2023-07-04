fun main(){
var price1 = Product("Bread",50.00,10)
var price2 = Product("Orange",60.00,10)
var price3 = Product("Spread",120.00,5)
var price4 = Product("Book",210.00,1)
 var totalPrice = price1.totalValue() + price2.totalValue() +price3.totalValue()+price4.totalValue()
    println(totalPrice)
}

class Product(var name:String,var price:Double, var quantity:Int){
    fun totalValue():Double{
        return price * quantity
    }
}