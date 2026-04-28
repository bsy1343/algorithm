# [Gold II] Liars and Truth Tellers - 5859

[문제 링크](https://www.acmicpc.net/problem/5859)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 402, 정답: 139, 맞힌 사람: 115, 정답 비율: 35.061%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 분리 집합

### 문제 설명

<p>After spending so much time around his cows, Farmer John has started to understand their language.  Moreover, he notices that among his N cows (2 &lt;= N &lt;= 1000), some always tell the truth while others always lie.</p>

<p>FJ carefully listens to M statements (1 &lt;= M &lt;= 10,000) from his cows, each of the form &quot;x y T&quot;, meaning that &quot;cow x claims cow y always tells the truth&quot; or &quot;x y L&quot;, meaning that &quot;cow x claims cow y always tells lies&quot;. Each statement involves a pair of different cows, and the same pair of cows may appear in multiple statements.  </p>

<p>Unfortunately, FJ believes he might have written down some entries in his list incorrectly, so there may not be a valid way to designate each cow as a truth teller or a liar that is consistent with all the M statements on FJ&#39;s list.  To help FJ salvage as much of his list as possible, please compute the largest value of A such that there exists a valid way to designate each cow as a truth teller or a liar in a manner that is consistent with the first A entries in FJ&#39;s list.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and M.</li>
	<li>Lines 2..1+M: Each line is of the form &quot;x y L&quot; or &quot;x y T&quot;, describing a statement made by cow x about cow y.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The maximum value of A such that the first A entries in FJ&#39;s list can be consistent with some assignment of &quot;truth teller&quot; or &quot;liar&quot; to the N cows.</li>
</ul>

### 힌트

<p>Statements 1 and 3 cannot both be satisfied at the same time, but statements 1 and 2 can be, if we let cows 1..3 tell the truth and cow 4 be a liar.</p>

<p> </p>