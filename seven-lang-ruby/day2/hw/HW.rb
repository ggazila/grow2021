arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]

num = ''
arr.each do |i|
  num += ' ' + i.to_s
  if i % 4 == 0
    pp num
    num = ''
  end
end

arr.each_slice(4) { |a| pp a }

File.readlines("file.txt").each_with_index { |line, index|
  p "#{index + 1} #{line}" if line[/User/]
}
