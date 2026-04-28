# [Gold IV] Decisions, Decisions - 15278

[문제 링크](https://www.acmicpc.net/problem/15278)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 22, 맞힌 사람: 20, 정답 비율: 71.429%

### 분류

비트마스킹, 분할 정복, 재귀

### 문제 설명

<p>Let x<sub>0</sub>, . . . , x<sub>n&minus;1</sub> denote n boolean variables (i.e., variables taking only values 0 and 1). A binary decision diagram (BDD) over these variables is a diagrammatic representation of a boolean function f(x<sub>0</sub>, . . . , x<sub>n&minus;1</sub>) as inputs.</p>

<p>A BDD is a rooted binary tree such that all internal vertices v have precisely two children. The edges connecting an internal vertex v with its children are labelled with a 0 or 1 (exactly one of each). Each leaf vertex is also labelled with a 0 or 1. We note that a BDD may consist of a single vertex, which is considered to be both the root and a leaf vertex.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15278.%E2%80%85Decisions%2C%E2%80%85Decisions/f00992a3.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15278/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:345px; width:407px" /></p>

<p>Given input (x<sub>0</sub>, . . . , x<sub>n&minus;1</sub>), the boolean function represented by the BDD is evaluated as follows.</p>

<ul>
	<li>let v be the root vertex</li>
	<li>let i &larr; 0</li>
	<li>while v is not a leaf do
	<ul>
		<li>replace v with the child vertex of v by traversing the edge labelled x<sub>i</sub></li>
		<li>increase i by 1</li>
	</ul>
	</li>
	<li>output the label of leaf vertex v</li>
</ul>

<p>Consider the function f(x<sub>0</sub>, x<sub>1</sub>, x<sub>2</sub>) represented by the BDD above. To evaluate f(1, 0, 1), we start from the root, we descend along edges labelled 1, 0, and then 1. We reach a leaf vertex labelled 1, so f(1, 0, 1) = 1.</p>

<p>A BDD is minimal if there is no way to replace any subtree of an internal vertex of the BDD by a single leaf vertex to get a new BDD defining the same boolean function. The BDD depicted above is minimal. It is a fact that for each boolean function f, there is a unique minimal BDD that represents the boolean function.</p>

<p>In this problem, you are given an n-variable boolean function specified by a list of the 2<sup>n</sup> different values the function should take for various inputs. Compute the number of vertices in the minimal BDD representing this function.</p>

### 입력

<p>The first line of input consists of a single integer 1 &le; n &le; 18. Then one more line follows that contains 2<sup>n</sup> values (either 0 or 1) describing an n-variable boolean function.</p>

<p>We think of these values as being indexed from 0 to 2<sup>n</sup> &minus; 1. The ith such value represents f(x<sub>0</sub>, . . . , x<sub>n&minus;1</sub>) where x<sub>j</sub> is the jth least-significant bit of the binary representation of i. In other words, x<sub>j</sub> is the coefficient of 2 j in the binary expansion of i.</p>

<p>The third sample input below corresponds to the BDD depicted above.</p>

### 출력

<p>Output consists of a single integer m that is the number of vertices in the unique minimal BDD representing the boolean function from the input.</p>