default: run

run:
	./gradlew run

clean:
	./gradlew clean

test:
	./gradlew clean test

tests: test

caesartest: 
	./gradlew clean test --tests CaesarTest

caesarkeytest:
	./gradlew clean test --tests CaesarKeyTest

vigeneretest:
	./gradlew clean test --tests VigenereTest