# [Silver III] Chocolate Buying - 6027

[문제 링크](https://www.acmicpc.net/problem/6027)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 109, 정답: 44, 맞힌 사람: 43, 정답 비율: 51.190%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Bessie and the herd love chocolate so Farmer John is buying them some.</p>

<p>The Bovine Chocolate Store features N (1 &lt;= N &lt;= 100,000) kinds of chocolate in essentially unlimited quantities. &nbsp;Each type i of chocolate has price P_i (1 &lt;= P_i &lt;= 10^18) per piece and there are C_i (1 &lt;= C_i &lt;= 10^18) cows that want that type of chocolate.</p>

<p>Farmer John has a budget of B (1 &lt;= B &lt;= 10^18) that he can spend on chocolates for the cows. What is the maximum number of cows that he can satisfy? &nbsp;All cows only want one type of chocolate, and will be satisfied only by that type.</p>

<p>Consider an example where FJ has 50 to spend on 5 different types of chocolate. A total of eleven cows have various chocolate preferences:</p>

<pre>
    Chocolate_Type    Per_Chocolate_Cost    Cows_preferring_this_type
          1                   5                      3
          2                   1                      1
          3                  10                      4
          4                   7                      2
          5                  60                      1</pre>

<p>Obviously, FJ can&#39;t purchase chocolate type 5, since he doesn&#39;t have enough money. Even if it cost only 50, it&#39;s a counterproductive purchase since only one cow would be satisfied.</p>

<p>Looking at the chocolates start at the less expensive ones, he can purchase 1 chocolate of type #2 for 1 x &nbsp;1 leaving 50- 1=49, then purchase 3 chocolate of type #1 for 3 x &nbsp;5 leaving 49-15=34, then purchase 2 chocolate of type #4 for 2 x 7 leaving 34-14=20, then purchase 2 chocolate of type #3 for 2 x 10 leaving 20-20= 0.</p>

<p>He would thus satisfy 1 + 3 + 2 + 2 = 8 cows.</p>

### 입력

<ul>
	<li>Line 1: Two space separated integers: N and B</li>
	<li>Lines 2..N+1: Line i contains two space separated integers defining chocolate type i: P_i and C_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the maximum number of cows that Farmer John can satisfy</li>
</ul>

<p>&nbsp;</p>