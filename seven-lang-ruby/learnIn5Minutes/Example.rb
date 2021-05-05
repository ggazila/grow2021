# comment

=begin
comments
not recommend to use
=end

#Everything is an object
pp 3.class
pp "".class
pp true.class
pp false.class
pp false.to_s

pp 2 ** 3

p 3 & 5
p 3 ^ 5
p 3 | 5

p 1 <=> 1
p 1 <=> 0
p 2 <=> 1
p 0 <=> 1

p "hello " + "world"
p "hello " << "world"
p "hello " * 3

snake_case = 5
pp snake_case

p :pending.class
status = :pending

p status

array = [1, 2, 3, 4, 5, "six"]
p array[0]
p array.first

p array.[] 0
p array.last

p array[0, 4]
p array.reverse

array.push("new")
array << "value"

p array

p array.include?(1)
p array.include?(10)

p 1 % 2
p 1 / 2
