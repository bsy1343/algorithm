# [Gold I] Lego Land - 22774

[문제 링크](https://www.acmicpc.net/problem/22774)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22774.%E2%80%85Lego%E2%80%85Land/2a67be5c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22774.%E2%80%85Lego%E2%80%85Land/2a67be5c.png" data-original-src="https://upload.acmicpc.net/2170bd51-5692-49f2-bf18-291d93032743/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 249px; height: 220px;" /></p>

<p style="text-align: center;">Figure 1: VR view of a Lego downtown</p>

<p>As an urban Lego engineer, it is vital to obtain every possible technological advantage over your competition. You have recently noticed how popular virtual reality technology is with human engineers and wish to have something similar to help woo venture capitalists. Luckily, a VR view of a Lego downtown is very simple. First, you only have to show buildings, and you already know the heights and locations of all the buildings you want to build. Secondly, Lego VR is only capable of presenting a view of cube-shaped section of the city. It does this by projecting the cube onto one of the planes containing one of the cubefs faces. Lego engineers may browse the view by rotating the cube-shaped city section 90 degrees at a time about any one of the X, Y , or Z-axes passing through its center.</p>

<p>You are to write a Lego VR program that will take as input an N &times;N matrix view of a downtown area and a series of rotational commands and produce the resulting N &times; N matrix view of the same downtown area from the resulting perspective. The N &times; N input matrix will represent an overhead view of an N &times; N &times; N cube of a Lego downtown (with one face of the cube at ground level).</p>

<p>Each number in the input matrix indicates the height of the building in the corresponding location. For example, 0 indicates that no building is present, while 3 indicates a building 3 stories (Legos) high. Note that, in the initial overhead view, there is no hidden open space. In other words, the buildings are solid. Also note that only buildings are represented in the view, not the ground. Any region of the view that does not contain a block of a building will have value 0.</p>

### 입력

<p>Input consists of an unspecified number (at least one) of sets of three sections:</p>

<ol>
	<li>Grid size &mdash; A single line containing a single integer N (1 &le; N &le; 9) which represents the size of the cube of buildings represented.</li>
	<li>Building heights &mdash; An N &times; N array of whole numbers in the range 0 to N (inclusive). Each row in the array is given on its own input line, and array elements are not delimited. This initial N &times; N array represents an overhead view of an N &times; N solid structure of Lego buildings, with each number representing the height of the building in the corresponding location. Height of 0 indicates that no Lego exists in the given location.</li>
	<li>A series of rotational commands about the center of the N &times; N &times; N cube containing the Legos, one of:
	<ul>
		<li>&ldquo;X&rdquo; &mdash; rotates about the horizontal axis in the current view. The cube rotates such that the face of the cube that is at the top of the current view moves forward to become the new viewing face.</li>
		<li>&ldquo;Y&rdquo; &mdash; rotates about the vertical axis in the current view. The cube rotates such that the face of the cube that is at the left of the current view moves forward to become the new viewing face.</li>
		<li>&ldquo;Z&rdquo; &mdash; rotates about the line-of-sight axis in the current view. The viewing face does not change but is rotated 90 degrees counterclockwise.</li>
		<li>These commands are a single-unbroken string with at most 80 commands.</li>
	</ul>
	</li>
</ol>

<p>Between each two sets of input data is exactly one blank line. There will be no blank line before the first input set or following the last input set.</p>

<p>No invalid input will be provided.</p>

### 출력

<p>For each input case, output consists of an N &times;N array of numbers in the range 0 to N (inclusive) representing the final view for each input array and its associated set of rotations. Output arrays must be separated by exactly one blank line, and there must be no white space following the last digit of the last output array. Similarly, the first digit of the first output array must be the first character in the output.</p>

<p>No extraneous output of any kind should be printed.</p>

<p>Since this program essentially generates views of 3-dimensional objects, it is good to be very specific in describing how these views are calculated. Looking at the figure above, note that the cube has six sides, top, left, bottom, and right are labeled. The front is the side of the cube nearest the viewer, and the back is the side farthest from the viewer. The initial input view is&nbsp;meant to represent a Lego city from above. Each number represents the heights of the building at that location (or correspondingly, the maximum distance from the back of the cube for any Lego piece in that row and column). When the cube is rotated, the numbers no longer indicate the height of buildings since the view is no longer (necessarily) a view from above. Instead, the numbers continue to represent the maximum distance from the back of the cube for any Lego piece in that row and column of the cube. The idea is that the numbers will represent those Legos that are nearest the viewer, and therefore those Legos that are visible to the viewer.</p>