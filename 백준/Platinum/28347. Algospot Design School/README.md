# [Platinum III] Algospot Design School - 28347

[문제 링크](https://www.acmicpc.net/problem/28347)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 11, 정답 비율: 78.571%

### 분류

기하학, 이분 매칭

### 문제 설명

<blockquote>
<p>&ldquo;Woojoo! Where have you been?&rdquo;</p>

<p>&ldquo;What&rsquo;s the matter, teacher?&rdquo;</p>

<p>&ldquo;I told you that the admissions information on Algospot Design School was out, and that you needed to prepare a portfolio for that. Did you finish drawing it yet?&rdquo;</p>

<p>&ldquo;Yeah, sure. All done, perfectly.&rdquo;</p>

<p>&ldquo;Really? Let me take a look at it.&rdquo;</p>

<p>&ldquo;I forgot to bring it today. I can show you tomorrow.&rdquo;</p>

<p>&ldquo;Are you sure? Don&rsquo;t forget!&rdquo;</p>
</blockquote>

<p>After talking to the teacher, Woojoo rushed to meet her best friend, Bada.</p>

<blockquote>
<p>&ldquo;Hey, Bada! I&rsquo;m screwed!&rdquo;</p>

<p>&ldquo;What&rsquo;s up? Why?&rdquo;</p>

<p>&ldquo;I forgot to prepare a portfolio for Algospot Design School. Do you have any extra one that I can borrow?&rdquo;</p>

<p>&ldquo;Extra ones&hellip; Oh, I have one that I drew for the exhibition the other day. Wait a second&hellip; &rdquo;</p>
</blockquote>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28347.%E2%80%85Algospot%E2%80%85Design%E2%80%85School/0bc5184a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/28347.%E2%80%85Algospot%E2%80%85Design%E2%80%85School/0bc5184a.png" data-original-src="https://upload.acmicpc.net/299e3b78-54c5-4491-8fb5-554545b3f73f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 477px; height: 360px;" /></p>

<p>Bada found her sketchbook and gave it to Woojoo. The book had a lot of drawings, on both front and back of the pages.</p>

<blockquote>
<p>&ldquo;That&rsquo;s a gift for you. You can use however you would like.&rdquo;</p>

<p>&ldquo;Really? Is that OK?&rdquo;</p>

<p>&ldquo;It&rsquo;s my pleasure.&rdquo;</p>
</blockquote>

<p>On the next day, Woojoo brought the sketchbook to the teacher.</p>

<blockquote>
<p>&ldquo;Hmm&hellip; the drawings look good, but why did you on earth draw so many things on a single page? Worse yet, you have drawings on the back, too. I think you would need to cut the drawings out. Try to cut them so that you will be left with the most drawings.&rdquo;</p>
</blockquote>

<p>Here comes your task:</p>

<p>We place a single, square page from the sketchbook on a 2D plane, with two opposite corners at $(0, 0)$ and $(100, 100)$. When you want to cut out a piece of drawing from the page, you have to cut it along the smallest enclosing axis-aligned (i.e. borders are parallel to either $X$ or $Y$ axis) rectangle. You are given coordinates of these rectangles, and which side the drawing is on. Find the maximum number of pieces that can be cut out from the page. Please note that a single piece can only count for up to $1$ drawing even if it contains other drawings on the other side.</p>

### 입력

<p>The input consists of $T$ test cases, each representing a sheet of the sketchbook. The first line of the input contains $T$.</p>

<p>Each test case describes the drawings on the sheet. The first line of the test case contains the number of drawings on both sides of the sheet, $N$ ($1 &le; N &le; 100$).</p>

<p>The following $N$ lines describe the $N$ drawings: the coordinates of the bottom-left corner, the coordinates of the upper-right corner, and its side (<code>F</code> for front, <code>B</code> for back). You can assume that no two drawings on the same page will overlap with each other.</p>

### 출력

<p>For each sheet, output the maximum number of drawings you can cut-out of the sheet.</p>