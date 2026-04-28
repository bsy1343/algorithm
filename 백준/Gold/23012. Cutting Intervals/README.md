# [Gold II] Cutting Intervals - 23012

[문제 링크](https://www.acmicpc.net/problem/23012)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 47, 정답: 32, 맞힌 사람: 30, 정답 비율: 78.947%

### 분류

자료 구조, 그리디 알고리즘, 해시를 사용한 집합과 맵, 누적 합, 우선순위 큐, 스위핑, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>You are given N intervals. An interval can be represented by two positive integers L<sub>i</sub> and R<sub>i</sub> - the interval starts at L<sub>i</sub> and ends at R<sub>i</sub>, represented as [L<sub>i</sub>,R<sub>i</sub>]. Intervals may not be unique, so there might be multiple intervals with both equal L<sub>i</sub> and equal R<sub>i</sub>.</p>

<p>You are allowed to perform a maximum of C cuts. A cut at X will cut all intervals [L,R] for which L&lt;X and X&lt;R. Cutting an interval at X is defined as splitting the interval into two intervals - [L,X] and [X,R]. Note that cuts can only be performed at integer points. Also, cutting at an endpoint of an interval (X=L or X=R) has no effect and does not split the interval.</p>

<p>You need to find the maximum number of intervals that can be obtained through a maximum of C cuts.</p>

### 입력

<p>The first line of the input contains the number of test cases, T. T test cases follow.</p>

<p>Each test case starts with a line containing two integers, N and C, denoting the number of intervals and the maximum number of cuts you can perform respectively. N lines follow.</p>

<p>The i-th line contains two integers L<sub>i</sub> and R<sub>i</sub>, describing the i-th interval.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;x&nbsp;is the test case number (starting from 1) and&nbsp;y&nbsp;is the maximum number of intervals that can be obtained through at most&nbsp;C cuts, as described above.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
</ul>

### 힌트

<p>In the provided sample, cuts should be performed at 2 and 3 to get the maximum number of intervals.</p>

<p>After the first cut at 2, the intervals would be {[1,2],[2,3],[2,4],[1,2],[2,4]}.</p>

<p>After the second cut at 3, the intervals would be {[1,2],[2,3],[2,3],[3,4],[1,2],[2,3],[3,4]}.</p>

<p>It can be seen that no interval can be cut further, so the answer is 7.</p>