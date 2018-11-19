all:
	jflex lexiquito.jflex
	cup cuphead.cup
	javac -cp .:java-cup-11b-runtime.jar parser.java
	java parser