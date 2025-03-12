def length_of_last_word(s)
  words = s.split
  lastWord = words.length() - 1
  return words[lastWord].length()
end

# Example test cases
puts length_of_last_word("Hello World") # Expected output: 5
puts length_of_last_word("   fly me   to   the moon  ") # Expected output: 4
puts length_of_last_word("luffy is still joyboy") # Expected output: 6
puts length_of_last_word("a ") # Expected output: 1
