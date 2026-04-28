# [Gold I] Word Ladder - 9123

[문제 링크](https://www.acmicpc.net/problem/9123)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 98, 정답: 13, 맞힌 사람: 13, 정답 비율: 22.034%

### 분류

너비 우선 탐색, 브루트포스 알고리즘, 플로이드–워셜, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>A word ladder is a sequence of words, in which two consecutive words differ by exactly one letter. An example of such a ladder (usually arranged vertically, hence the &ldquo;ladder&rdquo;) would be: beer, brew, brow, word, down. Note that to get from one word to the next, the letters may be rearranged, and exactly one letter is changed.</p>

<p>For this problem, you will be given a dictionary of distinct words, all of the same length. Your task is to write a program that finds a word ladder of minimal length, such that the first and last word of the ladder have no letters in common.</p>

### 입력

<p>On the first line an integer t (1 &le; t &le; 100): the number of test cases. Then for each test case:</p>

<ul>
	<li>A line with two space-separated integers n (2 &le; n &le; 100) and l (1 &le; l &le; 20): the number of words and their length.</li>
	<li>n lines with a word, each consisting of l lowercase letters (a - z).</li>
</ul>

### 출력

<p>For each testcase:</p>

<ul>
	<li>a single line with the words in a ladder of minimal length, separated by a single space.</li>
</ul>

<p>It is guaranteed that at least one such ladder can be constructed. If there is more than one, output the one that comes first lexicographically.</p>

### 힌트

<p>If s and t are strings of equal length and s<sub>i</sub> denotes the ith character of s, then s precedes t lexicographically if for some i: s<sub>i</sub> &lt; t<sub>i</sub> and s<sub>j</sub> = t<sub>j</sub> for all j &lt; i.</p>