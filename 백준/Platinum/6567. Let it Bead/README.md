# [Platinum V] Let it Bead - 6567

[문제 링크](https://www.acmicpc.net/problem/6567)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 177, 정답: 142, 맞힌 사람: 129, 정답 비율: 86.000%

### 분류

수학, 브루트포스 알고리즘, 조합론, 번사이드 보조정리

### 문제 설명

<p>&quot;Let it Bead&quot; company is located upstairs at 700 Cannery Row in Monterey, CA. As you can deduce from the company name, their business is beads. Their PR department found out that customers are interested in buying colored bracelets. However, over 90 percent of the target audience insists that the bracelets be unique. (Just imagine what happened if two women showed up at the same party wearing identical bracelets!) It&#39;s a good thing that bracelets can have different lengths and need not be made of beads of one color. Help the boss estimating maximum profit by calculating how many different bracelets can be produced.</p>

<p>A bracelet is a ring-like sequence of <em>s</em> beads each of which can have one of <em>c</em> distinct colors. The ring is closed, i.e. has no beginning or end, and has no direction. Assume an unlimited supply of beads of each color. For different values of <em>s</em> and <em>c</em>, calculate the number of different bracelets that can be made.</p>

### 입력

<p>Every line of the input file defines a test case and contains two integers: the number of available colors <em>c</em> followed by the length of the bracelets <em>s</em>. Input is terminated by <em>c=s=0</em>. Otherwise, both are positive, and, due to technical difficulties in the bracelet-fabrication-machine, <em>cs&lt;=32</em>, i.e. their product does not exceed 32.</p>

### 출력

<p>For each test case output on a single line the number of unique bracelets. The figure below shows the 8 different bracelets that can be made with 2 colors and 5 beads.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6567.%E2%80%85Let%E2%80%85it%E2%80%85Bead/e783e3c7.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6567.%E2%80%85Let%E2%80%85it%E2%80%85Bead/e783e3c7.gif" data-original-src="https://www.acmicpc.net/upload/images2/bead.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:188px; width:376px" /></p>