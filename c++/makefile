#		David Cristian Motta Propato

# Executable name
EXECFIB = fibonacci
EXECSTRING = stringA

# Compiler and Flags
GPP = g++
CFLAGS = -Wall -g -O3

# Main files name
FIBONACCI = fibonacci.cpp
STRING = stringA.cpp

############ TARGETS

# Building
all: $(EXECFIB) $(EXECSTRING)

# Makes the exec file
$(EXECFIB): 
	$(GPP) $(CFLAGS) -o $@ $(FIBONACCI)

# Makes the exec file
$(EXECSTRING): 
	$(GPP) $(CFLAGS) -o $@ $(STRING)

# Cleaning
clean:
	rm -rf $(EXECFIB) $(EXECSTRING)

# Running Fibonacci
runFib: $(EXECFIB)
	./$(EXECFIB)

# Running String
runStr: $(EXECSTRING)
	./$(EXECSTRING)

# Explicit declaration of command rules
.PHONY: all clean runFib runStr