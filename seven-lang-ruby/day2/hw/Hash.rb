first = {}
second = { KH: "Kharkiv", KY: "Kyiv" }
second[:OD] = "Odessa"

puts second
puts "Must be Odessa, got #{second[:OD]}"
puts "Must be nil, got #{second[:OpenSSL]}"

puts second.fetch(:DN, "Nikopol")

third = { LV: "Lviv", VI: "Vinitsa" }

second.merge!(third)

puts second.sort_by(&:last)

puts second.keys
puts second.values
puts "**********"
puts second.to_a

arr = [1, 2, 3, 4, 5, 6]
puts "---"
puts Hash[*arr]
puts "\n\n"

second.each do |key, value|
  puts "key #{key}"
  puts "value #{value}"
end
