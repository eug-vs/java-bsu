# Directories
SOURCE_DIR=src
BUILD_DIR=build

# Names
MAINCLASS=Main
JAR=build.jar

# Files
SOURCE=$(SOURCE_DIR)/$(MAINCLASS).java
BUILD=$(BUILD_DIR)/$(MAINCLASS).class

.PHONY: run clean

run: $(JAR)
	java -jar $(JAR)

$(JAR): $(BUILD)
	jar -cfe $(JAR) $(MAINCLASS) -C $(BUILD_DIR)/ .

$(BUILD): $(SOURCE)
	javac -d $(BUILD_DIR)/ -cp $(SOURCE_DIR)/ $(SOURCE)

clean:
	@rm -rf $(BUILD_DIR)
	@rm -f *.jar
	@echo Clean done.
