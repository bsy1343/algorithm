# [Gold V] Treasure - 21956

[문제 링크](https://www.acmicpc.net/problem/21956)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 143, 정답: 103, 맞힌 사람: 77, 정답 비율: 76.238%

### 분류

자료 구조, 문자열, 스택

### 문제 설명

<p>Andrei is an adventurer who tries to find a treasure full of gold coins. When he arrives at the last clue, which will tell him where the treasure is, he sees that on the clue there are two numbers, N and K, and a string of N lowercase English letters. Andrei should take the current string and should eliminate the first sequence of exactly K identical letters which appear on consecutive positions. He will repeat this process until there will be no sequence which has K consecutive identical letters.</p>

<p>Andrei asks you to solve this problem as soon as possible so that he will be the first who discovers the treasure.</p>

<p>Find the final string after you successively eliminate the first sequence of K identical letters which appear on consecutive positions, until there is no such sequence left.</p>

### 입력

<p>The first line of the input contains two integers, N, representing the number of characters of the string, and K, representing the lenght of a sequence of identical characters.</p>

<p>The second line of the input contains the string of N lowercase English letters.</p>

### 출력

<p>The first line of the output contains a string of lowercase English letters, the string which will be obtained after all the possible eliminations are made.</p>

### 제한

<ul>
	<li>2 &le; K &le; N &le; 200,000</li>
	<li>The initial string contains only lowercase English letters</li>
	<li>It is guaranteed that the final string is not empty!</li>
</ul>