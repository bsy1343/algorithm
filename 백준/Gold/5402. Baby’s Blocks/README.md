# [Gold V] Baby’s Blocks - 5402

[문제 링크](https://www.acmicpc.net/problem/5402)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 25, 맞힌 사람: 23, 정답 비율: 100.000%

### 분류

수학, 자료 구조, 집합과 맵, 조합론, 해시를 사용한 집합과 맵

### 문제 설명

<p>Mikey is playing with his favorite toy blocks, each depicting one letter of the alphabet. He is trying to make words using all his blocks, but as he does not know valid words from invalid ones, he goes by all possible orderings of the letters in alphabetical order and asks Albert, his genius brother, if the word he made is a valid one. Mikey can make one word (including asking a question and getting an answer) every sixty seconds, and he never makes the same word twice.</p>

<p>Albert is delighted about Mikey&rsquo;s activity, but would rather not teach Mikey certain words. Help Albert by predicting when Mikey will start making a certain forbidden word, so he can set the alarm clock indicating Mikey&rsquo;s bedtime to just before this moment.</p>

### 입력

<p>On the first line of the input is a positive integer, the number of test cases. Then for each test case:</p>

<ul>
	<li>A line containing the forbidden word to look for, consisting of at most 20 upper case characters. This word can be formed exactly using all of Mikey&rsquo;s blocks.</li>
</ul>

### 출력

<p>For each test case:</p>

<ul>
	<li>One line containing the number of minutes it will take until the forbidden word is reached, assuming Mikey has just started making the first possible word.</li>
</ul>