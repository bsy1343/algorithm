# [Gold IV] Folding the Figure - 16272

[문제 링크](https://www.acmicpc.net/problem/16272)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 기하학, 해 구성하기

### 문제 설명

<p>Petya was getting bored at his Math lesson, so he started painting squares at his grid paper. When he got bored of that action as well, he noticed that he now has a connected set of k painted squares &mdash; it is possible to get from any painted square to any other painted one by moving between painted squares sharing a common side.</p>

<p>He cut the figure away from the sheet of paper and folded it along some grid line (horizontal or vertical, he didn&#39;t remember). After that he painted squares of some other grid paper to create the copy of the folded figure. Now Petya has lost his original figure, so all he has is the copy of it after folding. Now Petya wants to restore the figure.</p>

<p>It is difficult to restore the figure exactly, but Petya has decided that he would like to have at least some figure of k squares that can be folded to get the same folded image. Help him, find some connected figure of k squares that can be folded the required way.</p>

<p>Consider for example the second sample test. It has a folded figure that is similar to an upside-down &quot;U&quot; letter, the original figure contains 12 squares. One way the original figure could look like is shown at the picture, it was folded along a line y&thinsp;=&thinsp;3:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16272.%E2%80%85Folding%E2%80%85the%E2%80%85Figure/9982ed8e.png" data-original-src="https://upload.acmicpc.net/0a971c68-7fe2-4f2d-8e15-e746aaeb9654/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 256px; height: 305px;" /></p>

### 입력

<p>Input data contains multiple test cases. The first line contains the number of test cases t (1&thinsp;&le;&thinsp;t&thinsp;&le;&thinsp;200).</p>

<p>Each of the t test cases is described in the following way: the first line of the description contains two integers n, k &mdash; the number of painted squares in the folded figure and the number of painted squares in the original figure (1&thinsp;&le;&thinsp;n&thinsp;&lt;&thinsp;k&thinsp;&le;&thinsp;10<sup>5</sup>).</p>

<p>Each of the following n lines contains two integers x<sub>i</sub>, y<sub>i</sub> &mdash; coordinates of the i-th painted square&#39;s bottom left corner (-10<sup>8</sup>&thinsp;&le;&thinsp;x<sub>i</sub>,&thinsp;y<sub>i</sub>&thinsp;&le;&thinsp;10<sup>8</sup>). It is guaranteed that all painted cells are distinct and form a connected figure.</p>

<p>It is guaranteed that the sum of values of k in all test cases of one input data doesn&#39;t exceed 10<sup>5</sup>.</p>

### 출력

<p>For each test case output the answer to this test. Output the description of the figure and the way to fold it to get the input figure.</p>

<p>The first line must contain the description of the folding line. The following k lines must contain two integers (x&#39;<sub>i</sub>,&thinsp;y&#39;<sub>i</sub>) each &mdash; the coordinates of the squares of the connected figure that can be folded along the given line to get the figure from the input data.</p>

<p>The folding line description must be one of the following 4:</p>

<ul>
	<li>L num &mdash; fold along the line x&thinsp;=&thinsp;num, put left side atop the right one;</li>
	<li>R num &mdash; fold along the line x&thinsp;=&thinsp;num, put the right side atop the left one;</li>
	<li>U num &mdash; fold along the line y&thinsp;=&thinsp;num, put the top side atop the bottom one;</li>
	<li>D num &mdash; fold along the line y&thinsp;=&thinsp;num, put the bottom side atop the top on.</li>
</ul>

<p>All x&#39;<sub>i</sub>, y&#39;<sub>i</sub>, and the coordinate of the folding line must not exceed 10<sup>9</sup> by their absolute values. It is guaranteed that the required figure exists. If there are several possible answers, output any of them.</p>