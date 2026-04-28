# [Platinum II] Jumping Stones - 21024

[문제 링크](https://www.acmicpc.net/problem/21024)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 7, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 세그먼트 트리, 집합과 맵

### 문제 설명

<p>Jonathan is fighting an evil mastermind, Putra the Mad Man, on a river. There are N stepping stones on the river at position 1, 2, . . . , N, from the left-most to the right-most. Jonathan can only stand on these stones and should avoid falling into the river at all cost (he is not a good swimmer).</p>

<p>Originally, Jonathan is not a good jumper (in this fight, he should jump between stones). However, it all changes after he learned about a mystical power from Dr. Effendy at Kathmandu. Now, Jonathan can jump to any place he needs to be. Specifically, he can jump from the stone at position p to any stone at position q where p &ne; q, but it requires him mystical energy of (|p &minus; q| &minus; 1)<sup>2</sup>. For example, jumping from p = 10 to q = 15 directly requires mystical energy of (|10 &minus; 15| &minus; 1)<sup>2</sup> = (| &minus; 5| &minus; 1)<sup>2</sup> = 4<sup>2</sup> = 16. Of course, if he simply wants to go from p = 10 to q = 15, he can jump in smaller steps multiple times in order to conserve his mystical energy, e.g., 10 &rarr; 11 &rarr; 12 &rarr; 13 &rarr; 14 &rarr; 15 requires a total mystical energy of 0 + 0 + 0 + 0 + 0 = 0.</p>

<p>On the other hand, aside from his tremendous physical power, Putra also has the ability to conjure or destroy stones at any position just with a simple snap of his fingers. However, as Putra is a perfectionist, he will only conjure or destroy stones at integer position. Jonathan can only jump to position x if there is a stone at position x. For example, let stones at position 12 and 13 be destroyed, then Jonathan can go from p = 10 to q = 15 by 10 &rarr; 11 &rarr; 14 &rarr; 15 which requires a total mystical energy of 0 + 4 + 0 = 4.</p>

<p>In this problem, you are going to help Jonathan calculating the required mystical energy for his movements when fighting Putra.</p>

<p>Given Q queries of the following types.</p>

<ul>
	<li><code>add</code> p &mdash; Putra conjures a stone at position p,</li>
	<li><code>rem</code> p &mdash; Putra destroys the stone at position p,</li>
	<li><code>go</code> p q &mdash; Output the minimum mystical energy required to go from position p to position q. It does not matter whether Jonathan has to jump several times as long as the total required mystical energy is as minimum as possible.</li>
</ul>

<p>Initially, all the stones from position 1 to position N are there. However, at the beginning of the fight, Putra destroys M out of those N stones. Luckily, Putra can only destroy one stone at a time during the fight, as shown by the second type of query.</p>

### 입력

<p>Input begins with a line containing three integers: N M Q (1 &le; N &le; 10<sup>9</sup>; 0 &le; M &le; 50 000; 1 &le; Q &le; 50 000) representing the total number of stones, the number of stones intially destroyed by Putra, and the number of queries, respectively. The next line contains M integers: p<sub>i</sub> (1 &le; p<sub>i</sub> &le; N) in strictly ascending order representing the stones&rsquo; positions which are destroyed by Putra at the beginning of the fight. The next Q lines each contains a query of the following type.</p>

<ul>
	<li><code>add</code> p (1 &le; p &le; N) &mdash; it is guaranteed that there is no stone at position p right before this query.</li>
	<li><code>rem</code> p (1 &le; p &le; N) &mdash; it is guaranteed that there is a stone at position p right before this query.</li>
	<li><code>go</code> p q (1 &le; p, q &le; N; p &ne;&nbsp;q) &mdash; it is guaranteed that both position p and q have stones. There will be at least one query of the third type (the go query).</li>
</ul>

### 출력

<p>For each query of the third type in the same order as input, output in a line an integer representing the minimum required total mystical energy to go from the stone at position p to the stone at position q.</p>