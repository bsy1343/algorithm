# [Gold V] Checking an Alibi - 27008

[문제 링크](https://www.acmicpc.net/problem/27008)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 122, 정답: 78, 맞힌 사람: 68, 정답 비율: 62.385%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>A crime has been comitted: a load of grain has been taken from the barn by one of FJ&#39;s cows. FJ is trying to determine which of his C (1 &le; C &le; 100) cows is the culprit. Fortunately, a passing satellite took an image of his farm M (1 &le; M &le; 70000) seconds before the crime took place, giving the location of all of the cows. He wants to know which cows had time to get to the barn to steal the grain.</p>

<p>Farmer John&#39;s farm comprises F (1 &le; F &le; 500) fields numbered 1..F and connected by P (1 &le; P &le; 1,000) bidirectional paths whose traversal time is in the range 1..70000 seconds (cows walk very slowly). Field 1 contains the barn. It takes no time to travel within a field (switch paths).</p>

<p>Given the layout of Farmer John&#39;s farm and the location of each cow when the satellite flew over, determine set of cows who could be guilty.</p>

<p>NOTE: Do not declare a variable named exactly &#39;time&#39;. This will reference the system call and never give you the results you really want.</p>

### 입력

<ul>
	<li>Line 1: Four space-separated integers: F, P, C, and M</li>
	<li>Lines 2..P+1: Three space-separated integers describing a path: F1,F2, and T. The path connects F1 and F2 and requires T seconds to traverse.</li>
	<li>Lines P+2..P+C+1: One integer per line, the location of a cow. The first line gives the field number of cow 1, the second of cow 2, etc.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer N, the number of cows that could be guilty of the crime.</li>
	<li>Lines 2..N+1: A single cow number on each line that is one of the cows that could be guilty of the crime. The list must be in ascending order.</li>
</ul>

### 힌트

<p>Fields/distances like this:</p>

<pre>
          6
      4------5
      |      |
     2|      |
      |      |
7-----1      |5
   9  |      |
     1|      |
      |      |
      2------3
</pre>

<p>Any cow except cow 5 could have done it. Cow 5 would take 9 seconds to get to the barn.</p>