FROM openjdk:latest

WORKDIR /app

COPY LargestFourDigitNumber.java .

RUN javac LargestFourDigitNumber.java

CMD ["java", "LargestFourDigitNumber"]
