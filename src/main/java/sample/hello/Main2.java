package sample.hello;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.Terminated;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class Main2 {

  public static void main(String[] args) {
    ActorSystem system = ActorSystem.create("Hello");
    ActorRef helloWorldActor = system.actorOf(Props.create(HelloWorld.class), "helloWorld");
    system.actorOf(Props.create(Terminator.class, helloWorldActor), "terminator");
  }
}
