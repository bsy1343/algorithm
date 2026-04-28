# [Gold II] Traveling Monk - 24802

[문제 링크](https://www.acmicpc.net/problem/24802)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 13, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

수학, 브루트포스 알고리즘, 기하학, 이분 탐색, 스위핑, 매개 변수 탐색, 두 포인터, 선분 교차 판정

### 문제 설명

<p>The following puzzle was popularized by Martin Gardner&#39;s book &quot;My Best Mathematical and Logic Puzzles,&quot; although it appears first in the monograph &quot;On Problem-Solving&quot; by the Gestalt psychologist Karl Dunker.</p>

<blockquote>
<p>One morning, exactly at sunrise, a Buddhist monk began to climb a tall mountain. The narrow path, no more than a foot or two wide, spiraled around the mountain to a glittering temple at the summit.</p>

<p>The monk ascended the path at varying rates of speed, stopping many times along the way to rest and eat the dried fruit he carried with him. He reached the temple shortly before sunset. After several days of fasting and meditation he began his journey back along the same path, starting at sunrise and again walking at variable speeds with many pauses along the way. &nbsp;His average speed descending was, of course, greater than his average climbing speed.</p>

<p>Prove that there is a spot along the path that the monk will occupy on both trips at precisely the same time of day!</p>
</blockquote>

<p>You can probably see why this is true - but can you write a program that computes the time at which the monk will be at the same spot during his ascent and descent?</p>

### 입력

<p>The input consists of a single test case. The first line contains two integers $a$ ($0 &lt; a \le 5\,000$) and $d$ ($0 &lt; d \le 5\,000$) denoting the number of segments during the ascent and descent, respectively. This is followed by $a$ lines, each containing two integers $h$ ($0 \le h \le 1\,000$) and $t$ ($0 &lt; t \le 100$) denoting the positive change in elevation ($h$) the monk gained during this segment and the time it took ($t$). &nbsp;If the monk rests and eats during a segment, $h$ will be $0$.</p>

<p>This is followed by $d$ lines, each containing two integers $h$ ($0 \le h \le 1\,000$) and $t$ ($0 &lt; t \le 100$) denoting the change in elevation ($h$) the monk descended during this segment and the time it took ($t$). &nbsp;If the monk rests and eats during a segment, $h$ will be $0$.</p>

### 출력

<p>Output a single floating point number, the earliest point in time at which the monk occupies the same spot during his climb and his descent. &nbsp;The monk starts his ascent and his descent at time $0$ on both days.</p>

<p>Your answer will be considered correct if its absolute or relative error does not exceed $10^{-5}$.</p>