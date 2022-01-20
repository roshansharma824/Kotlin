package Classes
// sealed classes
// There can be multiple instances of sealed subclasses
// The subclasses can have their own properties
//sealed class NetworkState
//{
//    data class Error(val errorText: String): NetworkState()
//    object Loading: NetworkState()
//    data class Loaded(val content: String) : NetworkState()
//
//}
//fun main()
//{
//    val data: NetworkState = NetworkState.Loaded("Data Loaded")
//    processState(data)
//}
//fun processState(state: NetworkState)
//{
//    when(state)
//    {
//        is NetworkState.Error -> {println("Error occurred: ${state.errorText}")}
//        is NetworkState.Loading ->{/* Show progressbar */}
//        is NetworkState.Loaded -> {println("Content: ${state.content}")}
//        // No need for else as all cases are covered
//    }
//}