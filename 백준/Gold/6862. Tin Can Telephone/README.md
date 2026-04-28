# [Gold II] Tin Can Telephone - 6862

[문제 링크](https://www.acmicpc.net/problem/6862)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 15, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

기하학, 선분 교차 판정

### 문제 설명

<p>Romy and Jules have been talking with each other on their cell phones. Unfortunately, their parents dislike each other and have decided that they can no longer call each other. In fact, their parents have taken their cell phones away. So, Romy and Jules must find some other way to communicate. After searching the web for ideas, they have decided to build a &ldquo;tin can&rdquo; telephone.</p>

<p>Simply, a tin can telephone is two empty soup cans attached to each other with a string. To use it, the string must be stretched tight and then one person speaks while the other person listens. It is important that nothing touches the string so that it can vibrate and transfer sound from one can to the other.</p>

<p>To successfully set up a tin can telephone, Romy and Jules are going to need a clear line of sight between their two bedroom windows. To determine if they can run the string between their rooms, they get out a map that uses simple integer coordinates. Now consider the following three situations.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6862.%E2%80%85Tin%E2%80%85Can%E2%80%85Telephone/eb87a62e.png" data-original-src="https://upload.acmicpc.net/2c5b2473-e733-4d93-821c-15460a0343c3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 645px; height: 176px;" /></p>

<p>In these figures, &ldquo;Romy&rdquo; is Romy&rsquo;s window (the grid coordinates 0,0) and &ldquo;Jules&rdquo; is Jules&rsquo; window (grid coordinates 3,3). In the first figure, there is a building between their windows, and it blocks the line of sight between them. In the second figure, the building doesn&rsquo;t block their view and they can successfully set up a tin can phone. In the third figure, a line drawn from Romy&rsquo;s coordinates to Jules&rsquo; coordinates would touch the corner of the building. Since the string cannot touch anything, they cannot set up a tin can telephone and the view is considered as blocked.</p>

### 입력

<p>The input begins with a line containing four integer coordinates representing the locations of Romy&rsquo;s and Jules&rsquo; windows. That is, the input xR yR xJ yJ represents the coordinates (xR, yR) for Romy&rsquo;s window, and the coordinates (xJ, yJ) for Jules&rsquo; window. You may assume that -1000 &le; xR, xJ &le; 1000 and -1000 &le; yR, yJ &le; 1000. The next line contains a single integer, n (0 &le; n &le; 100), identifying the number of buildings that will follow on the next n lines. Each building is on a separate line and begins with an integer specifying the number of corners that the building has. This integer is followed by the integer coordinates of the building&rsquo;s corners, in either clockwise or counter-clockwise order. No building has more than 32 corners. The sample input and output, shown below, corresponds to the first &ldquo;blocked&rdquo; situation described previously.</p>

### 출력

<p>For the input data, output a single number identifying the number of buildings that touch or block the line of sight.</p>