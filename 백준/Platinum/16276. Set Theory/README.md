# [Platinum V] Set Theory - 16276

[문제 링크](https://www.acmicpc.net/problem/16276)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 80, 정답: 30, 맞힌 사람: 21, 정답 비율: 33.333%

### 분류

수학, 그리디 알고리즘, 브루트포스 알고리즘, 해 구성하기

### 문제 설명

<p>Masha and Grisha like studying sets of positive integers.</p>

<p>One day Grisha has written a set A containing n different integers a<sub>i</sub> on a blackboard. Now he asks Masha to create a set B containing n different integers b<sub>j</sub> such that all n<sup>2</sup> integers that can be obtained by summing up a<sub>i</sub> and b<sub>j</sub> for all possible pairs of i and j are different.</p>

<p>Both Masha and Grisha don&#39;t like big numbers, so all numbers in A are from 1 to 10<sup>6</sup>, and all numbers in B must also be in the same range.</p>

<p>Help Masha to create the set B that satisfies Grisha&#39;s requirement.</p>

### 입력

<p>Input data contains multiple test cases. The first line contains an integer t &mdash; the number of test cases (1&thinsp;&le;&thinsp;t&thinsp;&le;&thinsp;100).</p>

<p>Each test case is described in the following way: the first line of the description contains one integer n &mdash; the number of elements in A (1&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;100).</p>

<p>The second line contains n integers a<sub>i</sub> &mdash; the elements of A (1&thinsp;&le;&thinsp;a<sub>i</sub>&thinsp;&le;&thinsp;10<sup>6</sup>).</p>

### 출력

<p>For each test first print the answer:</p>

<ul>
	<li>NO, if Masha&#39;s task is impossible to solve, there is no way to create the required set B.</li>
	<li>YES, if there is the way to create the required set. In this case the second line must contain n different positive integers b<sub>j</sub> &mdash; elements of B (1&thinsp;&le;&thinsp;b<sub>j</sub>&thinsp;&le;&thinsp;10<sup>6</sup>). If there are several possible sets, output any of them.</li>
</ul>