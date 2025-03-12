def length_of_last_word(s)
  words = s.split
  lastWord = words.length() - 1
  return words[lastWord].length()
end

# Example test cases
puts length_of_last_word("Hello World")
puts length_of_last_word("   fly me   to   the moon  ")
puts length_of_last_word("luffy is still joyboy")
puts length_of_last_word("a ")


