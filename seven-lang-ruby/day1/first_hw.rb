# Print the string “Hello, world.”
hello = "Hello world"
puts hello

# For the string “Hello, Ruby,” find the index of the word “Ruby.”
hello = 'Hello Ruby!'
puts hello =~ /Ruby/

# Print your name ten times.
10.times { puts "Sergey" }

# Print the string “This is sentence number 1,” where the number 1 changes from 1 to 10.
10.times { |index| puts "This is sentence number #{index + 1}" }
