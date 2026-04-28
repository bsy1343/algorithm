# [Gold III] Family Tree - 15765

[문제 링크](https://www.acmicpc.net/problem/15765)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 201, 정답: 76, 맞힌 사람: 65, 정답 비율: 38.690%

### 분류

많은 조건 분기, 그래프 이론, 구현, 최소 공통 조상, 트리

### 문제 설명

<p>Farmer John owns a family-run farm that has been passed down over several generations, with a herd of cows whose familial roots can similarly be traced back several generations on the same farm. By examining old records, Farmer John is curious how the cows in his current herd are related to each-other. Please help him in this endeavor!</p>

### 입력

<p>The first line of input contains $N$ ($1 \leq N \leq 100$) followed by the names of two cows. Cow names are each strings of at most 10 uppercase letters ($A \ldots Z$). Farmer John is curious about the relationship between the two cows on this line of input.</p>

<p>The next $N$ lines each contain two cow names $X$ and $Y$, indicating that $X$ is the mother of $Y$.</p>

### 출력

<p>You should print one line of output indicating the relationship between the two cows specified on the first line of input (for simplicity, let&#39;s call these two cows BESSIE and ELSIE for the examples below). Here are the different types of relationships that are possible:</p>

<ul>
	<li>You should output &quot;SIBLINGS&quot; if BESSIE and ELSIE have the same mother.</li>
	<li>BESSIE might be a direct descendant of ELSIE, meaning that ELSIE is either the mother, grand-mother, great-grand-mother, great-great-grand-mother, etc., of BESSIE. If this is the case, you should print &quot;ELSIE is the (relation) of BESSIE&quot;, where (relation) is the appropriate relationship, for example &quot;great-great-grand-mother&quot;.</li>
	<li>If ELSIE is a child of an ancestor of BESSIE (and ELSIE is not herself an ancestor or sister of BESSIE), then ELSIE is BESSIE&#39;s aunt. You should output &quot;ELSIE is the aunt of BESSIE&quot; if ELSIE is a child of BESSIE&#39;s grand-mother, &quot;ELSIE is the great-aunt of BESSIE&quot; if ELSIE is a child of BESSIE&#39;s great-grand-mother, &quot;ELSIE is the great-great-aunt of BESSIE&quot; if ELSIE is a child of BESSIE&#39;s great-great-grand-mother, and so on.</li>
	<li>If BESSIE and ELSIE are related by any other means (i.e., if they share a common ancestor), they are cousins, and you should simply output &quot;COUSINS&quot;.</li>
	<li>You should output &quot;NOT RELATED&quot; if BESSIE and ELSIE have no common ancestor, or neither is directly descended from the other.</li>
</ul>

<p>The following diagram helps illustrate the relationships above, which are the only relationship types you need to consider. Observe that some relationships like &quot;niece&quot; (daughter of sister) are not necessary since if BESSIE is the niece of ELSIE, then ELSIE is BESSIE&#39;s aunt.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15765.%E2%80%85Family%E2%80%85Tree/a55dfdec.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15765.%E2%80%85Family%E2%80%85Tree/a55dfdec.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15765/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 593px; height: 419px;" /></p>