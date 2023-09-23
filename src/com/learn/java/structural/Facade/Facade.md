So, As the name suggests, it means the face of the building. The people walking past the road can only see this glass face of the
building. They do not know anything about it, the wiring, the pipes and other complexities. It hides all the complexities of the
building and displays a friendly face.

In Java, the interface JDBC can be called a facade because, we as users or clients create connection using the “java.sql.Connection”
interface, the implementation of which we are not concerned about. The implementation is left to the vendor of driver.

Now Let’s try and understand the facade pattern better using a simple example. Let’s consider a hotel. This hotel has a hotel keeper.
There are a lot of restaurants inside hotel e.g. Veg restaurants, Non-Veg restaurants and Veg/Non Both restaurants.

You, as client want access to different menus of different restaurants . You do not know what are the different menus they have.
You just have access to hotel keeper who knows his hotel well. Whichever menu you want, you tell the hotel keeper and
he takes it out of from the respective restaurants and hands it over to you. Here, the hotel keeper acts as the facade,
as he hides the complexities of the system hotel