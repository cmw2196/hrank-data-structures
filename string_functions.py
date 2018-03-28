def isUnique(string):
  """Determine if a string has all unique character, assuming ASCII chars."""
    if len(string) > 128:
        return False
    
    string_set = set()
    for letter in string:
        if letter in string_set:
            return False
        string_set.add(letter)
        
   return True


def isPermutation(string1, string2):
  """Check if string1 or string2 are permutations of each other."""
    return sorted(string1) == sorted(string2)


def urlify(string):
  """Replace all spaces in a string with %20."""
    return string.replace(' ', '%20')


def palindromePermutation(string):
  """Check to see if string is a permutation of a palindrome."""
    letter_map = {}
    for x in string:
        letter_map[x] = letter_map.get(x, 0) + 1
    
    single_letter = False
    for num_letter in letter_map.itervalues():
        if num_letter % 2 != 0:
        if single_letter:
            return False
        single_letter = True
   
    return False
      
    
def _compare_equal_strings(string1, string2):
    """Compare two equal-length strings to see if they are one letter apart from each other."""
    one_away = False
    for letter in string1:
        if letter not in string2:
            if one_away:
                return False
            one_away = True
        else:
            continue
    return True
            
    
def oneAway(string1, string2):
    """Check to see if string1 or string2 are one character apart."""
    if len(string1) == len(string2):
        return _compare_equal_strings(string1, string2)
    
    smaller = string1 if len(string1) < len(string2) else string2
    larger = string1 if len(string1) > len(string2) else string2
    
    # ensure all letters in smaller are in larger
    for letter in smaller:
        if letter not in larger:
            return False
    # if this is the case, a simple insertion ensures smaller == larger
    return True

