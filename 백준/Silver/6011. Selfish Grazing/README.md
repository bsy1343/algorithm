# [Silver I] Selfish Grazing - 6011

[문제 링크](https://www.acmicpc.net/problem/6011)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 134, 정답: 83, 맞힌 사람: 71, 정답 비율: 60.169%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Each of Farmer John&#39;s N (1 &lt;= N &lt;= 50,000) cows likes to graze in a certain part of the pasture, which can be thought of as a large one-dimeensional number line. Cow i&#39;s favorite grazing range starts at location S_i and ends at location E_i (1 &lt;= S_i &lt; E_i; S_i &lt; E_i &lt;= 100,000,000).</p>

<p>Most folks know the cows are quite selfish; no cow wants to share any of its grazing area with another. Thus, two cows i and j can only graze at the same time if either S_i &gt;= E_j or E_i &lt;= S_j. FJ would like to know the maximum number of cows that can graze at the same time for a given set of cows and their preferences.</p>

<p>Consider a set of 5 cows with ranges shown below:</p>

<pre>
  ... 1    2    3    4    5    6    7    8    9   10   11   12   13 ...
  ... |----|----|----|----|----|----|----|----|----|----|----|----|----
Cow 1:      &lt;===:===&gt;          :              :              :
Cow 2: &lt;========:==============:==============:=============&gt;:
Cow 3:          :     &lt;====&gt;   :              :              :
Cow 4:          :              :     &lt;========:===&gt;          :
Cow 5:          :              :     &lt;==&gt;     :              :</pre>

<p>These ranges represent (2, 4), (1, 12), (4, 5), (7, 10), and (7, 8), respectively.</p>

<p>For a solution, the first, third, and fourth (or fifth) cows can all graze at the same time. If the second cow grazed, no other cows could graze. Also, the fourth and fifth cows cannot graze together, so it is impossible for four or more cows to graze.</p>

### 입력

<ul>
	<li>Line 1: A &nbsp;single integer: N</li>
	<li>Lines 2..N+1: Line i+1 contains the two space-separated integers: S_i and E_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer representing the maximum number of cows that can graze at once.</li>
</ul>

<p>&nbsp;</p>