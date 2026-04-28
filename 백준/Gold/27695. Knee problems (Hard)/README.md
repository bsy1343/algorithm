# [Gold II] Knee problems (Hard) - 27695

[문제 링크](https://www.acmicpc.net/problem/27695)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 13, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You wander through a dark dungeon. All around you there are doors of different shapes and colors. You pick one, open it and enter.</p>

<p>&ldquo;I knew you would come,&rdquo; said a voice in the dark. You come closer and see an old man with a long white beard sitting on the floor.</p>

<p>&ldquo;I used to be a problem solver like you,&rdquo; he says, &ldquo;but then I took an arrow in the knee.&rdquo;</p>

<p>&ldquo;Seriously?&rdquo; you ask him.</p>

<p>&ldquo;Well&hellip; not really. It&rsquo;s just what all the kids were saying the last time I saw daylight.&rdquo;</p>

<p>&ldquo;So what happened to you?&rdquo; you ask and sit beside him.</p>

<p>&ldquo;The truth is, I destroyed my kneecaps on the stairs. When I was younger, I did a lot of programming contests. And in one of them was a really nasty task. I had to determine the number of ways in which one can go up and down a staircase with n steps. Of course, there were some constraints: when going up, you can take two steps at a time, and when going down, you can take up to four steps at once.&rdquo;</p>

<p>He sighs deeply. &ldquo;I had no idea how to solve the task, so I found a staircase and attempted to try every possibility. But there were so many of them that I overloaded my knees and now I can&rsquo;t even walk. So I&rsquo;m sitting here and still wondering about a solution for that problem. Can you help me to finally put a close on this?&rdquo;</p>

<p>The staircase consists of n steps. Count the ways of going up and then down the staircase, given the following constraints:</p>

<ul>
	<li>On the way up, you can take either 1 or 2 steps at a time.</li>
	<li>On the way down, you can take 1, 2, 3, or 4 steps at a time.</li>
</ul>

<p>As the actual number of ways can be huge, compute the remainder it gives when divided by 10<sup>9</sup> + 9.</p>

<p>The staircase consists of n steps. Count all ways of going up and then down the staircase, given the following constraints:</p>

<ul>
	<li>On the way up, you can take either 1 or 2 steps at a time.</li>
	<li>On the way down, you can take 1, 2, 3, or 4 steps at a time.</li>
	<li>On the way down, you can only walk on the steps you used on the way up.</li>
</ul>

<p>Again, your task is to compute the number of valid paths modulo 10<sup>9</sup> + 9.</p>

<p>In the ﬁgure above, the red path is not valid for this subproblem: on the way down we walk on step 4, which was not used on the way up. The blue path (0 &rarr; 2 &rarr; 4 &rarr; 5 &rarr; 2 &rarr; 0) is valid.</p>

### 입력

<p>The first line of input contains one integer number t specifying number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case consists of a single line with the integer n (1 &le; n &le; 100,000) &ndash; the number of steps.</p>

### 출력

<p>For each test case print a single line with one integer &ndash; the number of valid paths modulo 10<sup>9</sup> + 9.</p>