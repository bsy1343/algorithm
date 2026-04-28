# [Platinum V] Movers - 30579

[문제 링크](https://www.acmicpc.net/problem/30579)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 13, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

그래프 이론, 제곱근 분할법

### 문제 설명

<p>Department of successful computing in Tomorrow Programming School is famous for stockpiling large quantities of desks and monitors in their labs, it serves well to the whole community.</p>

<p>Any time a meeting is being held in a lab, the number of desks and monitors in it should be sufficient to serve all participants. In case of necessity, additional desks and/or monitors may be borrowed from neighbouring labs. In extreme cases, all desks and all monitors from all neighbouring labs may be brought in. Thus, available desks and monitors in a lab are exactly those desks and monitors which are in the lab itself and in all its neighbour labs. Desks or monitors are never transported from more distant labs, it is deemed ineffective and accident prone. After a meeting, all borrowed desks and monitors are returned back to their original labs, before any other meeting starts.</p>

<p>The desired configuration for a meeting is when the number of available desks and monitors in the lab is equal. Often, the number of available desks in a lab is either smaller or bigger than the number of available monitors, and that creates specific problems for the maintenance staff each time.</p>

<p>The inflow of desks and monitors to the department is rapid. Frequently a shipment of desks and monitors arrives to the department and its contents is added to various labs. It is added immediately or immediately after the end of the current meeting.</p>

<p>To plan the meetings, and equipment maintenance as well, it is important to know how many desks and monitors are available in any lab at any moment. The department needs a program that can process two kinds of queries. The first kind of query specifies a number of desks or monitors that have just been added to a particular lab. The second kind of query asks for a relation between the number of available desks and monitors in a particular lab.</p>

### 입력

<p>The first input line contains three integers N, M, Q (1 &le; N &le; 10<sup>5</sup>, 0 &le; M &le; 10<sup>5</sup>, 0 &le; Q &le; 10<sup>5</sup>), the number of labs, the number of pairs of labs which are neighbours to each other, and the number of queries. Labs are labeled by integers 1, 2, . . . , N. The second line contains N spaceseparated integers D<sub>i</sub> (0 &le; D<sub>i</sub> &le; 100), the number of desks in lab i. The third line contains N space-separated integers E<sub>i</sub> (0 &le; E<sub>i</sub> &le; 100), the number of monitors in lab i. Next M lines contain space-separated unique pairs of distinct integers a<sub>i</sub>, b<sub>i</sub>, (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; N), the labels of pairs of neighbour labs. Next Q lines contain the queries, one query per line. Each query is provided in one of the two formats.</p>

<ol>
	<li><code>add &lt;count&gt; desk/monitor &lt;label&gt;</code> &ndash; query increases the number of desks or monitors by the given <code>&lt;count&gt;</code> in a lab with specified <code>&lt;label&gt;</code>.</li>
	<li><code>check &lt;label&gt;</code> &ndash; query asks for a relation between the number of available desks and available monitors in a lab with specified <code>&lt;label&gt;</code>.</li>
</ol>

<p>One <code>add</code> query increases the number of desks or monitors in a lab by at most 100.</p>

### 출력

<p>Output Q lines, one for each query of type check, in the order they appear in the input. Each line contains one of the strings &ldquo;<code>desks</code>&rdquo;, &ldquo;<code>monitors</code>&rdquo;, or &ldquo;<code>same</code>&rdquo;, depending on whether there are more available desks or more available monitors in the lab specified by the query, or whether their numbers are equal.</p>