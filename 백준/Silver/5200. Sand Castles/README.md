# [Silver IV] Sand Castles - 5200

[문제 링크](https://www.acmicpc.net/problem/5200)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 33, 맞힌 사람: 29, 정답 비율: 82.857%

### 분류

기하학, 3차원 기하학

### 문제 설명

<p>It is pretty amazing what beautiful constructions one can build out of just sand and a bit of water. In fact, it is so amazing that A.-L. Barabasi has several publications in high-quality scientific journals about it.</p>

<p>We won&rsquo;t be quite as ambitious here. All we want is a few cylindric towers (conveniently formed by little beach buckets) on a nice plain patch of sand, with a little rectangular moat around it. But Ah!, there&rsquo;s a catch. You cannot just steal sand from a neighboring patch, or dispose of excess sand there.<sup>3</sup> That means that if you want a very deep moat relative to the castle, you will probably have to raise the &ldquo;base level&rdquo;, whereas if your mote is shallow, and you have a lot of &ldquo;buildings&rdquo;, then your base level will be lower than on neighboring patches. You are to find out just how many centimeters the base level is raised or lowered.</p>

<p><sup>3</sup>You may think that this is a silly rule. In fact, it sometimes applies to building projects in the real world. One of the constraints when the Getty Center was built was that they were not allowed to add or remove soil from the patch of land. That would explain those weird round towers at the corners &mdash; they are added ornaments to hide excess soil.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of each data set contains numbers w, h, m, d, b. w and h are the width and height of your patch in centimeters (real numbers). m is the width of your moat (thus, m &lt; 1/2 min(h, w)), and d is the depth of the moat, also in centimeters (also real numbers). Assume that the moat is always built at the perimeter of your patch. Finally, the integer number 0 &le; b &le; 100 is the number of &ldquo;buildings&rdquo; you build.</p>

<p>This is followed by b lines, each containing two numbers hi and ri. Here, the number hi is the height of the ith building (or bucket you used), and ri is the radius. You can assume that all buildings are cylindrical &mdash; for our purpose, it makes no difference if they are stacked on top of each other, or built next to each other. (Also, you need not worry about the case that the base area of a building is larger than the remaining area of your patch.)&nbsp;</p>

<p>Here are two pictures, viewed from the top and as a crosscut, illustrating the quantities.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/5200.%E2%80%85Sand%E2%80%85Castles/76360a08.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/5200.%E2%80%85Sand%E2%80%85Castles/76360a08.png" data-original-src="https://www.acmicpc.net/upload/images2/castle.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:252px; width:613px" /></p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the total change in the level of your patch, in centimeters, and rounded to two decimals. (If the level of your patch is lowered, then output it with a negative sign, of course.)</p>