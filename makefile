all:
	mvn package
	java -cp target/NegotiationCollab-V1.jar projetFelix.Dialog
