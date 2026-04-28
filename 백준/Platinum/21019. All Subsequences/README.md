# [Platinum II] All Subsequences - 21019

[문제 링크](https://www.acmicpc.net/problem/21019)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 8, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

수학, 다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 값 / 좌표 압축

### 문제 설명

<p>Given a sequence of integers A<sub>1..N</sub>. A subsequence B<sub>1..M</sub> of A is obtained by removing zero or more elements from A. For example, B<sub>1..3</sub> = {2, 3, 6} is a subsequence of A<sub>1..6</sub> = {1, 2, 3, 4, 5, 6} that is obtained by removing A<sub>1</sub>, A<sub>4</sub>, and A<sub>5</sub> from A. Two subsequences are considered different if they are obtained by removing a different set of indices from A.</p>

<p>The score of a subsequence B<sub>1..M</sub>, f(B<sub>1..M</sub>), is defined as |(B<sub>1</sub> &minus; B<sub>2</sub>) &times; (B<sub>2</sub> &minus; B<sub>3</sub>) &times; &middot; &middot; &middot; &times; (B<sub>M&minus;1</sub> &minus; B<sub>M</sub>)| for M &ge; 2 and 0 for M &lt; 2.</p>

<p>Your task is to compute the sum of the scores of all possible subsequences of A and modulo the output by 998 244 353.</p>

<p>For example, let A<sub>1..4</sub> = {1, 3, 3, 7}. There are 11 subsequences of A whose lengths are at least 2 (the remaining 5 subsequences have a score of 0 as their lengths are less than 2).</p>

<ul>
	<li>B<sub>1..2</sub> = A<sub>1,2</sub> = {1, 3} &rarr; f(B) = |&minus;2| = 2.</li>
	<li>B<sub>1..2</sub> = A<sub>1,3</sub> = {1, 3} &rarr; f(B) = |&minus;2| = 2.</li>
	<li>B<sub>1..2</sub> = A<sub>1,4</sub> = {1, 7} &rarr; f(B) = |&minus;6| = 6.</li>
	<li>B<sub>1..2</sub> = A<sub>2,3</sub> = {3, 3} &rarr; f(B) = |0| = 0.</li>
	<li>B<sub>1..2</sub> = A<sub>2,4</sub> = {3, 7} &rarr; f(B) = |&minus;4| = 4.</li>
	<li>B<sub>1..2</sub> = A<sub>3,4</sub> = {3, 7} &rarr; f(B) = |&minus;4| = 4.</li>
	<li>B<sub>1..3</sub> = A<sub>1,2,3</sub> = {1, 3, 3} &rarr; f(B) = |&minus;2 &times; 0| = 0.</li>
	<li>B<sub>1..3</sub> = A<sub>1,2,4</sub> = {1, 3, 7} &rarr; f(B) = |&minus;2 &times; &minus;4| = 8.</li>
	<li>B<sub>1..3</sub> = A<sub>1,3,4</sub> = {1, 3, 7} &rarr; f(B) = |&minus;2 &times; &minus;4| = 8.</li>
	<li>B<sub>1..3</sub> = A<sub>2,3,4</sub> = {3, 3, 7} &rarr; f(B) = |0 &times; &minus;4| = 0.</li>
	<li>B<sub>1..4</sub> = A<sub>1,2,3,4</sub> = {1, 3, 3, 7} &rarr; f(B) = |&minus;2 &times; 0 &times; &minus;4| = 0.</li>
</ul>

<p>The sum of all those scores are 2 + 2 + 6 + 0 + 4 + 4 + 0 + 8 + 8 + 0 + 0 = 34.</p>

### 입력

<p>Input begins with a line containing an integer: N (1 &le; N &le; 100 000) representing the number of integers in the sequence A. The next line contains N integers: A<sub>i</sub> (0 &le; A<sub>i</sub> &le; 10<sup>9</sup>) representing the sequence A.</p>

### 출력

<p>Output in a line an integer representing the sum of the scores of all possible subsequences of A modulo 998 244 353.</p>