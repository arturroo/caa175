import scala.io.Source

object OrderRevenue {
	def main(args: Array[String]) = {
		val orderItemsFile = "/mnt/c/Users/admin/Documents/stash/dgadiraju/data/retail_db/order_items/part-00000"
		val orderItems = Source.fromFile(orderItemsFile).getLines // Iterator
		val orderRevenue = orderItems
			.filter(_.split(",")(1).toInt == 2)
			.map(_.split(",")(4).toDouble)
			.reduce(_+_)
		println(orderRevenue)
	}
}
