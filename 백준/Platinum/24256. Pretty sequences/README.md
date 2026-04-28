# [Platinum III] Pretty sequences - 24256

[문제 링크](https://www.acmicpc.net/problem/24256)

### 성능 요약

시간 제한: 0.4 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 13, 맞힌 사람: 9, 정답 비율: 19.565%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Today is the sequence day! The math teacher wrote some sequences on the whiteboard, each having N different numbers, all from 1 to N, and told the students that these sequences had some special property. After some careful consideration, one of the students, Deni, guessed the correct property. All the sequences on the whiteboard had at least one pair of adjacent numbers in the form (x, x + 1). Deni was so happy that she called this type of sequence pretty. For example, for N = 4 the sequences: 3, 1, 2, 4 and 2, 3, 4, 1 are pretty but the sequences 2, 4, 1, 3 and 4, 3, 2, 1 aren&rsquo;t. After that, the math teacher gave Deni a harder question. She was asked to calculate the number of all possible pretty sequences with N different numbers, all from 1 to N. This was so hard that Deni couldn&rsquo;t find an answer during the whole class. You are a friend of Deni and want to help her.</p>

<p>Write the program, which for a given N has to tell Deni the number of pretty sequences. This number can be rather large, so you have to calculate it modulo M.</p>

### 입력

<p>From the first line of the standard input, read two integers N and M &ndash; the length of the sequences on the whiteboard and the module, used for the calculation.</p>

### 출력

<p>On one line of the standard output, the program has to write one integer &ndash; the number of pretty sequences with N different numbers, all from 1 to N, modulo M.</p>

### 제한

<ul>
	<li>1 &le; N &le; 10<sup>18</sup></li>
	<li>2 &le; M &le; 10<sup>7</sup></li>
</ul>