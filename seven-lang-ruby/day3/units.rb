class Numeric
  def inches
    self
  end

  def feet
    self * 12.inches
  end

  def yard
    self * 3.feet
  end

  def miles
    self * 5280.feet
  end

  def back
    self * -1
  end

  def forward
    self
  end
end

pp 10.miles.forward

