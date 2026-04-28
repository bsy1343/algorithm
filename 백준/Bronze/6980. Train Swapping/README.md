# [Bronze I] Train Swapping - 6980

[문제 링크](https://www.acmicpc.net/problem/6980)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 151, 정답: 116, 맞힌 사람: 106, 정답 비율: 75.714%

### 분류

구현, 정렬

### 문제 설명

<p>At an old railway station, you may still encounter one of the last remaining &quot;train swappers&quot;. A train swapper is an employee of the railroad, whose sole job it is to rearrange the carriages of trains.</p>

<p>Once the carriages are arranged in the optimal order, all the train driver has to do is drop the carriages off, one by one, at the stations for which the load is meant.</p>

<p>The title &quot;train swapper&quot; stems from the first person who performed this task, at a station close to a railway bridge. Instead of opening up vertically, the bridge rotated around a piller in the center of the river. After rotating the bridge 90 degrees, boats could pass left or right. The first train swapper had discovered that the bridge could be operated with at most two carriages on it. By rotating the bridge 180 degrees, the carriages switched place, allowing him to rearrange the carriages (as a side effect, the carriages then faced the opposite directions, but train carriages can move either way, so who cares).</p>

<p>Now that almost all train swappers have died out, the railway company would like to automate their operation. Part of the program to be developed is a routine which decides, for a given train, the least number of swaps of two adjacent carriages necessary to order the train. Your assignment is to create a routine that computes the minimal number of swaps.</p>

<p>Questions</p>

<ol>
	<li>For a given train T, let m[T] denote the minimal number of swaps to order train T. What is the largest value of m[T] over all trains T with L &gt; 0 carriages?</li>
	<li>Write a program that satisfies the specification below.</li>
</ol>

### 입력

<p>The input contains on the first line the number of test cases (<var>N</var>). Each test case consists of two input lines. The first line of a test case contains an integer&nbsp;<var>L</var>, determining the length of the train (0 &le;&nbsp;<var>L</var>&nbsp;&le; 50). The second line of a test case contains a permutation of the numbers 1 through&nbsp;<var>L</var>, indicating the current order of the carriages. The carriages should be ordered such that carriage 1 comes first, then 2, etc., with carriage L coming last.</p>

### 출력

<p>For each test case output the sentence: &quot;<code>Optimal train swapping takes&nbsp;<var>S</var>&nbsp;swaps.</code>&quot; where&nbsp;<var>S</var>&nbsp;is an integer representing the minimal number of swaps to order the train.</p>