# frozen_string_literal: true
color = 'red'
properties = ['object-oriented', 'duck-typed', 'productive', 'fun', "color is #{color}"]

properties.each { |property| puts "Ruby is #{property}" }

puts 'hello, world!'

puts 4.class

# puts 4.methods

puts(-4)
puts(-4.abs)

puts false.methods

puts 4.to_s + 'dd'

i = 0
a = ['100', 100.0]
until i >= 2
  puts a[i].to_i
  i += 1
end

word = 'hello world'

# gets substring from index 1 to index 4
puts word[1..4]
# gets substring from index 1 to index from the end
puts word[1..-4]

# first param index, second - length
puts word[1, 4]

reg_string = 'do you like cats?'
puts reg_string =~ /like/

if reg_string.match(/like/)
  puts 'match found'
end

puts reg_string =~ /[aeiou]/

puts 'reg_string112' =~ /[0-9]/

# equivalent to [0-9a-zA-Z_]
puts 'reg_string112' =~ /[\w]/

# equivalent to [0-9]
puts 'reg_string112' =~ /[\d]/

# matches white space (tabs, regular space, newline)
puts 'reg _ string112' =~ /[\s]/

def ip_address?(str)
  !!(str =~ /^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$/)
end

puts ip_address?("192.168.1.1") # returns true
puts ip_address?("0000.0000") # returns false

