rand = rand(100)

puts "Hi! Try to guess number"

input = gets.to_i

until input == rand
  if input < rand
    puts "The number is smaller"
    input = gets.to_i
  elsif input > rand
    puts "The number is bigger"
    input = gets.to_i
  end
end

puts "Cool. You guess."
