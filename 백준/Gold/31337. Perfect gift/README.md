# [Gold II] Perfect gift - 31337

[문제 링크](https://www.acmicpc.net/problem/31337)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

수학

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31337.%E2%80%85Perfect%E2%80%85gift/d86192be.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31337.%E2%80%85Perfect%E2%80%85gift/d86192be.png" data-original-src="https://upload.acmicpc.net/174179be-f349-4256-bb65-2580a76750e8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 117px; float: right;" />Taja prepares a present for the birthday. As you might know, the best present is the one handcrafted by yourself. Recently she learnt cross-stitching and decided to make use of this skill.</p>

<p>At home she only managed to find a canvas, which already had two crosses stitched on it. Don&#39;t panic --- you can always complement it to the full picture. She had little experience, that&#39;s why she chose simple but nevertheless beautiful picture, which is parallelepiped. She wants to finish the present as soon as possible, thus number of new cross-stitches should be <strong>the least possible</strong>.</p>

<p>Parallelepiped on the <strong>infinite</strong> grid is drawn like this.</p>

<p>Let&#39;s draw a rectangle $ABCD$ with its upper left corner at $A$ and lower right corner at $C$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31337.%E2%80%85Perfect%E2%80%85gift/8ed820a2.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31337.%E2%80%85Perfect%E2%80%85gift/8ed820a2.png" data-original-src="https://upload.acmicpc.net/5f1b129b-1d80-41f9-9de5-ae4c2ce2491b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 122px; height: 123px;" /></p>

<p>Then draw segments of equal length towards up-right from $A$, $B$ and $C$ --- with ends at $E$, $F$, $G$ correspondingly. Then add segments $EF$ and $FG$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31337.%E2%80%85Perfect%E2%80%85gift/d9ad427a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31337.%E2%80%85Perfect%E2%80%85gift/d9ad427a.png" data-original-src="https://upload.acmicpc.net/2c275535-47f9-412f-ab81-a3a2271f31f6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 122px; height: 122px;" /></p>

<p>All edges of the parallelepiped should be <strong>at least $3$ cells</strong> long.</p>

### 입력

<p>First line of the input contains two integers $x_1$ and $y_1$ --- coordinates of the first cross-stitch. Second line contains coordinates of second cross: $x_2$, $y_2$. Coordinates of the first cross-stitches are different. Axis $OX$ is directed from left to right, and axis $OY$ --- from the bottom to the top. All numbers are within range $[0, 10^9]$.</p>

### 출력

<p>Output should contain single number --- <strong>the least</strong> amount of required cross-stitches.</p>

### 힌트

<p>This pictures correspond to the samples:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31337.%E2%80%85Perfect%E2%80%85gift/0917f95f.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31337.%E2%80%85Perfect%E2%80%85gift/0917f95f.png" data-original-src="https://upload.acmicpc.net/6cf69e1a-a29e-49ba-92c1-3e5efd9ea9b6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 122px; height: 252px;" /></p>