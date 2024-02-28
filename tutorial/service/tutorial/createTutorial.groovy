import java.util.logging.Logger
import org.slf4j.Logger
import org.slf4j.LoggerFactory

def tutorial = ec.entity.makeValue("tutorial.Tutorial")
tutorial.setFields(context, true, null, null)

// Assuming tutorialId is set manually or retrieved from context
def x = tutorial.tutorialId
println("===============================if logger is executing =============context here====${context}======")
println("===============================if logger is executing =============context here====${x}======")
println("===============================if logger is executing =============tutorial.tutorialId====${tutorial.tutorialId}======")



// If tutorialId is null, set a sequenced ID
if (!x) {
    tutorial.setSequencedIdPrimary()
} else {
    // tutorialId is not null, use its value
    // Optionally, you can perform additional checks or operations here
}

// Set other fields if needed

// Now, you can create the tutorial
tutorial.create()
