object EmployeeeSalary{

    def normalPay(normalHours: Int):Double={
        normalHours * 250.0
    }

    def otPay(otHours: Int):Double={
        otHours*85.0
    }

    def grossSalary(normalHours: Int,otHours: Int):Double = {
        normalPay(normalHours) + otPay(otHours)
    }

    def calculateTax(grossSalary: Double,tax: Double):Double={
        grossSalary * tax
    }

    def takeHomeSalary(normalHours: Int,otHours: Int, tax: Double):Double={
        grossSalary(normalHours, otHours) - calculateTax(grossSalary(normalHours, otHours),tax)
    }

    def main(args:Array[String]):Unit={
        val normalHours=40
        val otHours=30
        val tax=0.12

        val salary=takeHomeSalary(normalHours, otHours,tax)

        println(s"Take Home Salary: Rs. $salary")
    }   
}