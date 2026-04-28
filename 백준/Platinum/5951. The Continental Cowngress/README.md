# [Platinum III] The Continental Cowngress - 5951

[문제 링크](https://www.acmicpc.net/problem/5951)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 28, 맞힌 사람: 22, 정답 비율: 50.000%

### 분류

그래프 이론, 강한 연결 요소, 2-sat

### 문제 설명

<p>Displeased with Farmer John&#39;s leadership, the cows have seceded from the farm and have formed the first Continental Cowngress. Built on the principle of &quot;every cow gets something they want,&quot; they&#39;ve decided on the following voting system:</p>

<p>The M (1 &lt;= M &lt;= 4000) cows in attendance will vote on &nbsp;N (1 &lt;= N &lt;= 1,000) legislative bills. Each cow casts a &quot;yes&quot; or &quot;no&quot; vote (denoted as &#39;Y&#39; or &#39;N&#39; in the input file) on exactly two (distinct) bills B_i and C_i (1 &lt;= B_i &lt;= N; 1 &lt;= C_i &lt;= N). The votes are called VB_i (VB_i in {&#39;Y&#39;, &#39;N&#39;}) and VC_i (VC_i in {&#39;Y&#39;, &#39;N&#39;}) respectively.</p>

<p>Finally, the bills are to be passed or not in such a way that every cow gets her way on at least one of her votes. For example, if Bessie votes &quot;yes&quot; on Bill 1, and &quot;no&quot; on Bill 2, then in any valid solution, it must be the case that either Bill 1 gets passed or Bill 2 gets rejected (or both).</p>

<p>Given the votes of each of the cows, it&#39;s your job to figure out which bills will be passed and which bills will be rejected in order to conform to the rules above. &nbsp;If there is no solution, print &quot;IMPOSSIBLE&quot;. If there is at least one solution, then for each bill, display:</p>

<pre>
    Y  if in every solution this bill passes
    N  if in every solution this bill fails
    ?  if there are solutions where this bill passes and solutions where it does not pass</pre>

<p>Consider the following set of votes (two for each cow):</p>

<pre>
       - - - - - BILL - - - - -
         1        2        3
Cow 1   YES      NO
Cow 2   NO       NO
Cow 3   YES               YES
Cow 4   YES      YES</pre>

<p>From this, two solutions satisfy every cow:</p>

<ul>
	<li>Bill 1 passes (this then satisfies cows 1, 3, and 4)</li>
	<li>Bill 2 fails (this then satisfies cow 2)</li>
	<li>Bill 3 could pass or fail (and this is the reason there are two solutions)</li>
</ul>

<p>In fact, these are the only two solutions, so the answer is the three character string below:</p>

<pre>
YN?</pre>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..M+1: Line i+1 describes cow i&#39;s votes with four space-separated fields -- an integer, a vote, another integer, and another vote: B_i, VB_i, C_i, VC_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A string with N characters, where the ith character is either a &quot;Y&quot; if the ith bill must pass, an &quot;N&quot; if the ith bill must fail, or a &quot;?&quot; if it cannot be determined whether the bill passes from these votes.</li>
	<li>If there is no solution which satisfies every cow, then output the single line &quot;IMPOSSIBLE&quot;.</li>
</ul>