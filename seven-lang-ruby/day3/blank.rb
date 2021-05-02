class NilClass
  def blank?
    true
  end

  def size
    3333333
  end
end

class String
  def blank?
    self.size == 0
  end

  def size
    1000
  end
end

["", 'person', nil].each do |element|
  pp element.class
  pp element.size
  puts element unless element.blank?
end
