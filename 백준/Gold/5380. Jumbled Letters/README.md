# [Gold II] Jumbled Letters - 5380

[문제 링크](https://www.acmicpc.net/problem/5380)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 142, 정답: 39, 맞힌 사람: 25, 정답 비율: 31.646%

### 분류

구현, 자료 구조, 정렬, 집합과 맵, 비트마스킹, 해시를 사용한 집합과 맵

### 문제 설명

<p>In the game of Scrabble you are given a number of tiles with letters on them. The challenge is to create a word using some (or all) of these tiles. Write a program which, with the help of a dictionary, determines the longest word you can make with the given letters. Those of you who know this game may note that we ignore the board upon which the letters are placed, as well as the value of the letters.</p>

### 입력

<p>The input file consists of:</p>

<ul>
	<li>one line with an integer n (1 &le; n &le; 100 000): the number of words in the dictionary.</li>
	<li>n distinct lines, each with one word consisting of between 2 and 10 lower-case letters.</li>
	<li>one line with an integer c (1 &le; c &le; 10 000): the number of test cases.</li>
	<li>c lines, each with a string consisting of between 2 and 10 lower-case letters: the letters you have to make a word with.</li>
</ul>

<p>The words in the dictionary are given in alphabetical order.</p>

### 출력

<p>Per test case:</p>

<ul>
	<li>one line with the longest word from the dictionary you can make with the given letters. If there are multiple words, give the first one in alphabetical order. If there are no words you can make, output the word &rdquo;IMPOSSIBLE&rdquo;.</li>
</ul>