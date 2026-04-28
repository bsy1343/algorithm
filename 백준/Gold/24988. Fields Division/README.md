# [Gold IV] Fields Division - 24988

[문제 링크](https://www.acmicpc.net/problem/24988)

### 성능 요약

시간 제한: 0.3 초, 메모리 제한: 1024 MB

### 통계

제출: 64, 정답: 42, 맞힌 사람: 40, 정답 비율: 66.667%

### 분류

수학, 그래프 이론, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>The Silva family is a wheat producer in the interior of Brazil. They have a huge plantation managed by Mr. and Mrs. Silva. But the plantation has a peculiar shape: it has N fields numbered from 1 to N, connected by M two-way roads. To facilitate the work at harvest time, the plantation was designed in such a way that there is a path between each pair of fields using the existing roads. In addition, the fields have different sizes, thus impacting the productivity of each one. The i-th field has a yield of 2<sup>i</sup> kg of wheat per year.</p>

<p>As time went by, the Silva couple got tired of taking care of the plantation and decided to leave the task to their two kids: Ana and Bob. To not have any fights between the children, the couple wants to divide the N fields according to the following rules:</p>

<ul>
	<li>Each field must belong to exactly one sibling.</li>
	<li>There must be a path between each pair of fields that belong to the same sibling, using the existing roads, and visiting only that sibling&rsquo;s fields.</li>
	<li>The sums of the yields of each sibling&rsquo;s fields must be as similar as possible.</li>
</ul>

<p>If it is not possible to divide the fields so that the sums of the yields are equal, Ana will get the fields with the larger sum since she&rsquo;s the eldest sibling.</p>

<p>When the couple tried to make this division, they realized that the task would be very complex, so they asked for your help. Given the fields and the roads, your job is to help the Silva family to divide the fields between the two siblings the way they wish.</p>

### 입력

<p>The first line contains two integers N (2 &le; N &le; 3 &times; 10<sup>5</sup>) and M (1 &le; M &le; 3 &times; 10<sup>5</sup>), indicating respectively the number of fields and the number of roads. Each of the next M lines contains two integers U and V (1 &le; U, V &le; N and U &ne;&nbsp;V ), denoting that there&rsquo;s a two-way road between fields U and V. It is guaranteed that there is a path between each pair of fields using the given roads, and there is at most one road between each pair of fields.</p>

### 출력

<p>Output a single line with a string of length N such that its i-th character is either the uppercase letter &ldquo;<code>A</code>&rdquo; or the uppercase letter &ldquo;<code>B</code>&rdquo;, indicating respectively that Ana or Bob should receive the i-th field. If there are multiple solutions, output any of them.</p>