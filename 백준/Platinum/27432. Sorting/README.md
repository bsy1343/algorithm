# [Platinum IV] Sorting - 27432

[문제 링크](https://www.acmicpc.net/problem/27432)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 11, 맞힌 사람: 9, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 순열 사이클 분할

### 문제 설명

<p>Instead of partying in the Bellagio, Johnnie spends his time sorting permutations. He chooses a random permutation having N elements. While this permutation is not sorted, Johnnie picks two consecutive elements and swaps them. After a while he learns how to sort any permutation using the algorithm above with a minimum number of swaps.</p>

<p>Last night Johnnie learnt a new algorithm, so now he can swap any two elements in the permutation. Johnnie will sort the permutation using a minimum number of swaps. Obviously, this new algorithm will use less or the same number of swaps as the old one.</p>

<p>You have to find how many permutations having N elements can be sorted with fewer swaps using the new algorithm. You should print the result modulo 999017.</p>

### 입력

<p>On the first line of the standard input there is one number N, the length of permutations.</p>

### 출력

<p>Print the answer modulo 999017 on the first line of the standard output.</p>

### 제한

<ul>
	<li>2 &le; N &le; 1000</li>
</ul>

### 힌트

<p>There are 11 permutations with the mentioned property:</p>

<ul>
	<li>1 4 3 2</li>
	<li>2 4 3 1</li>
	<li>3 2 1 4</li>
	<li>3 2 4 1</li>
	<li>3 4 1 2</li>
	<li>3 4 2 1</li>
	<li>4 1 3 2</li>
	<li>4 2 1 3</li>
	<li>4 2 3 1</li>
	<li>4 3 1 2</li>
	<li>4 3 2 1</li>
</ul>

<p>For example, the permutation 4 2 1 3 can be sorted using the first algorithm like this: 4 2 1 3 =&gt; 2 4 1 3 =&gt; 2 1 4 3 =&gt; 1 2 4 3 =&gt; 1 2 3 4. Four steps were necessary. Using the second algorithm, it can be sorted faster: 4 2 1 3 =&gt; 4 2 3 1 =&gt; 1 2 3 4. Only two steps were necessary.</p>