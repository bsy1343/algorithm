# [Gold V] The Great Wall (Small) - 12321

[문제 링크](https://www.acmicpc.net/problem/12321)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 12, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>You are studying the history of the <a href="http://en.wikipedia.org/wiki/Great_Wall_of_China">Great Wall of China</a>, which was built by the Chinese to protect against military incursions from the North. For the purposes of this problem, the Great Wall stretches from infinity in the East to minus infinity in the West. As this is a lot of distance to cover, the Great Wall was not built at once. Instead, for this problem we assume that the builder used a reactive strategy: whenever a part of the border was attacked successfully, the Wall on this part of the border would be raised to the height sufficient to stop an identical attack in the future.</p>

<p>The north border of China was frequently attacked by nomadic tribes. For the purposes of this problem, we assume that each tribe attacks the border on some interval with some strength <em>S</em>. In order to repel the attack, the Wall must have height <em>S</em> all along the defended interval. If even a short stretch of the Wall is lower than needed, the attack will breach the Wall at this point and succeed. Note that even a successful attack does not damage the Wall. After the attack, every attacked fragment of the Wall that was lower than <em>S</em> is raised to height <em>S</em> &mdash; in other words, the Wall is increased in the minimal way that would have stopped the attack. Note that if two or more attacks happened on the exact same day, the Wall was raised only after they all resolved, and is raised in the minimum way that would stop all of them.</p>

<p>Since nomadic tribes are nomadic, they did not necessarily restrict themselves to a single attack. Instead, they tended to move (either to the East or to the West), and periodically attack the Wall. To simplify the problem, we assume they moved with constant speed and attacked the Wall at constant intervals; moreover we assume that the strength with which a given tribe attacked the Wall changed by a constant amount after each attack (either decreased from attrition, or grew from experience).</p>

<p>Assuming that initially (in 250 BC) the Wall was nonexistent (i.e., of height zero everywhere), and given the full description of all the nomadic tribes that attacked the Wall, determine how many of the attacks were successful.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case begins with a line containing a single integer <strong>N</strong>: the number of the tribes attacking the Wall. <strong>N</strong> lines follow, each describing one tribe. The <strong>i</strong>th line contains eight integers <strong>d</strong><strong><sub>i</sub></strong>, <strong>n</strong><strong><sub>i</sub></strong>, <strong>w</strong><strong><sub>i</sub></strong>, <strong>e</strong><strong><sub>i</sub></strong>, <strong>s</strong><strong><sub>i</sub></strong>, <strong>delta_d</strong><strong><sub>i</sub></strong>, <strong>delta_p</strong><strong><sub>i</sub></strong> and <strong>delta_s</strong><strong><sub>i</sub></strong> separated by spaces, describing a single nomadic tribe:</p>

<p>&nbsp;</p>

<ul>
	<li><strong>d</strong><strong><sub>i</sub></strong> &ndash; the day of the tribe&#39;s first attack (where 1st January, 250BC, is considered day 0)</li>
	<li><strong>n</strong><strong><sub>i</sub></strong> &ndash; the number of attacks from this tribe</li>
	<li><strong>w</strong><strong><sub>i</sub></strong>, <strong>e</strong><strong><sub>i</sub></strong> &ndash; the westmost and eastmost points respectively of the Wall attacked on the first attack</li>
	<li><strong>s</strong><strong><sub>i</sub></strong> &ndash; the strength of the first attack</li>
	<li><strong>delta_d</strong><strong><sub>i</sub></strong> &ndash; the number of days between subsequent attacks by this tribe</li>
	<li><strong>delta_p</strong><strong><sub>i</sub></strong> &ndash; the distance this tribe travels to the east between subsequent attacks (if this is negative, the tribe travels to the west)</li>
	<li><strong>delta_s</strong><strong><sub>i</sub></strong> &ndash; the change in strength between subsequent attacks</li>
</ul>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 20.</li>
	<li>0 &le; <strong>d</strong><strong><sub>i</sub></strong>.</li>
	<li>1 &le; <strong>delta_d</strong><strong><sub>i</sub></strong> &le; 676060.</li>
	<li><strong>d</strong><strong><sub>i</sub></strong> + (<strong>n</strong><strong><sub>i</sub></strong> - 1) * <strong>delta_d</strong><strong><sub>i</sub></strong> &le; 676060.</li>
	<li>1 &le; <strong>s</strong><strong><sub>i</sub></strong> &le; 10<sup>6</sup>.</li>
	<li>-10<sup>5</sup> &le; <strong>delta_s</strong><strong><sub>i</sub></strong> &le; 10<sup>5</sup>.</li>
	<li><strong>s</strong><strong><sub>i</sub></strong> + (<strong>n</strong><strong><sub>i</sub></strong> - 1) * <strong>delta_s</strong><strong><sub>i</sub></strong> &ge; 1.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 10.</span></li>
	<li>1 &le; <strong>n</strong><strong><sub>i</sub></strong> &le; 10.</li>
	<li>-100 &le; <strong>w</strong><strong><sub>i</sub></strong> &lt; <strong>e</strong><strong><sub>i</sub></strong> &le; 100.</li>
	<li>-10 &le; <strong>delta_p</strong><strong><sub>i</sub></strong> &le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the number of attacks that succeed.</p>

### 힌트

<p>In the first case, the first tribe attacks three times: on day 0 it hits the interval [0,2] at height 10, on day 2 it hits [3,5] at height 8 and on day 4 it hits [6,8] at height 6; all three attacks succeed. Then the second tribe attacks three times, each time at height 8 - on day 10 it hits [2,3] (this succeeds, for example at position 2.5, where the Wall has still height 0), on day 17 it hits [4,5] (this fails, the Wall is already of height 8 in the interval [3, 5], which covers [4, 5]), and on day 24 it hits [6,7] (this succeeds, as the Wall there was of height 6).</p>

<p>In the second case there are three tribes, and their attacks intermingle. The sequence is as follows:</p>

<ul>
	<li>On day 0, Tribe 2 attacks [0,1] at height 7 and succeeds.</li>
	<li>On day 1, Tribe 1 attacks [0,5] at height 10, and Tribe 2 attacks [2,3] at height 9. Both attacks succeed (as they were simultaneous, the Wall built after the attack of the first tribe isn&#39;t there in time to stop the second tribe).</li>
	<li>On day 2, Tribe 2 attacks [4,5] at height 11 and succeeds (the Wall there was at height 10).</li>
	<li>On day 3, Tribe 1 attacks [8,13] at height 10 and succeeds. Simultaneously, Tribe 3 attacks [0,5] at height 1 and fails (there&#39;s a Wall of heights 10 and 11 there).</li>
	<li>On day 4 Tribe 3 attacks [4,9] at height 1 and succeeds (there was no Wall between 5 and 8).</li>
	<li>Finally, on day 5 Tribe 3 attacks [8,13] at height 1 and fails (since a Wall of height 10 is there).</li>
</ul>