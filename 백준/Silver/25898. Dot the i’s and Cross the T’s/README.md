# [Silver II] Dot the i’s and Cross the T’s - 25898

[문제 링크](https://www.acmicpc.net/problem/25898)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 17, 맞힌 사람: 17, 정답 비율: 26.984%

### 분류

브루트포스 알고리즘, 기하학, 구현

### 문제 설명

<p>Mr. T, known for his hair cut and the phrase &ldquo;you fool&rdquo; in the old TV series &ldquo;The A Team&rdquo;, has decided to try out for the UCF Programming Team. Considering the many talented students at UCF, Mr. T&rsquo;s best chance is to become great at geometry. So, he sought help from Euclid, one of the Fathers of Geometry. Considering the teacher and the student, the obvious place to start is with the letter T!</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25898.%E2%80%85Dot%E2%80%85the%E2%80%85i%E2%80%99s%E2%80%85and%E2%80%85Cross%E2%80%85the%E2%80%85T%E2%80%99s/a037545c.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25898.%E2%80%85Dot%E2%80%85the%E2%80%85i%E2%80%99s%E2%80%85and%E2%80%85Cross%E2%80%85the%E2%80%85T%E2%80%99s/a037545c.png" data-original-src="https://upload.acmicpc.net/c326328e-26b1-4adf-b3c4-e8e184af0643/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 148px; height: 140px; float: right;" />Consider the picture of the letter T to the right. We define four points A, M, B, and C form a T if three conditions holds:</p>

<ol>
	<li>M is the midpoint of AB</li>
	<li>CM = AB, i.e., CM is the same length as AB</li>
	<li>The angles AMC and BMC are 90 degrees.</li>
</ol>

<p>Given a set of points, you are to determine how many groups of four points form a T based on the above definition.</p>

### 입력

<p>The first input line contains an integer, n (1 &le; n &le; 100), indicating the number of test cases to process. Each test case starts with an integer, p (4 &le; p &le; 50), indicating the number of points. Each of the following p input lines provides two real numbers (each between -1000 and 1000, inclusive), indicating (respectively) the x and y coordinates for a point. Assume all points are distinct. Assume that the x and y coordinates in the input will have at most three digits after the decimal point.</p>

### 출력

<p>For each set of points, print &ldquo;Set #n: m&rdquo;, where n indicates the set number starting with 1 and m indicates how many groups of four points form a T. Two groups of four points are considered different if they differ in at least one point. Leave a blank line after the output for each set.</p>

<p>Note/Hint: This problem deals with floating-point numbers and one must be careful about checking for equality of two values. Assume two values are equal if they differ by 10<sup>-6</sup> or less.</p>