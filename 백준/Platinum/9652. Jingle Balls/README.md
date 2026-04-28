# [Platinum IV] Jingle Balls - 9652

[문제 링크](https://www.acmicpc.net/problem/9652)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 80, 정답: 32, 맞힌 사람: 25, 정답 비율: 40.323%

### 분류

자료 구조, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 파싱, 스택, 문자열, 트리

### 문제 설명

<p>It will soon be time to decorate the Christmas tree. The NWERC judges are already debating the optimal way to put decorations in a tree. They agree that it is essential to distribute the decorations evenly over the branches of the tree.</p>

<p>This problem is limited to binary Christmas trees. Such trees consist of a trunk, which splits into two subtrees. Each subtree may itself split further into two smaller subtrees and so on. A subtree that does not split any further is a twig. A twig may be decorated by attaching at most one ball to it.</p>

<p><img alt="" src="/upload/images2/jingle.png" style="height:245px; width:299px" /></p>

<p>Figure 1 &ndash; Example of a tree with subtrees, twigs and one ball.</p>

<p>A decorated tree has an even distribution of balls if and only if the following requirement is satisfied:</p>

<p>At every point where a (sub)tree splits into two smaller subtrees t<sub>1</sub> and t<sub>2</sub>, the total number of balls in the left subtree N(t<sub>1</sub>) and the total number of balls in the right subtree N(t<sub>2</sub>) must either be equal or differ by one. That is: | N(t<sub>1</sub>) &minus; N(t<sub>2</sub>) | &le; 1.</p>

<p>In their enthusiasm, the judges initially attach balls to arbitrary twigs in the tree. When they can not find any more balls to put in the tree, they stand back and consider the result. In most cases, the distribution of the balls is not quite even. They decide to fix this by moving some of the balls to different twigs.</p>

<p>Given the structure of the tree and the initial locations of the balls, calculate the minimum number of balls that must be moved to achieve an even distribution as defined above.</p>

<p>Note that it is not allowed to add new balls to the tree or to permanently remove balls from the tree. The only way in which the tree may be changed is by moving balls to different twigs.</p>

### 입력

<p>For each test case, the input consists of one line describing a decorated tree.</p>

<p>The description of a tree consists of a recursive description of its subtrees. A (sub)tree is represented by a string in one of the following forms:</p>

<ul>
	<li>The string &lsquo;()&rsquo; represents a twig without a ball.</li>
	<li>The string &lsquo;(B)&rsquo; represents a twig with a ball attached to it.</li>
	<li>The string &lsquo;(t<sub>1</sub> t<sub>2</sub>)&rsquo; represents a (sub)tree that splits into the two smaller subtrees represented by t<sub>1</sub> and t<sub>2</sub>, where t<sub>1</sub> and t<sub>2</sub> are strings in one of the forms listed here.</li>
</ul>

<p>A tree contains at least 2 and at most 1000 twigs.</p>

### 출력

<p>For each test case, print one line of output.</p>

<p>If it is possible to distribute the balls evenly through the tree, print the minimum number of balls that must be moved to satisfy the requirement of even distribution.</p>

<p>If it is not possible to distribute the balls evenly, print the word &lsquo;impossible&rsquo;.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="/upload/images2/jingle2.png" style="height:236px; width:600px" /></p>

<p>Figure 2 &ndash; Trees corresponding to the example input cases.</p>