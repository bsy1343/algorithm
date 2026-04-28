# [Platinum I] Golf Bot - 10531

[문제 링크](https://www.acmicpc.net/problem/10531)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 4070, 정답: 1928, 맞힌 사람: 1101, 정답 비율: 47.807%

### 분류

수학, 고속 푸리에 변환

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10531.%E2%80%85Golf%E2%80%85Bot/42c3ae79.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10531.%E2%80%85Golf%E2%80%85Bot/42c3ae79.png" data-original-src="https://www.acmicpc.net/upload/images2/golf.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:392px; width:291px" />Do you like golf? I hate it. I hate golf so much that I decided to build the ultimate golf robot, a robot that will never miss a shot. I simply place it over the ball, choose the right direction and distance and, flawlessly, it will strike the ball across the air and into the hole. Golf will never be played again.</p>

<p>Unfortunately, it doesn&rsquo;t work as planned. So, here I am, standing in the green and preparing my first strike when I realize that the distance-selector knob built-in doesn&rsquo;t have all the distance options! Not everything is lost, as I have 2 shots.</p>

<p>Given my current robot, how many holes will I be able to complete in 2 strokes or less?</p>

### 입력

<p>The first line has one integer: N, the number of different distances the Golf Bot can shoot. Each of the following N lines has one integer, k<sub>i</sub>, the distance marked in position i of the knob.</p>

<p>Next line has one integer: M, the number of holes in this course. Each of the following M lines has one integer, d<sub>j</sub>, the distance from Golf Bot to hole j.</p>

### 출력

<p>You should output a single integer, the number of holes Golf Bot will be able to complete. Golf Bot cannot shoot over a hole on purpose and then shoot backwards.</p>

### 제한

<ul>
	<li>1 &le; N, M &le; 200 000</li>
	<li>1 &le; k<sub>i</sub>, d<sub>j</sub> &le; 200 000</li>
</ul>

### 힌트

<p>Golf Bot can shoot 3 different distances (1, 3 and 5) and there are 6 holes in this course at distances 2, 4, 5, 7, 8 and 9. Golf Bot will be able to put the ball in 4 of these:</p>

<ul>
	<li>The 1st hole, at distance 2, can be reached by striking two times a distance of 1.</li>
	<li>The 2nd hole, at distance 4, can be reached by striking with strength 3 and then strength 1 (or vice-versa).</li>
	<li>The 3rd hole can be reached with just one stroke of strength 5.</li>
	<li>The 5th hole can be reached with two strikes of strengths 3 and 5.</li>
</ul>

<p>Holes 4 and 6 can never be reached.</p>