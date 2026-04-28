# [Gold III] Quadtrees - 6982

[문제 링크](https://www.acmicpc.net/problem/6982)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 71, 정답: 32, 맞힌 사람: 21, 정답 비율: 56.757%

### 분류

분할 정복, 재귀

### 문제 설명

<p>A modern computer artist works with black-and-white images of 32 x 32 units, for a total of 1024 pixels per image. One of the operations the artist performs is &quot;adding&quot; two images together, to form a new image. In the resulting image a pixel is black if it was black in at least one of the component images, otherwise it is white.</p>

<p>A quadtree is a representation format used to encode images. The fundamental idea behind the quadtree is that any image can be split into four quadrants. Each quadrant may again be split in four subquadrants, etc. In the quadtree, the image is represented by a parent node, while the four quadrants are represented by four child nodes, in a predetermined order as shown in the figure below.</p>

<table class="table table-bordered" style="width:50px">
	<tbody>
		<tr>
			<td>2</td>
			<td>1</td>
		</tr>
		<tr>
			<td>3</td>
			<td>4</td>
		</tr>
	</tbody>
</table>

<p>Of course, if the whole image is a single color, it can be represented by a quadtree consisting of a single node. In general, a quadrant needs only to be subdivided if it consists of pixels of different colors. As a result, the quadtree need not be of uniform depth.</p>

<p>The preorder representation of a quadtree consisting of a single node is given by `e&#39;, if the node represents an `empty&#39; (white) quadrant, or `f&#39;, if the node represents a `full&#39; (black) quadrant. The preorder representation of a quadtree of more than one node consists of the letter `p&#39; (of &quot;parent&quot;) followed by the preorder representation of the four subtrees in the order indicated in the figure below. See the figure for an example.</p>

<p>The artist believes in what is called the preferred fullness: for an image to be attractive the most important property is the number of filled (black) pixels in the image. Your job is to write a program that, given the quadtree representation of two images, calculates the number of pixels that are black when the two images are added.</p>

<p>In the figure, the first example is shown (from top to bottom) as image, quadtree, pre-order string and number of pixels. The quadrant numbering is shown at the top of the figure.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6982.%E2%80%85Quadtrees/b40644fa.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6982.%E2%80%85Quadtrees/b40644fa.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6982/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-13%20%EC%98%A4%ED%9B%84%203.44.25.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:299px; width:500px" /></p>

<p>Questions</p>

<ol>
	<li>Give a preorder representation of the quadtree encoding the image below.<br />
	<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6982.%E2%80%85Quadtrees/35b57dc9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6982.%E2%80%85Quadtrees/35b57dc9.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6982/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-13%20%EC%98%A4%ED%9B%84%203.45.35.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:186px; width:180px" /></li>
	<li>What is the length of a shortest and a longest string representing the preorder traversal of a quadtree encoding an image of 32 x 32 pixels? Explain your answer.</li>
	<li>Write a program satisfying the specification below.</li>
</ol>

### 입력

<p>The first line of input specifies the number of test cases (N) your program has to process. The input for each test case is two strings, each string on its own line. The string is the pre-order representation of a quadtree. It is guaranteed that each string in the input represents a valid quadtree.</p>

### 출력

<p>For each test case, print on one line the text `<code>There are&nbsp;<var>X</var>&nbsp;black pixels.</code>&#39;, where&nbsp;<var>X</var>&nbsp;is the number of black pixels in the resulting image.</p>