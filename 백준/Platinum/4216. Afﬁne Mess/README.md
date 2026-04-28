# [Platinum III] Afﬁne Mess - 4216

[문제 링크](https://www.acmicpc.net/problem/4216)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

브루트포스 알고리즘, 기하학, 구현

### 문제 설명

<p>Tess L. Ation ran into a little problem last week when she demonstrated the beta version of her new drawing software. On the screen she had an elegant demonstration design that illustrated every feature of her program; it had taken her hours to produce it. She was just putting the ﬁnishing touches on it as a group of potential investors entered the room to see the demonstration.</p>

<p>The presentation went well. Near the end, Tess clicked on a control panel button and told her audience, &ldquo;This is the &lsquo;snap to grid&rsquo; control. It forces control points, such as vertices, to jump to the nearest grid point. Here, let me show you,&rdquo; and she placed three bright red dots on the screen. Each one appeared at the grid point nearest to where she clicked. (&ldquo;Luckily all control points in my demo design were already at integer coordinates. But I will have to remember to delete these three red dots before I save my diagram,&rdquo; she thought to herself.) &ldquo;Now I&rsquo;ll step into the next room and get out of your way so you can discuss the system among yourselves and get a closer look at the screen, but please don&rsquo;t touch anything, since I haven&rsquo;t saved that ﬁle yet.&rdquo;</p>

<p>A few minutes later, the group joined Tess. One of the visitors stepped up to Tess and said, &ldquo;I hope you don&rsquo;t mind, but I wanted to try it myself. Don&rsquo;t worry, I just played with the x-scale and y-scale controls a little bit.&rdquo; The next person said, &ldquo;Sorry if this is a problem, but I really wanted to get a feel for the speed of display, so I just played around with the translation tool.&rdquo; And a third person said, &ldquo;I couldn&rsquo;t resist just one tiny test: I rotated the image just so I could see all of the vertices snap to the nearest grid points after the rotation.&rdquo;</p>

<p>The person who played with the rotation tool remembered going ﬁrst, but the other two could not recall their order. The three remembered only a few details of the changes. The x- and y-scaling factors had been (possibly negative) nonzero integers; the center of scaling was the origin (0,0). The x- and y-translation amounts had been integers. Rotation had been speciﬁed by a point with integer coordinates (x, y) on the perimeter of a square of width 20 centered at the origin (hence, -10 &le; x,y &le; 10 and the absolute value of x or y or both was 10). The tool rotated the drawing around the origin such that the positive x-axis would pass through (x, y) afterwards. Snapping took place after this rotation (coordinates with a fractional part of 0.5 were rounded away from zero).</p>

<p>After they left, Tess looked at her design &ndash; it was completely changed! She had not yet implemented the &ldquo;undo&rdquo; feature, and she had not saved the diagram prior to giving the demonstration. However, the three identical red dots were still there (transformed to other integer grid locations, of course), and Tess could remember the integer coordinates where she had originally placed them. Obviously, someone else might have altered the drawing without saying anything to her, but she could write a program to see if it was possible to reconstruct the sequence of alterations. Can you too?</p>

### 입력

<p>The input contains several test cases. Each test case consists of six pairs of integers x<sub>i</sub> and y<sub>i</sub> (-500 &le; x<sub>i</sub>,y<sub>i</sub> &le; 500 for 1 &le; i &le; 6), three pairs per input line. The ﬁrst three pairs represent the distinct initial locations of the three red dots. The last three pairs represent the distinct ﬁnal locations of the three dots. The indexing of the pairs in each group of three is not signiﬁcant: for example, (x<sub>1</sub>, y<sub>1</sub>) could have been mapped to any of (x<sub>4</sub>, y<sub>4</sub>), (x<sub>5</sub>, y<sub>5</sub>) or (x<sub>6</sub>, y<sub>6</sub>).</p>

<p>The last test case is followed by a line with six zeros.</p>

### 출력

<p>For each test case, display its case number followed by one of the following three messages:</p>

<ul>
	<li>&ldquo;equivalent solutions&rdquo; to indicate that there are one or more valid transformations, and all of them have the same effect on the whole drawing (no matter what the whole drawing looks like).</li>
	<li>&ldquo;inconsistent solutions&rdquo; to indicate that there are several valid transformations, but in general not all of them map the entire drawing in the same way (some drawing is mapped differently by two valid transformations).</li>
	<li>&ldquo;no solution&rdquo; to indicate that neither of the ﬁrst two cases occurs.</li>
</ul>

<p>A valid transformation is a combination of rotation, translation and scaling (or rotation, scaling and translation) which satisﬁes the restrictions described above and maps the initial set of red dots to the ﬁnal set (occupying all three ﬁnal locations).</p>

<p>Follow the format of the sample output.</p>