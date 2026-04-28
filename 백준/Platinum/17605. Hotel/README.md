# [Platinum I] Hotel - 17605

[문제 링크](https://www.acmicpc.net/problem/17605)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 26, 맞힌 사람: 19, 정답 비율: 29.688%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Mr. Oshiro wants to build a new hotel in Celeste Mountain Range. He needs you to find a good place him. First, Oshiro wants to build the hotel on a continuous segment without any valley in between, and the hotel should be as wide as possible. However, some places are too dangerous for the construction, so he will ask you this question several times: what is the maximum width of a constructible hotel in a certain segment of Celeste Mountain Range?</p>

<p>To clarify the problem statement, we define the following terms.</p>

<ul>
	<li>Celeste Mountain Range is n kilometers long.</li>
	<li>The topography (shape of the land surface) is described by an integer sequence h<sub>0</sub>, . . . , h<sub>n&minus;1</sub> indicating the average heights in meters. h<sub>i</sub> is the average height in the area from the i-th kilometer to the (i + 1)-th kilometer of Celeste Mountain Range.</li>
	<li>Every query will be a continuous segment in Celeste Mountain Range that has corresponding sequence of heights.</li>
	<li>A valley is a place which is lower than its neighbors. In this problem, we call an area from i-th kilometer to the (i+1)-th kilometer a valley if h<sub>i</sub> &lt; min(h<sub>i&minus;1</sub>, h<sub>i+1</sub>) and 0 &lt; i &lt; n&minus;1. The area before the first kilometer and the area after the (n &minus; 2)-th are not considered as valleys, because h<sub>&minus;1</sub> and h<sub>n</sub> are not defined.</li>
	<li>A continuous segment is a unimodal interval if it has no valley in it except perhaps at either of its ends. For example, if the query segment has heights (1, 2, 3, 4, 3, 4, 5), then segments with heights (1, 2, 3, 4, 3) and (3, 4, 5) are unimodal intervals, but that with height (3, 4, 3, 4) is not.</li>
	<li>Mr. Oshiro only builds his hotel on a unimodal interval. Thus, the answer to the aformentioned query with heights (1, 2, 3, 4, 3, 4, 5) is 5.</li>
</ul>

<p>Mysterious phenomena often occur in Celeste Mountain Range. Sometimes the height of a certain area will change. But don&rsquo;t worry, Mr. Oshiro will tell you the information just in time before he comes to you with more and more questions!</p>

### 입력

<p>The first line contains one integer T, which is the number of test cases. In each test case, the first line contains one integer n, the length of Celeste Mountain Range in kilometers. The second line contains n integers denoting the initial heights. The third line contains one integer q which is the total number of queries and updates. Then q lines follow. Each of them is either in form &ldquo;1 p d&rdquo; or &ldquo;2 ℓ r&rdquo;. &ldquo;1 p d&rdquo; represents a mysterious phenomenon where p is the position and d is the amount of the height changed. That is, h<sub>p</sub> is updated with a new value h<sub>p</sub> + d. Note that d might be negative to indicate that a decrease in height. &ldquo;2 ℓ r&rdquo; represents the query from Oshiro. He wants to know the maximum width of the constructible hotel in the segment (ℓ, r) with height (h<sub>ℓ</sub>, . . . , h<sub>r</sub>).</p>

### 출력

<p>For each query, output one line containing the maximum width of a constructible hotel.</p>

### 제한

<ul>
	<li>1 &le; T &le; 10</li>
	<li>1 &le; n &le; 10<sup>5</sup></li>
	<li>1 &le; q &le; 10<sup>5</sup></li>
	<li>p, ℓ, r &isin; {0, 1, . . . , n &minus; 1}</li>
	<li>The heights will always be in the range [1, 10<sup>9</sup>].</li>
	<li>It is guaranteed that after any change, h<sub>i&minus;1</sub> ̸= h<sub>i</sub> for all 0 &lt; i &lt; n.</li>
</ul>