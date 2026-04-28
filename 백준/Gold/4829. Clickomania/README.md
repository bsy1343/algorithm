# [Gold II] Clickomania - 4829

[문제 링크](https://www.acmicpc.net/problem/4829)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 8, 맞힌 사람: 7, 정답 비율: 35.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Clickomania is a puzzle in which one starts with a rectangular grid of cells of different colours. In each step, a player selects (&quot;clicks&quot;) a cell. All connected cells of the same colour as the selected cell (including itself) are removed if the selected cell is connected to at least one other cell of the same colour. The resulting &quot;hole&quot; is filled in by adjacent cells based on some rule, and the object of the game is to remove all cells in the grid.</p>

<p>In this problem, we are interested in the one-dimensional version of the problem. The starting point of the puzzle is a string of colours (each represented by an uppercase letter). At any point, one may select (click) a letter provided that the same letter occurs before or after the one selected. The substring of the same letter containing the selected letter is removed, and the string is shortened to remove the hole created. To solve the puzzle, the player has to remove all letters and obtain the empty string. If the player obtains a non-empty string in which no letter can be selected, then the player loses.</p>

<p>For example, if one starts with the string &quot;ABBAABBAAB&quot;, selecting the first &quot;B&quot; gives &quot;AAABBAAB&quot;. Next, selecting the last &quot;A&quot; gives &quot;AAABBB&quot;. Selecting an &quot;A&quot; followed by a &quot;B&quot; gives the empty string. On the other hand, if one selects the third &quot;B&quot; first, the string &quot;ABBAAAAB&quot; is obtained. One may verify that regardless of the next selections, we obtain either the string &quot;A&quot; or the string &quot;B&quot; in which no letter can be selected. Thus, one must be careful in the sequence of selections chosen in order to solve a puzzle. Furthermore, there are some puzzles that cannot be solved regardless of the choice of selections. For example, &quot;ABBAAAAB&quot; is not a solvable puzzle.</p>

<p>Some facts are known about solvable puzzles:</p>

<ul>
	<li>The empty string is solvable.</li>
	<li>If x and y are solvable puzzles, so are xy, AxA, and AxAyA for any uppercase letter A.</li>
	<li>All other puzzles not covered by the rules above are unsolvable.</li>
</ul>

<p>Given a puzzle, your task is to determine whether it can be solved or not.</p>

### 입력

<p>Each case of input is specified by a single line. Each line contains a string of uppercase letters. Each string has at least one but no more than 150 characters. The input is terminated by the end of file.</p>

### 출력

<p>For each input case, print solvable on a single line if there is a sequence of selections that solves the puzzle. Otherwise, print unsolvable on a line.</p>