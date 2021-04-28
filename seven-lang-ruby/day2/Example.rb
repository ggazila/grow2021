def tell_the_truth
  true
end

puts tell_the_truth

animals = ['lions', 'cats', 'tigers']
animals2 = %w[lions cats tigers]
puts animals
puts "\n"
puts animals2

puts "\n"
puts animals[1]
puts animals[-1]
puts animals[10]
puts "\n"
puts animals[0..1]

puts (0..1).class

puts [1].class
puts [1].methods.include?('[]')

a = []

a[0] = 5
a[1] = %w[fff aaa]
puts a

map = { 1 => 'one', 2 => 'two' }
puts map[1]

stuff = { :array => [1, 2, 3], :string => 'Hi, everybody' }

puts stuff[:string]

def tell_the_truth2(options = {})
  if options[:profession] == :lawyer
    'lawyer'
  else
    true
  end
end

puts tell_the_truth2
puts tell_the_truth2(:profession => :lawyer)

3.times { puts "hi sergey" }

animals.each { |value| puts value }

class Fixnum
  def my_times
    i = self
    while i > 0
      i = i - 1
      yield
    end
  end
end

3.my_times { puts "my" }

def call_block(&block)
  block.call
end

def pass_block(&block)
  call_block(&block)
end

pass_block { puts "pass block" }

puts 4.class
puts 4.class.class.superclass
puts 4.class.class.superclass.superclass

puts 'begin' <=> 'end'
puts 'a' <=> 'b'
puts 'c' <=> 'b'
puts 's' <=> 's'

a = [5,1,4,6]
puts a
sort = a.sort
puts "----"
puts sort
puts a.any? {|i| i > 5}
puts a.all? {|i| i > 5}

array_integer_ = a.collect { |i| i * 10 }
puts array_integer_
