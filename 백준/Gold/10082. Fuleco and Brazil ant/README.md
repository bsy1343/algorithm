# [Gold IV] Fuleco and Brazil ant - 10082

[문제 링크](https://www.acmicpc.net/problem/10082)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 64, 정답: 27, 맞힌 사람: 25, 정답 비율: 49.020%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 트리, 깊이 우선 탐색

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10082.%E2%80%85Fuleco%E2%80%85and%E2%80%85Brazil%E2%80%85ant/0fdfa795.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10082/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:164px; width:163px" />Fuleco the Armadillo is very hungry and, as we all know, his favorite food are ants from a tree. Unfortunately, Fuleco is not a fast animal, so it is not uncommon that ants can escape him by running over tree branches. Ants are also very smart animals and they can smell Fuleco and start running to some other part of a tree which they think is not accessible to Fuleco. In order to help Fuleco the Armadillo not to get tired without a reason, we want to calculate the distance between the starting position of an ant and the position for which the ant thinks it is not accessible to him. And yeah, Fuleco can calculate from this whether he can catch the ant or not.</p>

<p>Let us define the ant-traversal of a tree in the following way. The ant start the traversal from the tree root and walks along the sides of the tree until he returns to the root again. The traversal starts from the left side of the tree. While walking up, the ant always stays on the left side of a branch, and when walking down, the ant is always on the right side of a branch. This traversal can be uniquely represented with a string, defined in the following way. For each visited fork (node) along the path we append letter &ldquo;U&rdquo; if the ant goes up from that point, or letter &ldquo;D&rdquo; if the ant goes down from that point, until it reaches the next fork (node).&nbsp;</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10082.%E2%80%85Fuleco%E2%80%85and%E2%80%85Brazil%E2%80%85ant/90a4a011.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10082/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:256px; width:347px" /></p>

<p>Given figure represents example of a tree and ant-traversal is given with directed lines along its side. String representation of this traversal is: UUUDUDUDDUUUDUDDDD.</p>

<p>You are given a string representation of the &ldquo;ant-traversal&rdquo; of an unknown tree and two forks (nodes) from that tree. These forks represent the ant&#39;s starting position and the position for which the ant thinks it is safe from Fuleco. Forks are specified by its indices in the given string representation, where index k represents the point where the ant will be after walking k times alongside the branches, starting from the root. For example, in the above figure, the fork labeled with &ldquo;A&rdquo; can be represented with indices 2, 4, 6 or 8. The distance between nodes &ldquo;A&rdquo; and &ldquo;B&rdquo; is 4.</p>

### 입력

<p>The input contains two lines. The first line contains two integers A and B, separated with one space, which are indices of the starting and the final position of the ant. Indices are zero-based. The second line contains one string S which represents the ant-traversal of a tree.</p>

### 출력

<p>The first and only line of the output contains one integer number which is the distance between given nodes in the tree.&nbsp;</p>

### 제한

<ul>
	<li>Length of a given string is less than 10<sup>6</sup>.</li>
	<li>The string represents a valid tree and contains only letters &ldquo;U&rdquo; and &ldquo;D&rdquo;.</li>
	<li>0 &le; A, B &lt; length(S)</li>
</ul>

### 힌트

<p>This tree is depicted on the figure in the problem statement. The number of branches between given two nodes, i.e. the distance, is 4.</p>