# [Silver IV] Scrabble - 7683

[문제 링크](https://www.acmicpc.net/problem/7683)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 35, 맞힌 사람: 33, 정답 비율: 75.000%

### 분류

구현, 문자열

### 문제 설명

<p>The game of Scrabble is played with tiles. A tile either has a single letter written on it, or it is blank. In the latter case, the tile may be used to represent a letter of your choice. On your turn, you arrange the tiles to form a word. Each tile may be used at most once, but not all tiles need to be used. Given several Scrabble tiles and a dictionary, determine how many words in the dictionary can be formed using the given Scrabble tiles.</p>

### 입력

<p>The input test file will contain multiple test cases. In each test case, the first line contains a positive integer n &le; 1000 indicating the number of words in the dictionary. The following n lines each contain a single string with between 1 and 7 uppercase letters, representing a word in the dictionary. No word will appear in the dictionary twice. The next line contains a single string giving the tiles you have available. It will contain only capital letters, representing tiles with that letter on it, and underscores, representing blank tiles. The string will contain between 1 and 7 characters, possibly including duplicate tiles. The end-of-file is marked by a test case with n = 0 and should not be processed.</p>

### 출력

<p>For each test case, write a single line with the number of dictionary words that can be spelled with the given Scrabble tiles.</p>

### 힌트

<p>In the first test case, PIZZA, ZA and PITA can be spelled as PIZ_A, ZA and PI_A. There are not enough letters to spell PROGRAM or CONTEST. In the second test case, BANANAS and FIGS can be spelled as _A_A_A_and ____. On the other hand, CARROTS would require 6 blanks in addition to the A.</p>