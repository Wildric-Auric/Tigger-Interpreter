# source directory
SRC_DIR := src

# grammar generated sources
SRC_GEN_DIR := src/grammar

# jars directory
JARS := jar/antlr-4.13.1-complete.jar:jar/junit-4.12.jar

# output directory
OUT_DIR := out

# recursive wildcard
rwildcard=$(foreach d,$(wildcard $(1:=/*)),$(call rwildcard,$d,$2)\
	$(filter $(subst *,%,$2),$d))

# sources
SRCS := $(call rwildcard,src,*.java)

# classes
CLS := $(SRCS:.java=.class)

# compiler and compiler flags
JC := javac
JCFLAGS := -d $(OUT_DIR)/ -cp $(JARS):$(SRC_DIR)/:$(SRC_GEN_DIR)/

.PHONY: clean

# default target(s)
all: antlr srcs

srcs:
	$(JC) $(JCFLAGS) $(SRCS)

antlr: $(SRC_GEN_DIR)/*.java

$(SRC_GEN_DIR)/*.java: $(SRC_GEN_DIR)/Tiggrammar.g4
	antlr4 $<

# clean up any output files
clean:
	rm -rf $(OUT_DIR)/*
	rm -f $(SRC_GEN_DIR)/*.java
	rm -f $(SRC_GEN_DIR)/*.tokens
	rm -f $(SRC_GEN_DIR)/*.interp
