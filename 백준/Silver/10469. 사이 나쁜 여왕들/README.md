# [Silver V] 사이 나쁜 여왕들 - 10469

[문제 링크](https://www.acmicpc.net/problem/10469)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 1271, 정답: 443, 맞힌 사람: 390, 정답 비율: 37.500%

### 분류

구현

### 문제 설명

<p>체스에서 여왕은 강력한 말이다. 여왕은 가로, 세로, 그리고 대각선으로 제한없이 이동하여 상대를 공격할 수 있다.</p>

<p>사이나쁜 여왕 퀴즈는 여덟 여왕을 8x8 체스판 위에 배치하는데, 아무도 서로 공격할 수 없도록 배치하는 퀴즈다. 가운데 그림은 올바르지 않은 풀이인데, 두 여왕이 대각선을 통해서 서로 공격할 수 있기 때문이다. 오른쪽 그림은 올바른 해법이다. 우리는 체스판과 여왕의 배치가 주어질 때 해당 배치가 올바른 사이나쁜 여왕 퀴즈의 해법인지 아닌지를 판단해야 한다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10469.%E2%80%85%EC%82%AC%EC%9D%B4%E2%80%85%EB%82%98%EC%81%9C%E2%80%85%EC%97%AC%EC%99%95%EB%93%A4/2b62a883.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/10469.%E2%80%85%EC%82%AC%EC%9D%B4%E2%80%85%EB%82%98%EC%81%9C%E2%80%85%EC%97%AC%EC%99%95%EB%93%A4/2b62a883.png" data-original-src="https://www.acmicpc.net/upload/images2/eightqueens.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:156px; width:437px" /></p>

### 입력

<p>입력은 하나의 체스판을 8줄에 걸쳐 줄마다 8개의 문자로 나타낸다.</p>

<p>각 문자는 &#39;.&#39; 혹은 &#39;*&#39; 이며 &#39;.&#39;은 빈 칸을, &#39;*&#39;은 여왕이 있음을 나타낸다.</p>

### 출력

<p>한 줄에 걸쳐 올바른 해법일 경우 &quot;valid&quot;, 올바르지 않은 해법일 경우 &quot;invalid&quot;를 출력한다.</p>