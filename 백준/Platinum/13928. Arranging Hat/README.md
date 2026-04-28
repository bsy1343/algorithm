# [Platinum I] Arranging Hat - 13928

[문제 링크](https://www.acmicpc.net/problem/13928)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 119, 정답: 39, 맞힌 사람: 36, 정답 비율: 36.364%

### 분류

다이나믹 프로그래밍, 역추적

### 문제 설명

<p>Arranging Hat is a cushy job indeed; high impact work, absolute authority, and 364 days of holiday every year. However, the hat has decided that it can do even better&mdash;it would like very much to become a tenured professor.</p>

<p>Recently the hat has been reading computer science papers in its ample spare time, and of course, being an arranging hat, it is particularly interested in learning more about sorting algorithms.</p>

<p>The hat&rsquo;s new contribution is to a class of algorithms known as lossy sorting algorithms. These usually work by removing some of the input elements in order to make it easier to sort the input (e.g., the Dropsort algorithm), instead of sorting all the input.</p>

<p>The hat is going to go one better&mdash;it is going to invent a lossy sorting algorithm for numbers that does not remove any input numbers and even keeps them in their original place, but instead changes some of the digits in the numbers to make the list sorted.</p>

<p>The lossiness of the sorting operation depends on how many digits are changed. What is the smallest number of digits that need to be changed in one such list of numbers, to ensure that it is sorted?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line containing the integers n and m (1 &le; n &le; 40, 1 &le; m &le; 400), the number of numbers and the number of digits in each number, respectively.</li>
	<li>n lines each containing an integer v (0 &le; v &lt; 10<sup>m</sup>). The numbers are zero-padded to exactly m digits.</li>
</ul>

### 출력

<p>Write a sorted version of the array, after making a minimum number of digit changes to make the numbers sorted (the numbers must remain zero-padded to m digits). If there are multiple optimal solutions, you may give any of them.</p>