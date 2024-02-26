package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {

    // message sent from client to create topic on the broker
    private String user;
    private String topic;


    public CreateTopicMsg(String user, String topic) {
        this.user = user;
        this.topic = topic;
    }

    public String getTopic() {
        return this.topic;
    }

    public void serTopic(String topic) {
        this.topic = topic;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CreateTopicMsg{" +
                "user='" + user + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
