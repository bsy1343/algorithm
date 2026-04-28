# [Gold IV] Towers of coins - 3358

[문제 링크](https://www.acmicpc.net/problem/3358)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 81, 정답: 69, 맞힌 사람: 60, 정답 비율: 89.552%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Asen and Boyan are playing the following game. They choose two different positive integers K and L, and start the game with a tower of N coins. Asen always plays first, Boyan &ndash; second, after that &ndash; Asen again, then Boyan, and so on. The boy in turn can take 1, K or L coins from the tower. The winner is the boy, who takes the last coin (or coins). After a long, long playing, Asen realizes that there are cases in which he could win, no matter how Boyan plays. And in all other cases Boyan being careful can win, no matter how Asen plays. So, before the start of the game Asen is eager to know what game case they have. Write a program coins which help Asen to predict the game result for given K, L and N.</p>

### 입력

<p>The input describes m games.</p>

<p>The first line of the standard input contains the integers K, L and m, 1 &lt; K &lt; L &lt; 10, 3 &lt; m &lt; 50. The second line contains m integers N<sub>1</sub>, N<sub>2</sub>, &hellip;, N<sub>m</sub>, 1 &le; N<sub>i</sub> &le; 1 000 000, i = 1, 2, &hellip;., m, representing the number of coins in each of the m towers.</p>

### 출력

<p>The standard output contains a string of length m composed of letters A and B. If Asen wins the ith game (no matter how the opponent plays), the ith letter of the string has to be A. When Boyan wins the ith game (no matter how Asen plays), the ith letter of the string has to be B.</p>