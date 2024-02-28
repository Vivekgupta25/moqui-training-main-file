// calculateSum.groovy
import org.moqui.context.ExecutionContext
import org.moqui.entity.EntityFacade

// Get the ExecutionContext
ExecutionContext ec = ExecutionContext.from()

// Get the EntityFacade service
EntityFacade entityFacade = ec.getFacade()
println("===================this is groovy file start ======================================")
// Specify the entity name and field to sum
def entityName = "tutorial.Tutorial"
def fieldName = "value"

// Fetch all records from the entity
def tutorials = entityFacade.find(entityName, [:])

// Calculate the sum of the 'value' field
def sum = tutorials.sum { it[fieldName] ?: 0 }

// Log the sum (you can adjust this part based on your needs)
ec.log.info("Sum of 'value' field in $entityName: $sum")
println("==================================================-------------------------------------${sum}------------------------------------------------========================================")
// Set the sum as a context variable to use in the screen
ec.context.put("sumValue", sum)