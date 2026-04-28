# [Gold IV] C.S.I.: P15 - 11167

[문제 링크](https://www.acmicpc.net/problem/11167)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 45, 정답: 13, 맞힌 사람: 12, 정답 비율: 27.907%

### 분류

그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>You have been cast as the computer genius hero-of-the-day for the season finale of the show C.S.I.: P15 (coming this fall). Somewhat unsurprisingly, there is that camera feed that needs to be analyzed. The camera in question is recording pictures in HD-9000 quality with extra regression and the stream is then internally matched by a re-inverted isomorphic bit coefficient matrix, then plasma shifted five times for good measure. You then view the feed through Netscape Navigator 4 Platinum Edition. (Note that &ldquo;internally&rdquo; is just fancy talk for &ldquo;inside the camera&rdquo;.)</p>

<p>Unfortunately, a saboteur turned on ASCII mode on the camera and set the camera in picture burst mode. So now all you have is a bunch of still ASCII images. And now, for reasons that will be revealed later in the show, you are to design and implement a deterministic algorithm for counting the number of flowers and birds in a given still image. The pictures always include the ground, which will show up as a contiguous row of &rsquo;<code>=</code>&rsquo; characters. The ground will always be the bottom-most row of &ldquo;ASCII pixels&rdquo;. There will never be anything else on that row (though, on one of the pictures taken before the sabotage there is a stray electron that a someone will accidentally find by zooming in too far, but that is for a later episode).</p>

<p>Air is marked in the feed as a &rsquo;.&rsquo; (a dot). The ground is the last line of the feed, and it looks like this: &rsquo;<code>===========</code>&rsquo;. A flower is defined as any 8-connected component (meaning ...) which consists of characters from the set {&rsquo;<code>|</code>&rsquo;, &rsquo;<code>/</code>&rsquo;, &rsquo;<code>\</code>&rsquo;, &rsquo;<code>-</code>&rsquo;, &rsquo;<code>@</code>&rsquo;}, and which is also connected to the ground. A bird is an occurence of &rsquo;<code>/\/\</code>&rsquo;, surrounded exclusively by air, or by the edges of the image. So if you see something that looks like a bird on the ground, it is a flower (possibly an ex-parrot, but that is also a flower for our purposes).</p>

### 입력

<p>The first line of the input consists of a single integer T, the number of test cases. Each of the following T cases then begins with a line of two integers separated by a space, the height H and width W, and ends with H lines describing the picture. Each line of the picture has exactly W characters. All lines but the last consist of only the following characters: {&rsquo;<code>.</code>&rsquo;, &rsquo;<code>|</code>&rsquo;, &rsquo;<code>/</code>&rsquo;, &rsquo;<code>\</code>&rsquo;, &rsquo;<code>-</code>&rsquo;, &rsquo;<code>@</code>&rsquo;}. The last line consists of &rsquo;<code>=</code>&rsquo; characters only.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>0 &lt; W &le; 30</li>
	<li>0 &lt; H &le; 30</li>
</ul>

### 출력

<p>For each test case, output two lines. If the number of flowers is F and the number of birds is B, the output should read</p>

<pre>
Flowers: F
Birds: B</pre>