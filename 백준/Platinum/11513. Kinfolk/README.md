# [Platinum V] Kinfolk - 11513

[문제 링크](https://www.acmicpc.net/problem/11513)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 36, 정답: 6, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

많은 조건 분기, 구현, 최소 공통 조상, 트리

### 문제 설명

<p>The English language abounds with terms for describing family (genetic) relationships. The basic relationships are:</p>

<ul>
	<li>Self, parent (mother and father), and child (daughter and son) are well understood.</li>
	<li>Another child of your parent is your sister (if female) or brother (if male).</li>
	<li>The child of your sister or brother is your niece (if female) or nephew (if male). You would be their aunt (if female) or uncle (if male).</li>
	<li>Two people who share a common grandparent but not a common parent are 1st cousins. If they share a common great-grandparent but not a common grandparent, they are 2nd cousins. This can be extended to 3rd cousins and so on.</li>
</ul>

<p>These relationships are extended to later generations as follows:</p>

<ul>
	<li>The daughter, son, niece, and nephew relationships can be extended to later generations by pre-pending &quot;grand&quot;, &quot;great-grand&quot;, or &quot;great-great-grand&quot;. Thus the son of one&#39;s son or daughter is a grandson. The son of your niece or nephew is your grandnephew. Your grandnephew&#39;s daughter would be your great-grandniece, and so on. (In theory, we could extend this to any number of additional &quot;great-&quot; prefixes, but we will stop with &quot;great-great-grand&quot; in this problem.)</li>
	<li>The mother, father, aunt, and uncle relationships are extended symmetrically by the same prefix. Thus you would be the grandmother or grandfather of your granddaughter or grandson, the great-granduncle or great-grandaunt of your great-grandnieces and great-grandnephews, etc.</li>
	<li>The cousin relationship is extended to your cousin&#39;s descendants by degrees of removal. The children of your 1st cousin are your 1st cousins once removed (and, symmetrically, you are their 1st cousin once removed). The grand-children of your 3rd cousin are your 3rd cousins twice removed. The great-grandchildren of your 2nd cousin are your 2nd cousins thrice removed. All of the cousin-based relationships are symmetric, so if someone is your Kth cousin something removed, you are theirs as well.</li>
</ul>

<p>Write a program to determine the relationship of one person to another.</p>

### 입력

<p>Input will consist of one or more datasets. Each dataset consists of a single line containing two integers A and B (0 &lt;= A, B &lt;= 32767) and a character. A negative number for the first integer indicates end of input.</p>

<p>The integers identify persons A and B. The character will be either M or F, designating the gender of person B as male or female.</p>

<p>The integers identify the positions of person A and person B in a family tree envisioned as follows: consider a full binary tree in which the root is numbered 0, its children are numbered 1 and 2, the children of 1 are 3 and 4, the children of 2 are 5 and 6, and numbering proceeds in that manner, level by level, left to right. This numbering scheme is shown in the diagram below. A parent-child relationship in this tree represents a parent-child relationship in the family.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11513.%E2%80%85Kinfolk/571bd16c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11513/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:326px; width:661px" /></p>

### 출력

<p>For each dataset, print a single line indicating the relationship of B to A. This relationship must be constructed from the phrases &quot;self&quot;, &quot;sister&quot;, &quot;brother&quot;, &quot;daughter&quot;, &quot;son&quot;, &quot;mother&quot;, &quot;father&quot;, &quot;niece&quot;, &quot;nephew&quot;, &quot;aunt&quot;, &quot;uncle&quot;, &quot;cousin&quot;, &quot;grand&quot;, &quot;great-&quot;, &quot;1st&quot;, &quot;2nd&quot;, &quot;3rd&quot;, &quot;once removed&quot;, &quot;twice removed&quot;, and &quot;thrice removed&quot;. No more than two &quot;great-&quot; prefixes may be applied. If &quot;1st&quot;, &quot;2nd&quot;, or &quot;3rd&quot; is used, it should be separated from the following part of the line by a single blank. If &quot;once removed&quot;, &quot;twice removed&quot;, or &quot;thrice removed&quot; is used, it must be separated from the preceding part of the line by a single blank. If it is not possible to describe the relationship of B to A under the above limitations, then print &quot;kin&quot;.</p>