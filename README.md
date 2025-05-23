# Hangmen
Hangmen is a little game. It uses a prefabricated text file which contains words. The words in the file are displayed as underscores. The user has to guess a character, if the character is in that given word, all positions are displayed. If the user guesses a character which is not in that given word, it is a mistake. There are as many Levels as words in the given file.

## Installation
Download the source file and open it with your prefered IDE. Configurate the run configurations and add the path to the file with the words you want to use for guessing the words. 
Then you are ready to start playing Hangmen!

## Instruction
The accepted characters for the game are: **a-z A-Z**
This includes the input from the user and the words in the file. In the file with the words, only one word in each line is accepted from the program. Each line hast to start and end with a character. Whitespaces create an expection. Only the last line is empty, it consists of an empty line from the line break above.

The user can guess one character at a time. If a character is guessed which is not included in the regex, the user has to do another input. It is not counted as a mistake. 

## Contributing
I am open for new ideas. If you would like to send me some new stuff, please send it via email.

## Configuration
You should use the template file for the logging configuration:
`log4j2.xml.template` in directory `src/main/resources`.

If you are going to use this file, the following settings have to be made:
- log - file path (`fileName`)
- log - level (`debug`, `info`, ...)
- formatting of the log entries 
- Note: if you do not want the logs in the console, you have to set <Configuration status="off">

[log4j2.xml.template](./src/main/resources/log4j2.xml.template)


## Authors
Patrick Pramberger

### Further Links

1. Exercise1
    - [exercise1.md](./exercise1.md)
2. Exercise2
    - [exercise2.md](./exercise2.md)
    - [Github](https://github.com/prambergerpat)
    - [Campus02](https://www.campus02.at)
    - [exercise2_part2.md](./exercise2_part2.md)
3. Exercise3
   - [exercise3.md](./exercise3.md)
