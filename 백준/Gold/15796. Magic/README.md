# [Gold III] Magic - 15796

[문제 링크](https://www.acmicpc.net/problem/15796)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 26, 맞힌 사람: 21, 정답 비율: 72.414%

### 분류

다이나믹 프로그래밍, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Now is the English lesson in grade 9 with Mr. Daskalov. Our main character &ndash; Deni &ndash; is very weak in English and she counts the number of flies in the room. This proves to be very boring activity, so she looks at the board where the teacher has written some text. She ignores the spaces between the words so the whole text seems to her as one big sequence of English letters with length N. Let us denote the number of different characters in this sequence with K. Deni starts to take up different substrings from this sequence and she writes down the number of times each character occurs. When for all of the K letters these numbers are equal, she calls the current substring magical.</p>

<p>Remarks: A substring is a part of a given string, which contains consecutively written characters.</p>

<p>During this English lesson she is able to check every substring of the sequence. Meanwhile she has counted how many of the substrings are magical and in the end she is very happy with the accomplished activity. Deni decides that she would like to do so in every English lesson. But with every subsequent English lesson the text on the board written by Mr. Daskalov is becoming longer and longer. So she asks for your help &ndash; you have to write a program which tells her the number of magical substrings in a given sequence of N English letters.</p>

<p>Write a program magic which counts the number of magical substrings in a given sequence of N English letters. Substrings which are the same but on different positions are counted as different.</p>

### 입력

<p>From the first line of the standard input, your program has to read one integer N &ndash; the number of characters in the sequence written by Mr. Daskalov. From the next line your program has to read a string of N English letters. The letters can be lower- and uppercase. Note that the lower- and uppercase forms of the same letter are considered to be different characters (A and a are different characters).</p>

### 출력

<p>The program must print to the standard output the number of magical substrings in the given string. Since this number may be quite large, you are required to print its remainder when divided by 1 000 000 007.</p>

### 제한

<ul>
	<li>2 &le; N &le; 100 000</li>
</ul>

### 힌트

<p>Explanation of the example 1:&nbsp;The magical substrings are abc, cba, abc and abccba. Note that for example the substring ab is not magical because the letter c is not in it.&nbsp;</p>

<p>Explanation of the example 2:&nbsp;Only the substring abcABC is magical (the letters a and A are different because a is a lowercase letter and A is an uppercase letter).</p>

<p>Explanation of the example 3: The number of magical substrings is 22 and one of them is SwSwwS.</p>