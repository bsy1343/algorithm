# [Gold I] University Rankings - 13850

[문제 링크](https://www.acmicpc.net/problem/13850)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 11, 정답 비율: 73.333%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Doctor Bob is working on creating university rankings at International Company for Promoting Colleges. As we know, a university usually has many different departments, such as department of Computer Science (CS), department of Electronic Engineering (EE), and School of Foreign Languages (FLS). Some of them are quite good when comparing to the other universities, but others are not. So, most of the university rankings are composed of several ranking lists, each list for one department.</p>

<p>But here comes a problem that sometimes it is hard to determine which university is better, when comparing two universities with each other. Fortunately, Bob has advanced a new concept named absolutely better, with which the problem above can be partially solved.</p>

<p>Now, we take an example to explain the concept absolutely better:</p>

<p>Assume that there are three universities (X, Y, Z) and every university has three departments: CS, EE and FLS. And the ranking of each department is as follows, where X &gt; Y means X have a better CS department than Y:</p>

<ul>
	<li>The ranking of CS: X &gt; Y &gt; Z</li>
	<li>The ranking of EE: X &gt; Z &gt; Y</li>
	<li>The ranking of FLS: Z &gt; X &gt; Y</li>
</ul>

<p>Obviously, all departments of University X are better than those of University Y. Then, we say that X is absolutely better than Y. Using the absolutely better concept, it becomes possible to compare some pairs of the universities.</p>

<p>Now Bob has the complete rankings of different departments of many universities, and he wants to find k universities (U<sub>1</sub>, . . . , U<sub>k</sub>) such that Ui is absolutely better that U<sub>j</sub> (for any i &lt; j). Could you tell Bob the maximum value of k? Note that the universities are represented by numbers in the input.</p>

### 입력

<p>The first line of the input is a positive integer C, which is the number of test cases followed.</p>

<p>The first line of each test case is two positive integer N, M (0 &lt; N, M &le; 400), where N is the number of universities and M is the number of departments. And then M lines follow. The k-th&nbsp;(1 &le; k &le; M) line contains N numbers U<sub>k,i</sub> (1 &le; i &le; N, 1 &le; U<sub>k,i</sub> &le; N), indicating the ranking of the k-th department. If University U<sub>k,i</sub> precedes to University U<sub>k,j</sub> in line k, then the k-th department of U<sub>k,i</sub> is better than the k-th department of U<sub>k,j</sub> .</p>

### 출력

<p>The output should consist of C lines, one line for each test case. Each line only contains one integer &mdash; the maximum value of k as described above. No redundant spaces are needed.</p>