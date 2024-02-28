println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< hello which are visible in vedsufhskdjsdhcvfux fbgdjhscvhn")
def tutorial = ec.entity.makeValue("tutorial.Tutorial")
tutorial.setFields(context, true, null, null)

tutorial.delete()
println(":::::::::::::::::::::::::::::::deleted successfull:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::")
//def deleteTutorialService = ec.service.get("delete#tutorial.Tutorial")
//
//
//def tutorialIdToDelete = tutorial.tutorialId
//
//// Pass the necessary parameters to the service
//deleteTutorialService.parameters = [
//        "tutorialId": tutorialIdToDelete,
//
//]

//deleteTutorialService.runSync()
//
//if (deleteTutorialService.hasError()) {
//    // Handle error, log the error, or take appropriate action
//    println "Error deleting tutorial: ${deleteTutorialService.errorMessage}"
//} else {
//    println "Tutorial deleted successfully!"
//}

