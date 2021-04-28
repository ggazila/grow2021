file = File.open("file.txt")
file_data = file.read
puts file_data
file.close

puts "****"
file = File.open("file.txt")
file_data2 = file.readlines.map(&:chomp)
puts file_data2
file.close
puts "****"

file = File.read("file.txt").split(" ")
puts file
puts "****"

File.foreach("file.txt") { |line| puts line }

# w flag - rewrite, a - append
File.open("file.txt", "a") { |f| f.write "#{Time.now} - User logged in\n" }

File.write("file.txt", "new Data", mode: "a")

File.write("file.txt", [1, 2, 3].join("\n"), mode: "a")

File.rename("file.txt", "file.txt")

puts File.size?("file.txt")

puts Dir.glob("*")
