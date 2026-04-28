# [Platinum I] Busy Board - 16996

[문제 링크](https://www.acmicpc.net/problem/16996)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 26, 맞힌 사람: 21, 정답 비율: 46.667%

### 분류

많은 조건 분기

### 문제 설명

<p>Remember the busy boards for toddlers that have an array of holes into which to hammer pegs of various shapes? There&rsquo;s a new, electronic version. The board consists of a 2D grid of pegs. Each peg on the board can be either up or down, but not both simultaneously. You can pick any peg that is currently up, and &ldquo;hammer&rdquo; it down. This will push that peg down, and also raise all of the other pegs in its row, and its column, regardless of their current state. You cannot &ldquo;hammer&rdquo; a peg that is down (well, maybe you can, but it will have no effect). Those poor kids will never get all the pegs down at one time!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16996.%E2%80%85Busy%E2%80%85Board/1f8528ed.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16996.%E2%80%85Busy%E2%80%85Board/1f8528ed.png" data-original-src="https://upload.acmicpc.net/ddde8070-5512-46ad-bca2-56a99bdd0bfc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 195px; height: 100px;" /></p>

<p>This example shows what happens when the top right peg is &ldquo;hammered.&rdquo; (◦ = up, &bull; = down)</p>

<p>A substitute teacher wants to challenge her class. She uses the &ldquo;Teacher Mode&rdquo; to set up the board in a particular configuration, and then asks her students to see if they can get the board to a second configuration by hammering some (perhaps none) of the pegs.</p>

<p>That may be too tough of a problem for toddlers, but maybe you can handle it.</p>

### 입력

<p>Each test case will begin with a line with two space-separated integers r and c (1 &le; r, c &le; 1,000), which are the dimensions of the board.</p>

<p>Each of the next r lines will have exactly c characters, consisting only of capital &lsquo;O&rsquo; (representing a peg that is up), capital &lsquo;X&rsquo; (representing a peg that is down), and no spaces or other characters. This is the starting configuration.</p>

<p>Following this, each of the next r lines will have exactly c characters, consisting only of capital &lsquo;O&rsquo; (representing a peg that is up), capital &lsquo;X&rsquo; (representing a peg that is down), and no spaces or other characters. This is the target configuration.</p>

### 출력

<p>Output a single integer, 1 if it is possible to reach the target configuration from the starting configuration, and 0 if it is impossible.</p>