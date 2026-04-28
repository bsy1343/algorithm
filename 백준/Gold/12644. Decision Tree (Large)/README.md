# [Gold II] Decision Tree (Large) - 12644

[문제 링크](https://www.acmicpc.net/problem/12644)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 17, 맞힌 사람: 15, 정답 비율: 68.182%

### 분류

구현, 자료 구조, 문자열, 트리, 파싱

### 문제 설명

<p>Decision trees -- in particular, a type called classification trees -- are data structures that are used to classify&nbsp;<em>items</em>&nbsp;into&nbsp;<em>categories</em>&nbsp;using&nbsp;<em>features</em>&nbsp;of those items. For example, each animal is either &quot;cute&quot; or not. For any given animal, we can decide whether it is cute by looking at the animal&#39;s features and using the following decision tree.</p>

<pre>
(0.2 furry
  (0.81 fast
    (0.3)
    (0.2)
  )
  (0.1 fishy
    (0.3 freshwater
      (0.01)
      (0.01)
    )
    (0.1)
  )
)
</pre>

<p>A decision tree is defined recursively. It always has a root node and a weight. It also, optionally, has a feature name and two sub-trees, which are themselves decision trees.</p>

<p>More formally, a decision tree is defined using the following grammar.</p>

<pre>
<em>tree</em> <strong>::=</strong> (<em>weight</em> <strong>[</strong><em>feature</em> <em>tree</em> <em>tree</em><strong>]</strong>)
<em>weight</em> is a real number between 0 and 1, inclusive
<em>feature</em> is a string of 1 or more lower case English letters
</pre>

<p>The part inside the square brackets,&nbsp;<strong>[]</strong>, is optional. The parentheses, (),&nbsp;<em>weight</em>&nbsp;and&nbsp;<em>feature</em>&nbsp;are tokens. There will be at least one whitespace character between any two tokens, except (possibly) after an open-bracket &#39;(&#39; or before a close-bracket &#39;)&#39;. Whitespace characters are space (&#39; &#39;) and endline (&#39;\n&#39;).</p>

<p>&nbsp;</p>

<p>To figure out how likely the animal is to be cute, we start at the root of the tree with probability&nbsp;<em>p</em>&nbsp;set to 1. At each node, we multiply&nbsp;<em>p</em>&nbsp;by the weight of the node. If the node is a leaf (has no sub-trees), then we stop, and the value of&nbsp;<em>p</em>&nbsp;is the probability that our animal is cute. Otherwise, we look at the feature associated with the node. If our animal has this feature, we move down into the first sub-tree and continue recursively. If it does not have this feature, then we move down into the second sub-tree and continue in the same way.</p>

<p>For example, a beaver is an animal that has two features:&nbsp;<em>furry</em>&nbsp;and&nbsp;<em>freshwater</em>. We start at the root with&nbsp;<em>p</em>&nbsp;equal to 1. We multiply&nbsp;<em>p</em>&nbsp;by 0.2, the weight of the root and move into the first sub-tree because the beaver has the&nbsp;<em>furry</em>&nbsp;feature. There, we multiply&nbsp;<em>p</em>&nbsp;by 0.81, which makes&nbsp;<em>p</em>&nbsp;equal to 0.162. From there we move further down into the second sub-tree because the beaver does not have the&nbsp;<em>fast</em>&nbsp;feature. Finally, we multiply&nbsp;<em>p</em>&nbsp;by 0.2 and end up with 0.0324 -- the probability that the beaver is cute.</p>

<p>You will be given a decision tree and a list of animals with their features. For each item, you need to return the probability that the animal is cute.</p>

### 입력

<p>The first line of input contains a single integer,&nbsp;<strong>N</strong>, the number of test cases.&nbsp;&nbsp;<strong>N</strong>&nbsp;test cases follow.</p>

<p>Each test case description will start with a line that contains an integer&nbsp;<strong>L</strong>&nbsp;-- the number of lines that describe a decision tree. The next&nbsp;<strong>L</strong>&nbsp;lines will contain a decision tree in the format described above. The line after that will contain&nbsp;<strong>A</strong>&nbsp;-- the number of animals. The next&nbsp;<strong>A</strong>&nbsp;lines will each contain the description of one animal in the following format.</p>

<pre>
<em>animal</em> <strong>n</strong> <em>feature</em><sub>1</sub> <em>feature</em><sub>2</sub> ... <em>feature</em><sub><strong>n</strong></sub></pre>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100</li>
	<li>All weights will be between 0 and 1, inclusive.</li>
	<li>All weights will consist of only digits with at most one decimal point.</li>
	<li>The weights will not start or end with a decimal point.</li>
	<li>The weights will not have more than one 0 before a decimal point.</li>
	<li>All animals and features will consist of between 1 and 10 lower case English letters.</li>
	<li>All animal names within a test case will be distinct.</li>
	<li>All feature names for a single animal will be distinct.</li>
	<li>Each of the&nbsp;<strong>L</strong>&nbsp;lines in a decision tree definition will have at most 80 characters, not including the endlines.</li>
	<li>1 &le;&nbsp;<strong>L</strong>&nbsp;&le; 100</li>
	<li>1 &le;&nbsp;<strong>A</strong>&nbsp;&le; 100</li>
	<li>0 &le;&nbsp;<strong>n</strong>&nbsp;&le; 100</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>:&quot; followed by exactly&nbsp;<strong>A</strong>&nbsp;lines, one per animal, in the same order as they appear in the input. Each line should contain the probability that the animal is cute. Answers that are precise to within an absolute or relative error of 10<sup>-6</sup>&nbsp;will be considered correct.</p>