# [Platinum IV] Bad Treap - 18068

[문제 링크](https://www.acmicpc.net/problem/18068)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 38, 맞힌 사람: 36, 정답 비율: 61.017%

### 분류

수학, 해 구성하기, 런타임 전의 전처리

### 문제 설명

<p>A <em>treap</em>, also known as <em>Cartesian tree</em>, is a data structure that stores a set of keys in a binary search tree.</p>

<p>Each node of this tree is characterized by a pair (x, y).</p>

<p>The x values of the nodes are the stored keys. They obey &ldquo;the binary search tree rule&rdquo;: all x values in the left subtree of the node are smaller than its x value, and all x values in the right subtree of the node are larger than its x value.</p>

<p>The y values of the nodes obey &ldquo;the heap rule&rdquo;: y value of a node is less than or equal to the y value of its parent.</p>

<p>The y value for each created node is usually selected randomly according to some distribution. This results in nice average time complexity of many operations.</p>

<p>Since this data structure unites some properties of a binary search tree and a heap, its name is a &ldquo;portmanteau&rdquo; term made of two words: TRee + hEAP = TREAP.</p>

<table class="table table-bordered" style="width:100%;">
	<tbody>
		<tr>
			<td style="width: 50%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18068.%E2%80%85Bad%E2%80%85Treap/a1776e41.png" data-original-src="https://upload.acmicpc.net/e0204c8d-83b3-4eb2-8673-d3495fbe7974/-/crop/665x270/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 333px; height: 135px;" /></td>
			<td style="width: 50%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18068.%E2%80%85Bad%E2%80%85Treap/031b151f.png" data-original-src="https://upload.acmicpc.net/e0204c8d-83b3-4eb2-8673-d3495fbe7974/-/crop/456x270/768,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 228px; height: 135px;" /></td>
		</tr>
		<tr>
			<td style="width: 50%; text-align: center;">A treap with 7 nodes; its height is 4</td>
			<td style="width: 50%; text-align: center;">A treap for the sample test below</td>
		</tr>
	</tbody>
</table>

<p>Benjamin decided that nondeterminism in y value selection procedure is bad, as it makes execution time differ from one run to another. He decided to calculate y for each node deterministically based on its x. He selected the rule y = sin(x). He is especially glad that distinct integer x&rsquo;s will always have distinct y&rsquo;s.</p>

<p>Barbara understands that while the nondeterministic treap shows its worst performance when provided &ldquo;bad&rdquo; random sequence, the deterministic treap shows its worst performance when provided &ldquo;bad&rdquo; set of keys. She wants to explain it to Benjamin by showing him n integer keys, which, being stored in his data structure, will form a treap of height n &mdash; the &ldquo;most unbalanced&rdquo; possible situation.</p>

<p>Help Barbara by providing n such keys. All these keys should fit into the 32-bit signed integer type.</p>

### 입력

<p>The input consists of a single integer n (1 &le; n &le; 50 000).</p>

### 출력

<p>Output n lines containing distinct integer keys. All keys must be between &minus;2<sup>31</sup> and 2<sup>31</sup> &minus; 1, inclusive.</p>

<p>A treap built on these keys with the rule y = sin(x) must have height n.</p>