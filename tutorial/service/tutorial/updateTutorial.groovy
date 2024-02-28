println ("<<-----------------------------------------------------updation is going on ------------------------------>>")
def tutorial = ec.entity.makeValue("tutorial.Tutorial")
tutorial.setFields(context, true, null, null)
tutorial.update()