# [Platinum II] Burns’ Rods - 7646

[문제 링크](https://www.acmicpc.net/problem/7646)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 6, 맞힌 사람: 4, 정답 비율: 30.769%

### 분류

구현, 애드 혹, 많은 조건 분기

### 문제 설명

<p>Montgomery Burns has recently acquired a rod with dimensions 1 &times; 2 &times; N, where 3 &le; N &le; 100,000. The mechanics of Burns&rsquo; Rod resemble those of a standard 3 &times; 3 &times; 3 Rubik&rsquo;s Cube; in fact, one can twist it around in N + 1 different ways as follows (all twists must be by multiples of 180 degrees):</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7646.%E2%80%85Burns%E2%80%99%E2%80%85Rods/20f3b664.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7646/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:173px; width:625px" /></p>

<p>The long length of the rod has made it particularly useful for a variety of essential day-to-day errands: it has successfully served Burns as a back-scratcher, TV remote replacement and as a means to prod one Waylon Smithers. However, during its most recent stint as a fishing rod, it fell into a pond when Burns was unable to sustain the weight of a particularly hungry goldfish. Unfortunately, this meant the coloured labels peeled off, leaving an unlabelled Rod, 6N +4 sticky labels and a very confused goldfish splashing around in the pond.</p>

<p>Smithers, as dutiful as ever, retrieved the sticky labels and pasted them back on the Rod. Due to Smithers&rsquo; haste to reaffix the labels before the adhesive completely wore off, however, the labels were randomly placed back on! Burns, as exceedingly reasonable as he is, has become wary of Smithers&rsquo; performance, and is concerned that the Rod may no longer be solvable.</p>

<p>You are Lisa Simpson, and Burns has come desperately seeking your help. Can you determine if the Rod is solvable? Note that the Rod is said to be solvable if there is a sequence of twists, as described above, such that any two labels are the same color if and only if they&rsquo;re on the same face of the Rod. Moreover, cheap manufacturing processes mean that the labels could have changed color while floating around in the pond.</p>

### 입력

<p>The input consists of several test cases. The first line of each test case contains a single integer N, 3 &le; N &le; 100,000, denoting the length of the Rod. Following this are N +2 lines, describing the affixed colors&mdash;assume the Rod lies flat, pointing away from you:</p>

<ul>
	<li>The first line has two space-separated integers, a<sub>1</sub> (your left) and a<sub>2</sub> (your right), denoting the colors of the two labels closest to you and facing you.</li>
	<li>The second line has two space-separated integers, b<sub>1</sub> (your left) and b<sub>2</sub> (your right), denoting the colors of the two labels furthest from you and facing away.</li>
	<li>The (2 + k)-th line has six space-separated integers, c<sub>1</sub>, c<sub>2</sub>, c<sub>3</sub>, c<sub>4</sub>, c<sub>5</sub> and c<sub>6</sub>, denoting the colors affixed to the two blocks at position k from you&mdash;the colors are ordered clockwise, proceeding in this order: top left, top right, right, bottom right, bottom left, left.</li>
</ul>

<p>Each color is a number between 0 and 5, inclusive. Input is followed by a single line with N = 0, which should not be processed.</p>

### 출력

<p>For each test case, print out a single line that contains the word &ldquo;solvable&rdquo; (no quotes) if the rod is solvable, or &ldquo;unsolvable&rdquo; otherwise.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7646.%E2%80%85Burns%E2%80%99%E2%80%85Rods/557bfb84.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7646/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:283px; width:299px" /></p>