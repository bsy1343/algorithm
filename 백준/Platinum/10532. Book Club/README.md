# [Platinum III] Book Club - 10532

[문제 링크](https://www.acmicpc.net/problem/10532)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 183, 정답: 80, 맞힌 사람: 76, 정답 비율: 50.000%

### 분류

이분 매칭

### 문제 설명

<p>Porto&rsquo;s book club is buzzing with excitement for the annual book exchange event! Every year, members bring their favorite book and try to find another book they like that is owned by someone willing to trade with them.</p>

<p>I have been to this book exchange before, and I definitely do not want to miss it this year, but I feel that the trading should be improved. In the past, pairs of members interested in each other&rsquo;s books would simply trade: imagine that person A brought a book that person B liked and vice-versa, then A and B would exchange their books.</p>

<p>I then realized that many members were left with the same book they walked-in with... If instead of looking for pairs I looked for triplets, I could find more valid exchanges! Imagine that member A only likes member B&rsquo;s book, while B only likes C&rsquo;s book and C likes A&rsquo;s book. These 3 people could trade their books in a cycle and everyone would be happy!</p>

<p>But why stop at triplets? Cycles could be bigger and bigger! Could you help me find if it is possible for everyone to go out with a new book? Be careful, because members will not give their book without receiving one they like in return.</p>

<p>Given the members of the book club and the books they like, can we find cycles so that everyone receives a new book?</p>

### 입력

<p>The first line has two integers: N, the number of people, and M, the total number of &ldquo;declarations of interest&rdquo;. Each of the following M lines has two integers, A and B, indicating that member A likes the book that member B brought (0 &le; A, B &lt; N). Numbers A and B will never be the same (a member never likes the book he brought).</p>

### 출력

<p>You should output YES if we can find a new book for every club member and NO if that is not possible.</p>

### 제한

<ul>
	<li>2 &le; N &le; 10 000</li>
	<li>1 &le; M &le; 20 000 and M &le; N<sup>2</sup> &minus; N.</li>
</ul>