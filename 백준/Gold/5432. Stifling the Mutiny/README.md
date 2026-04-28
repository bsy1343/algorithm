# [Gold V] Stifling the Mutiny - 5432

[문제 링크](https://www.acmicpc.net/problem/5432)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 18, 맞힌 사람: 16, 정답 비율: 34.783%

### 분류

애드 혹, 많은 조건 분기

### 문제 설명

<p>A group of pirates is travelling in a convoy of ships, sailing in a row. However, the pirate captain is starting to lose control, and some disloyal pirates are ready to mute. As soon as on any ship S, the number of loyal pirates on S is outnumbered by the combined number of disloyal pirates on S, the previous ship (if S is not the first), and the next ship (if S is not the last) in the convoy, the disloyal pirates on these ships will row to S and take it over. To prevent an outbreak of mutiny, the captain decides to distribute the loyal and disloyal pirates over the ships in such a way that the disloyal pirates cannot capture any ship. Of course, each ship must have at least one loyal pirate to operate the ship.</p>

### 입력

<p>The first line of the input contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with two integers n and k, where 1 &le; n &le; 15 and n &le; k &le; 40. The first number is the number of ships; the second number is the total number of pirates (whether loyal or disloyal) in the convoy.</li>
</ul>

### 출력

<p>For every test case in the input, the output should contain one integer on a single line: the maximum number of disloyal pirates that the captain can distribute over the ships such that the disloyal pirates cannot capture any ship.</p>