# [Gold IV] Puzzle - 19836

[문제 링크](https://www.acmicpc.net/problem/19836)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 34, 맞힌 사람: 24, 정답 비율: 60.000%

### 분류

수학, 조합론

### 문제 설명

<p>Andrew is going to open his own factory for manufacturing puzzle pieces. He needs to order a special device that would cut pieces out of cardboard sheets. Also he needs to order a set of tips for it. Each tip allows to cut pieces of a particular form.</p>

<p>A puzzle piece is a square, each of its four sides can contain a rounded tab, a blank cut, or be smooth. The pieces can be of three different types:</p>

<ul>
	<li>&lt;&lt;<em>Corners</em>&gt;&gt; --- such pieces have exactly two adjacent smooth sides forming a corner;</li>
	<li>&lt;&lt;<em>Borders</em>&gt;&gt; --- such pieces have exactly one smooth side;</li>
	<li>&lt;&lt;<em>Normal</em>&gt;&gt; --- such pieces have no smooth sides.</li>
</ul>

<p>Rounded tabs and blank cuts can each be of $k$ types. So, there are $2k+1$ options for a puzzle piece side --- rounded tab of one of $k$ types, blank cut of one of $k$ types, a smooth side.</p>

<p>Andrew needs to find out how many different tips he need to order. Pieces, such that one of them can be rotated to become equal to another one, can obviously be cut out using the same tip.</p>

<p>Help Andrew to find the number of different tips he needs to order so that he would be able to cut any possible puzzle piece.</p>

### 입력

<p>The only line of input contains an integer $k$ --- the number of different rounded tabs and blank cuts types ($1 \le k \le 10^4$).</p>

### 출력

<p>Output the number of different tips Andrew need to order.</p>

### 힌트

<p>All $18$ tips for $k = 1$ are presented at the picture below:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/bc2c8481-0630-4f87-8c07-37af468ebf6d/-/preview/" style="width: 204px; height: 263px;" /></p>