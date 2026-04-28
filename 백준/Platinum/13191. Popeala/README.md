# [Platinum I] Popeala - 13191

[문제 링크](https://www.acmicpc.net/problem/13191)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 113, 정답: 37, 맞힌 사람: 28, 정답 비율: 31.111%

### 분류

다이나믹 프로그래밍, 누적 합, 비트마스킹

### 문제 설명

<blockquote>
<p>The Romanian word &quot;popeală&quot; has its origins in a Romanian historical novella, &quot;Alexandru Lăpușneanul&quot;, where the eponymous Prince of Moldavia uses a variation of the term to describe his upcoming revenge on his usurpers. The term was recently revived, somewhat surprisingly, in the Romanian programming contest scene. It&#39;s used to describe any situation in which the scientific committee makes life harder for the contestants in an unorthodox and (usually) involuntary way: very strict time limits, invalid test cases, wrong statements, stealing keyboards and other such mechanisms. This task is about such a &quot;popeală&quot;.</p>
</blockquote>

<p>Consider a programming contest with N contestants. The contest has only one task which has T test cases. The scientific committee wants to group these test cases into at most S subtasks.</p>

<p>How subtasks work: Each test case will belong to exactly one subtask. A subtask can contain any number of test cases, but it cannot be empty. If a contestant fails any test case of a certain subtask, his or her score for that subtask will be 0. Otherwise, the score for that subtask will be equal to the sum of score values of all of its test cases.</p>

<p>This is a common practice in programming contests, but the catch is that the scientific committee wants to do this after the contest is over. They know what test cases were solved correctly for each contestant and they want to group the tests into subtasks such as to minimize the total number of points scored in the contest.</p>

<p>Specifically, you are given an integer array Points[] of size T. Points[i] will contain the point value of the i-th test. You are also given a two-dimensional array Results[][] of size N * T. Results[i][j] will be equal to 1 if the i-th contestant has correctly solved the j-th test case. Otherwise, it will be equal to 0. The committee has already decided that all subtasks will contain consecutive test cases. In other words, if test cases X and Y will end up in the same subtask, then every test case Z, with X &le; Z &le; Y must also belong to this subtask.</p>

<p>You should help the committee. They want to know, for each value 1 &le; K &le; S, what is the minimum total number of points that can be earned in the contest if they choose to group the test cases into exactly K subtasks.</p>

### 입력

<p>The input will contain three space-separated positive integers on its first line: N, T, S. The second line will contain T space-separated positive integers, representing the elements of the Points[] array. The following N lines will each contain a binary string of length T, representing the elements of the Results[][] matrix.</p>

<ul>
	<li>1 &le; T &le; 20 000</li>
	<li>1 &le; N &le; 50</li>
	<li>1 &le; S &le; min(50, T)</li>
	<li>1 &le; Points[i] &le; 10 000, for all 1 &le; i &le; T. It is also guaranteed that (Points[1] + Points[2] + &hellip; + Points[T]) * N &le; 2 000 000 000 for all test cases.</li>
</ul>

### 출력

<p>The output&nbsp;should contain S lines. The i-th line should contain a single integer: the minimum total number of points that can be earned in the contest if the test cases are grouped into i subtasks.</p>

### 힌트

<p>There are N = 2 contestants, T = 3 test cases and S = 3, which means we must compute the minimal score for 1, 2 and 3 subtasks, respectively. The Points[] array is {4, 3, 5}.</p>

<p>In the case of a single subtask, the total number of points that can be achieved is equal to 0, because neither contestant has solved all cases correctly, and all test cases must be in the same subtask.</p>

<p>There are two ways to group the test cases in two subtasks. One of them produces a total number of 12 points and the other one a total of 8 points. Because we are looking to minimize this value, we choose the latter.</p>

<p>There is also a single way to group the test cases into three subtasks, which produces a total number of 16 points.</p>