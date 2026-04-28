# [Platinum II] Game - 12826

[문제 링크](https://www.acmicpc.net/problem/12826)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 10, 맞힌 사람: 8, 정답 비율: 25.806%

### 분류

유클리드 호제법, 게임 이론, 수학, 정수론

### 문제 설명

<p>Mirek really likes playing with numbers. Together with his friend, Kamil, he plays a following game. At the beginning, there are two non-negative integers &ndash; A and B. Let&rsquo;s say A &le; B. The players can perform one of two moves in turns:</p>

<ul>
	<li>Replace B with B &minus; A<sup>K</sup>. Number K can be any integer chosen by the player, considering the limitations that K &gt; 0 and B &minus; A<sup>K</sup> &ge; 0.</li>
	<li>Replace B with B mod A.</li>
</ul>

<p>If B &le; A, similar moves are possible. The player who changes any number into 0, wins. Mirek always starts. He likes this game, but he likes winning much more. Help him determine who will win, if both of them play optimally.</p>

<p>You are given the description of games played by Mirek and Kamil. For every game determine who will win, Mirek or Kamil.</p>

### 입력

<p>First line contains an integer T (1 &le; T &le; 10<sup>4</sup>), the number of games played by boys. In the next T lines, there are descriptions of those games. Every such line contains two integers A, B (1 &le; A, B &le; 10<sup>18</sup>)</p>

### 출력

<p>Output T lines. The i-th line should contain the name of the player who wins the i-th game, Mirek or Kamil.</p>