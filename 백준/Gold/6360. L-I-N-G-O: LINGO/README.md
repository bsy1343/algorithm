# [Gold IV] L-I-N-G-O: LINGO - 6360

[문제 링크](https://www.acmicpc.net/problem/6360)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 96, 정답: 11, 맞힌 사람: 10, 정답 비율: 26.316%

### 분류

많은 조건 분기, 구현, 문자열

### 문제 설명

<p><span style="line-height:1.6em">A new TV game show requires contestants to deduce a five letter word based on hints obtained by guessing other five letter words. The way the game is played is as follows: a secret five letter word is selected by the production staff of the game show. The object of the game is for the contestant to guess the secret word. The first letter of the secret word is revealed. The contestant will then guess a five letter word that may match the secret word. A computer then provides feedback to the contestant on the accuracy of the guess. Feedback consists of a report indicating if any letters in the guessed word are correct and in the same position in the secret word, if any letters in the guessed word are correct but not in the correct position in the secret word, and any letters in the guessed word that do not appear in the secret word.</span></p>

<p>As an example, the production staff chooses the secret word: &ldquo;HELLO&rdquo;. The contestant is told the first letter of the word is &ldquo;H&rdquo;. The contestant then guesses what the word could be, knowing it begins with the letter &ldquo;H&rdquo;. Let&rsquo;s say the contestant guesses the word: &ldquo;HOLES&rdquo;. The game show computer would report that the &ldquo;H&rdquo; and &ldquo;L&rdquo; are in the secret word and in the correct position. In addition, the &ldquo;O&rdquo; and &ldquo;E&rdquo; are in the secret word, but in the incorrect position, and the &ldquo;S&rdquo; is not in the secret word. This is conveyed to the contestant by a single line report:</p>

<p><strong>HoLe.</strong></p>

<p>The upper case letters (&ldquo;H&rdquo; and &ldquo;L&rdquo;) indicate correct letter and position. The lower case letters (&ldquo;o&rdquo; and &ldquo;e&rdquo;) indicate correct letter, wrong position. The period (&ldquo;.&rdquo;) indicates a wrong letter (not in the secret word).</p>

<p>You will write a program that evaluates the contestant guesses, and prints out the single line report for each guess. If the contestant guesses the secret word exactly, then the five capital letters of the secret word will be displayed in the report.</p>

<p>&nbsp;</p>

### 입력

<p>The input data file consists of datasets for one or more games. A blank line marks the beginning of the next dataset (game). The line after the blank line contains the secret word. The remaining lines in the dataset represent the contestant&rsquo;s guesses; there may be too few or too many guesses than are necessary to guess the secret word. The secret word will contain exactly five upper case letters. The contestant&rsquo;s guesses, however, have to be checked for validity: valid guesses consist of exactly five upper case letters. Input is terminated by a dataset with the secret word: &ldquo;LINGO&rdquo; (that is, game play is stopped at that point, the program terminates, and no further guessing occurs).</p>

### 출력

<p>Each game&rsquo;s output should be preceded by a single blank line (except for the terminating case). The first single line status report should be printed, which consists of the first letter of the secret word, followed by four periods. For each guess, print the single line status report for that guess. For an invalid guess, repeat the previous single line status report. If the guess exactly matches the secret word, that game ends and you should move on to the next one. The contestant may guess a maximum of six times; after the sixth guess, if the contestant did not guess the secret word, or you run out of guesses (the contestant gives up) print out the secret word in lower case letters and move on to the next game.</p>