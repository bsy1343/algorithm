# [Silver I] Bricks on the Wall - 14536

[문제 링크](https://www.acmicpc.net/problem/14536)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 38, 맞힌 사람: 31, 정답 비율: 49.206%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Ahmad has <em>n</em> bricks. He wants to build a wall using all bricks. He wants the wall&rsquo;s dimensions to be as small as possible. The thickness of the <em>i</em>-th brick is <em>t<sub>i</sub></em> and its width is equal to <em>w<sub>i</sub></em>. In Ahmad&rsquo;s case, the thickness of each brick is either 1 or 2. All bricks have the same heights.</p>

<p>Ahmad puts the bricks on the wall in the following way. First he select some of the bricks and put them vertically. Then he puts the rest of the bricks <strong>horizontally above</strong> the vertical bricks. The sum of widths of the horizontal bricks must be no more than the total thickness of the vertical bricks. A sample arrangement of the bricks is depicted in the ﬁgure.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/14536.%E2%80%85Bricks%E2%80%85on%E2%80%85the%E2%80%85Wall/02b1db79.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/14536.%E2%80%85Bricks%E2%80%85on%E2%80%85the%E2%80%85Wall/02b1db79.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14536/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:294px; width:291px" /></p>

<p>Help Ahmad to ﬁnd the <strong>minimum total thickness</strong> of the vertical bricks that he can achieve.</p>

### 입력

<p>The ﬁrst line contains an integer <em>T</em>, (1 &le; <em>T</em> &le; 30) which is the number of test cases. For each case, the first line of input is an integer <em>n</em> (the number of bricks), (1 &le; <em>n</em> &le; 100). Each of the next <em>n</em> lines contains two integers <em>t<sub>i</sub></em> and <em>w<sub>i</sub></em> denoting the thickness and width of the <em>i</em>-th brick correspondingly, (1 &le; <em>t<sub>i </sub></em>&le;&nbsp;2, 1 &le; <em>w<sub>i</sub></em> &le; 100).</p>

### 출력

<p>For each test case, o the only line of the output print the minimum total thickness of the vertical bricks that we can achieve.</p>