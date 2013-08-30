package elementary

abstract trait StringRenderer {
    val str: String
    def render(): String = "String :"+str
}
