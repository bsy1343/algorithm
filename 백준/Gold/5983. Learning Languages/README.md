# [Gold I] Learning Languages - 5983

[문제 링크](https://www.acmicpc.net/problem/5983)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 102, 정답: 41, 맞힌 사람: 37, 정답 비율: 39.362%

### 분류

자료 구조, 분리 집합, 그래프 이론

### 문제 설명

<p>Farmer John&#39;s N (2 &lt;= N &lt;= 10,000) cows, conveniently numbered 1..N, are fluent in some M (1 &lt;= M &lt;= 30,000) languages, also conveniently numbered from 1..M. Cow i can speak in K_i (1 &lt;= K_i &lt;= M) languages, namely L_i1, L_i2,..., L_{iK_i} (1 &lt;= L_ij &lt;= M). FJ&#39;s cows aren&#39;t THAT smart, so the sum of K_i over all cows i is at most 100,000.</p>

<p>Two cows can&#39;t directly talk to each other unless both speak a common language. However, cows can pass messages along, translating if necessary. In other words, cows A and B can have a conversation if and only if there exists a sequence of cows T_1, T_2, ..., T_k such that A and T_1 share a language, T_1 and T_2 share a language, etc., and T_k and B share a language.</p>

<p>Farmer John wishes that his cows could be even more social, so he wants all his cows to be able to socialize with any other cow. He can buy books to teach any one of his cows any language he pleases. Being a fairly frugal farmer, FJ wants to purchase the minimum number of books necessary to enable all of his cows to speak to each other. Help him determine:</p>

<ul>
	<li>The minimum number of books he must purchase</li>
	<li>Any set of books assigned to cows in any order which will help him meet this goal; a program will grade your output.</li>
</ul>

<p>By way of example, suppose there are three cows named Alberta, Bessie, and Contessa along with three languages denoted as #1, #2, and #3. Alberta can speak languages #2 and #3, Bessie can speak language #2, and Contessa can speak language #1. Currently, Alberta and Bessie can talk to each other, but Contessa is left alone.</p>

<pre>
                   #1  #2   #3
       Alberta           x    x
       Bessie            x
       Contessa     x</pre>

<p>FJ wants to fix this situation, so he can buy Contessa a book to teach her language #2. This will ensure all cows speak the same language, so they can all communicate with one another.</p>

<p>Note that an alternate solution exists: instead, FJ could buy Contessa a book to teach her language #3. Not all cows would speak the same language, but this would still be a valid solution because Contessa could communicate through Alberta (who also speaks language #3) if she wants to talk to Bessie. Other alternatives exist, and any valid alternate solution will also be accepted.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..N+1: Line i+1 describes the languages that cow i can speak with (K_i)+1 space-separated integers: K_i, L_i1, L_i2,...,L_i{K_i}.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the minimum number of books that FJ must purchase.</li>
	<li>Lines 2..B+1: Line i+1 contains two space-separated integers: the language id # and the id # of the cow to receive book i. If multiple solutions exist, print any one.</li>
</ul>

<p>&nbsp;</p>