: << 'END'
Given a text file file.txt that contains a list of phone numbers
(one per line), write a one-liner bash script to print all valid phone numbers.
You may assume that a valid phone number must appear
in one of the following two formats: (xxx) xxx-xxxx
or xxx-xxx-xxxx. (x means a digit)
You may also assume each line in the text file must not
contain leading or trailing white spaces.
Example:
Assume that file.txt has the following content:
987-123-4567
123 456 7890
(123) 456-7890
Your script should output the following valid phone numbers:
987-123-4567
(123) 456-7890
END

#grep -e '\(^[0-9]\{3\}-[0-9]\{3\}-[0-9]\{4\}$\)' -e '\(^([0-9]\{3\})[ ]\{1\}[0-9]\{3\}-\([0-9]\{4\}\)$\)'  file.txt

grep -E "^([0-9]{3}-[0-9]{3}-[0-9]{4}|\([0-9]{3}\) [0-9]{3}-[0-9]{4})$" file.txt

: << 'END'
-E: use extended regex, so we don’t need \{3\} and can write {3}

^ and $: match whole line only

|: logical OR

\( and \): match literal parentheses around area code

🧪 Example file.txt:
END