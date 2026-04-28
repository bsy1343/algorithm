# [Platinum V] Trick Shot - 11770

[문제 링크](https://www.acmicpc.net/problem/11770)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

기하학

### 문제 설명

<p>Your game development studio, Ad Hoc Entertainment, is currently working on a billiards-based app they&rsquo;re calling Pool Shark. Players face a sequence of increasingly devious pool puzzles in which they need to carefully position and aim a single billiards shot to sink multiple pool balls.</p>

<p>You&rsquo;ve just done the first round of user testing and the feedback is terrible &mdash; players complain that the physics of your pool game is neither fun nor intuitive. After digging into it, you realize that the problem isn&rsquo;t that your physics code is bad, but rather that most people just don&rsquo;t have much intuition about how physics works. Fortunately, no one requires your physics to be realistic. After this liberating realization, your team experiments with a few models, eventually settling on the following rule for how to resolve pool-ball collisions:</p>

<p>When a moving pool ball B hits a stationary ball A, A begins moving in the direction given by the vector from the center of B to the center of A at the time of the collision. Ball B&rsquo;s new velocity vector is B&rsquo;s original vector reflected across A&rsquo;s new vector (Figure H.1). Note that A&rsquo;s resulting vector is what real physics predicts, but B&rsquo;s is not (unless A is glued to the table or has infinite mass). For the purposes of this problem, the speed at which the balls move is irrelevant.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11770.%E2%80%85Trick%E2%80%85Shot/700e1fea.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11770/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:251px; width:274px" /></p>

<p style="text-align: center;">Figure H.1</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11770.%E2%80%85Trick%E2%80%85Shot/4b5705c4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11770/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:308px; width:260px" /></p>

<p style="text-align: center;">Figure H.2</p>

<p>This actually allows for more interesting challenges, but requires new code to determine whether a particular level is feasible. You&rsquo;ve been tasked with solving a very particular case:</p>

<p>Three balls labelled 1, 2, and 3 are placed on a table with width w and length l (Figure H.2). The player must place the cue ball somewhere on a dashed line lying h units above the bottom edge of the table. The goal is to pick a distance d from the left side, and an angle &theta; such that when the cue ball is shot, the following events happen:</p>

<ul>
	<li>The cue ball strikes ball 1, and then ricochets into ball 2, sinking ball 2 in the top left hole.</li>
	<li>Ball 1, having been struck by the cue ball, hits ball 3, sinking ball 3 in the top right hole.</li>
</ul>

<p>For simplicity, assume that sinking a ball requires the center of the ball to pass directly over the center of the hole. Further assume that the table has no sides &mdash; a ball that goes out of the w-by-l region simply falls into a digital abyss &mdash; and thus you don&rsquo;t need to worry about balls colliding with the table itself.</p>

<p>You need to write a program that, given values for w, l, h, the position of balls 1&ndash;3, and the radius r of the balls, determines whether the trick shot is possible.</p>

### 입력

<p>The input begins with a line containing two positive integers w l, the width and length of the pool table, where w, l &le; 120. The left hole is at location (0, l) and the right hole is at location (w, l).</p>

<p>The next line will contain 8 positive integers r x1 y1 x2 y2 x3 y3 h, where r &le; 5 is the radius of all the balls (including the cue ball), xi yi is the location of ball i, 1 &le; i &le; 3, and h is the distance the dashed line is from the front of the pool table (see the figure above, where r &le; h &le; (1/2)l). No two balls will ever overlap, though they may touch at a point, and all balls will lie between the dashed line and the back of the table. All balls will lie completely on the table, and the cue ball must also lie completely on the table (otherwise the shot is impossible).</p>

### 출력

<p>For each test case, display the distance d to place the ball on the dashed line and the angle &theta; to shoot the ball, or the word &ldquo;impossible&rdquo; if the trick shot cannot be done. Output &theta; in degrees, and round both d and &theta; to the nearest hundredth. Always show two digits after the decimal point, even if the digits are zero.</p>