# [Silver III] Telescope Targeting - 34373

[문제 링크](https://www.acmicpc.net/problem/34373)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 13, 맞힌 사람: 13, 정답 비율: 86.667%

### 분류

격자 그래프, 그래프 이론, 브루트포스 알고리즘

### 문제 설명

<p>The Wames Jebb space telescope has just reached orbit, unfolded its mirrors, and started taking photographs of the universe's farthest reaches! Scientists from all over the world have submitted requests for photographs of various astronomical phenomena, from stars and planets to distant galaxies and nebula. For budget reasons, undergraduate students at Mines have been tasked with operating the telescope and taking these photos.</p>

<p>Each scientist submits a preliminary image of the area of the sky they would like to photograph, to act as a reference. When it is time to fulfill their request, the Wames Jebb telescope rotates so that the referenced area of sky is centered in the telescope's field of view. You must write a program to compare the reference image to the current view of the telescope, and output the number of degrees the telescope must rotate.</p>

<p>For example, sample input $1$ shows that a scientist is searching for a solitary star. Because the star appears slightly to the lower-right of the current view, rotating the Wames Jebb $1$ degree further rightward and $1$ degree further downward will point the telescope directly at the star, centering the reference image in the view.</p>

### 입력

<p>Each input begins with a reference image of the rectangular region of sky a scientist would like the Wames Jebb telescope to photograph. The first line provides two integers $1 \leq W_r \leq 50$ and $1 \leq H_r \leq 50$: the width and height of the reference image in degrees. The next $H_r$ lines of the input each contain $W_r$ characters. Each character specifies which type of object appears in a square of the reference image roughly one degree wide and one degree tall:</p>

<ul>
	<li>"<code>#</code>" (pound symbol) -- Empty space.</li>
	<li>"<code>*</code>" (star symbol) -- A star.</li>
	<li>"<code>.</code>" (period) -- A planet.</li>
	<li>"<code>o</code>" (lowercase letter O) -- A nebula.</li>
	<li>"<code>@</code>" (at symbol) -- A galaxy.</li>
</ul>

<p>If the reference image contains an astronomical object $x$ degrees from its leftmost edge and $y$ degrees its topmost edge, the $x^{\text{th}}$ character in the $y^{\text{th}}$ line will be used to represent that object.</p>

<p>After the reference image, the input contains the Wames Jebb's current view of the sky, in the same format. First there are two integers, $1 \leq W_s \leq 50$ and $1 \leq H_s \leq 50$, giving the width and height of the view in degrees. Then $H_s$ lines of $W_s$ characters each, showing what astronomical object is visible in each square degree of the sky.</p>

<p>Note that the currently visible rectangle of sky will always contain the full reference image <em>exactly once</em>, and that a fractional rotation will never be necessary to center the reference image in the view. As a consequence, the current view will always be larger than the reference, and both the differences $W_s - W_r$ and $H_s - H_r$ will be evenly divisible by two.</p>

### 출력

<p>The output should contain a single line with two integers: the number of degrees rightward the telescope should rotate and the number of degrees downward the telescope should rotate, so that the scientist's image is brought into the center of the view. To rotate the telescope leftward or upward, specify rotation rightward or downward by a negative number of degrees.</p>