# [Gold IV] Dice - 8523

[문제 링크](https://www.acmicpc.net/problem/8523)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 17, 맞힌 사람: 16, 정답 비율: 61.538%

### 분류

조합론, 수학

### 문제 설명

<p>Bytie likes playing with his m dice. His dice are not really typical: each of them has n faces with the respective faces containing 1, 2, ..., n pips. Bytie considers different arrangements of the dice in which the numbers of pips on the top of the dice form a sequence that is non-decreasing. Among two such arrangements, the one that has a smaller number of pips at the leftmost position where they differ is considered worse.</p>

<p>Bytie is now enumerating all such arrangements starting from the worst arrangement with 1 pip on the top faces of all the dice. He is willing to reach the k-th arrangement in this sequence. Help him check if he made it correctly.</p>

<p><span style="line-height:1.6em">Write a program that</span></p>

<ul>
	<li>reads the numbers m, n and k</li>
	<li>writes the k-th sequence in the desired order.</li>
</ul>

### 입력

<p>The only line of input contains three positive integers m, n and k (1 &le; m &le; 20, 4 &le; n &le; 50, 1 &le; k &le; 10<sup>18</sup>).</p>

### 출력

<p>Your program should output m positive integers: the numbers of pipes on the top faces of the dice in the requested k-th arrangement. You may assume that the input is constructed in such way that this requested arrangement exists.</p>

<p>&nbsp;</p>