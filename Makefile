SOURCE=src
BUILD=out/production/$(shell basename $(CURDIR))
OUT=build
MAINCLASS=Main

pack: build
	jar -cfe $(OUT).jar $(MAINCLASS) -C $(BUILD)/ .

build:
	javac -d $(BUILD)/ -cp $(SOURCE)/ $(SOURCE)/$(MAINCLASS).java

run: pack
	java -jar $(OUT).jar

clean_build:
	rm -rf $(BUILD)

clean_pack:
	rm -f *.jar

clean: clean_build clean_pack
